package com.javarush.task.task18.task1803;

/* 
Самые частые байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        try (FileInputStream inputStream = new FileInputStream(string)) {
            byte[] fileInArray = new byte[inputStream.available()];
            inputStream.read(fileInArray, 0, inputStream.available());
            Arrays.sort(fileInArray);
            System.out.println(Arrays.toString(fileInArray));
            int max=0;
            int count=0;
            ArrayList<Byte> doubeles = new ArrayList<>();
            for (int i = 1; i < fileInArray.length-1; i++) {

                if (fileInArray[i]==fileInArray[i-1]){
                    count++;
                    if (max<count){
                        doubeles.removeIf();
                        max = count;

                        doubeles.add(fileInArray[i]);
                    }if(max==count){
                        doubeles.add(fileInArray[i]);
                    }
                    }
                }
            System.out.println(doubeles.toString());
            }




    }
}
