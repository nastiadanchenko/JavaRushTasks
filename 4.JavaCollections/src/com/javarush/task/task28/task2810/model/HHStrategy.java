package com.javarush.task.task28.task2810.model;

import com.javarush.task.task28.task2810.vo.Vacancy;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HHStrategy implements Strategy {
 private static final String URL_FORMAT = "http://hh.ru/search/vacancy?text=java+%s&page=%d";

  private static String string = String.format(URL_FORMAT, "Kiev", 3);

 public static void main(String[] args) {

  System.out.println(string);
  HHStrategy hh = new HHStrategy();
  hh.getVacancies("java");
 }

 @Override
 public List<Vacancy> getVacancies(String searchString) {
  try {
   Document document = Jsoup.connect(String.format(URL_FORMAT, "MyTown", 0))
           .userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36")
           .referrer("http://hh.ru/")
           .get();
   System.out.println(document.html());
  } catch (IOException e) {
   e.printStackTrace();
  }
  return new ArrayList<>();
 }
}
