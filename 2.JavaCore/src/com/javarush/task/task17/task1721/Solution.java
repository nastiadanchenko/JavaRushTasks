package com.javarush.task.task17.task1721;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            File file1 = new File(reader.readLine());
            File file2 = new File(reader.readLine());

            try (BufferedReader fileReader = new BufferedReader(new FileReader(file1))) {
                while (fileReader.ready()) {
                    allLines.add(fileReader.readLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try (BufferedReader fileReader = new BufferedReader(new FileReader(file2))) {
                while (fileReader.ready()) {
                    forRemoveLines.add(fileReader.readLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            new Solution().joinData();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(allLines);
        System.out.println(forRemoveLines);

    }


    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
             throw new CorruptedDataException();
            }

        }


}
