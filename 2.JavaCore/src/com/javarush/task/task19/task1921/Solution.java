package com.javarush.task.task19.task1921;

import javax.xml.crypto.Data;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {
        String fileName = args[0];
        String name = "";
        int year = 0;
        int month = 0;
        int day = 0;
        try ( BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.ready()) {
                String[] strings = reader.readLine().split(" ");
                year = Integer.parseInt(strings[strings.length - 1]);
                month = Integer.parseInt(strings[strings.length - 2]);
                day = Integer.parseInt(strings[strings.length - 3]);
                Date format = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH).parse(day + " " + month + " " + year);
                if (strings.length == 4) {
                    name = strings[0];
                    PEOPLE.add(new Person(name, format));
                } else if (strings.length == 5) {
                    name = strings[0] + " " + strings[1];
                    PEOPLE.add(new Person(name, format));
                } else if (strings.length == 6) {
                    name = strings[0] + " " + strings[1] + " " + strings[2];
                    PEOPLE.add(new Person(name, format));
                }
            }
            }catch(IOException | ParseException e){
                e.printStackTrace();
            }

    }

}
