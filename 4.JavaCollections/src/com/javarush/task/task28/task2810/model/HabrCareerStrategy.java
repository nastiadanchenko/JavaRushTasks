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

public class HabrCareerStrategy implements Strategy {

    private static final String URL_FORMAT = "https://career.habr.com/vacancies?q=java+%s&page=%d";

    @Override
    public List<Vacancy> getVacancies(String searchString) {
        List<Vacancy> resultVacancies = new  ArrayList<>();
        Document doc = null;
        int page = 0;

        while (true) {
            try {
                doc = getDocument(searchString, page);
            } catch (HttpStatusException e) {
                return resultVacancies;
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (doc == null) return null;
            Elements vacanciesListHTML = doc.getElementsByClass("job");

            if (vacanciesListHTML == null || vacanciesListHTML.isEmpty()) break;

            for (Element elem : vacanciesListHTML
            ) {
                if (elem == null) break;

                Element title = elem.getElementsByClass("title").first();
                Element salary = elem.getElementsByClass("count").first();
                Element city = elem.getElementsByClass("location").first();
                Element companyName = elem.getElementsByClass("company_name").first();


                Vacancy vacancy = new Vacancy();
                vacancy.setTitle(title != null ? title.text() : "");
                vacancy.setSalary(salary != null ? salary.text() : "");
                vacancy.setCity(city != null ? city.text() : "");
                vacancy.setSiteName(URL_FORMAT);
                vacancy.setCompanyName(companyName != null ? companyName.text() : "");
                vacancy.setUrl("https://career.habr.com" + elem.select("a[class=job_icon]").attr("href"));

                resultVacancies.add(vacancy);
            }

            page++;
          //  System.out.print(page + "\t");
        }

        return resultVacancies;
    }



    protected Document getDocument(String searchString, int page) throws IOException {
        return Jsoup.connect(String.format(URL_FORMAT, searchString, page))
                .userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36")
                .referrer("https://career.habr.com")
                .get();

    }
}