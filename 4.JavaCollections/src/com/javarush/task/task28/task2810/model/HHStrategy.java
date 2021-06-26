package com.javarush.task.task28.task2810.model;

import com.javarush.task.task28.task2810.vo.Vacancy;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HHStrategy implements Strategy {

    //  private static final String URL_FORMAT = "http://hh.ua/search/vacancy?text=java+%s&page=%d";
    //   private static final String URL_FORMAT = "https://javarush.ru/testdata/big28data.html";
    private static final String URL_FORMAT = "https://hh.ru/search/vacancy?text=java+%s&page=%d";


    private static String string = String.format(URL_FORMAT, "Kiev", 3);

    public static void main(String[] args) {

        System.out.println(string);
        HHStrategy hh = new HHStrategy();
        hh.getVacancies("java");
    }

    @Override
    public List<Vacancy> getVacancies(String searchString) {
        List<Vacancy> allVacancies = new ArrayList<>();
        Document document = null;
        int page = 0;

        while (true) {
            try {
                document = getDocument(searchString, page);
            } catch (HttpStatusException e) {
                return allVacancies;
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (document == null) return null;
            Elements vacanciesListHTML = document.getElementsByAttributeValue("data-qa", "vacancy-serp__vacancy");

            if (vacanciesListHTML == null || vacanciesListHTML.isEmpty()) break;

            for (Element element : vacanciesListHTML
            ) {
                if (element == null) break;

                Element title = element.getElementsByAttributeValue("data-qa", "vacancy-serp__vacancy-title").first();
                Element salary = element.getElementsByAttributeValue("data-qa", "vacancy-serp__vacancy-compensation").first();
                Element city = element.getElementsByAttributeValue("data-qa", "vacancy-serp__vacancy-address").first();
                Element companyName = element.getElementsByAttributeValue("data-qa", "vacancy-serp__vacancy-employer").first();

                String urlPage = element.getElementsByAttributeValueContaining("data-qa", "title").attr("href");


                Vacancy vacancy = new Vacancy();
                vacancy.setSiteName("hh.ru");
                vacancy.setTitle(title != null ? title.text() : "");
                vacancy.setUrl(title != null ? title.attr("href") : "");
                // vacancy.setUrl(urlPage);
                vacancy.setCity(city != null ? city.text() : "");
                vacancy.setCompanyName(companyName != null ? companyName.text() : "");
                vacancy.setSalary(salary != null ? salary.text() : "");

                allVacancies.add(vacancy);
            }

            page++;
          /*  if (page == 1) {
                return allVacancies;
            }*/
            //     System.out.println(page+"\t");
        }

        return allVacancies;

    }

    protected Document getDocument(String searchString, int page) throws IOException {
        return Jsoup.connect(String.format(URL_FORMAT, searchString, page))
                .userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36")
                .referrer("https://hh.ru/")
                .get();


    }
}
