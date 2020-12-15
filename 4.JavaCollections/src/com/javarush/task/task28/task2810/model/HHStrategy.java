package com.javarush.task.task28.task2810.model;

import com.javarush.task.task28.task2810.vo.Vacancy;

import java.util.List;

public class HHStrategy implements Strategy {
 private static final String URL_FORMAT = "http://hh.ru/search/vacancy?text=java+%s&page=%d";

  private static String string = String.format(URL_FORMAT, "Kiev", 3);

 public static void main(String[] args) {
  System.out.println(string);
 }

 @Override
 public List<Vacancy> getVacancies(String searchString) {
  return null;
 }
}
