package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // дурацкое решение, котороне не компилируется
        FileInputStream inputStream = new FileInputStream(args[0]); // Это -"Создай поток чтения из файла, который приходит первым параметром в main"

        byte[] bytes = new byte[inputStream.available()];

        int count = inputStream.read(bytes);
        inputStream.close();

        int counter = 0;

        for (byte a : bytes) {
            if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {
                counter++;
            }
        }
        System.out.println(counter);
        // красивое рабочее решение, которое не пропустил валидатор
       /* FileInputStream fileReader = new FileInputStream( "C:\\Users\\User\\Desktop\\test.txt");
        int count = 0;
        byte b = 0;
            while ( (b = (byte) fileReader.read())!=-1){
            if (('a' <= b && b <= 'z') || ('A' <= b && b <= 'Z')){
                count++;}}
            System.out.println(count);
            fileReader.close();*/

    }
}
