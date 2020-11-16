package com.javarush.task.task32.task3204;



import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.regex.Pattern;

/* 
Генератор паролей
*/

public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        ByteArrayOutputStream password = new ByteArrayOutputStream();
        StringBuilder sb = new StringBuilder();
        String s="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";
        while (true){
            for (int i = 0; i < 8; i++) {
                sb.append((char) (Math.random() * 127));
            }
            if (Pattern.matches(s,sb)){
                try {
                    password.write(sb.toString().getBytes());
                    return password;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else sb = new StringBuilder();
        }
    }
}
