package com.javarush.task.task19.task1904;

/* 
И еще один адаптер
*/

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String[] array = fileScanner.nextLine().split(" ",4);
            SimpleDateFormat date = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            String d = array[3];
            Date datef = date.parse(d);
            String first = array[1];
            String middleName = array[2];
            String lastName = array [0];
            return new Person(first,middleName,lastName,datef);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }

}
