package com.javarush.task.task09.task0922;

/* 
Какое сегодня число?
*/

import javafx.scene.input.DataFormat;

import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        Date date;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-d");
        date = dateFormat.parse(string);
        SimpleDateFormat newDate = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
        System.out.println(newDate.format(date).toUpperCase());
    }
}
