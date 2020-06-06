package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable{
    public static void main(String[] args) {
       // System.out.println(new Solution(4));
        String fileName = "FileTest";
        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             FileOutputStream fileOutputStream = new FileOutputStream(fileName)){

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            Solution savedObject = new Solution(5);
            objectOutputStream.writeObject(savedObject);

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Solution loadedObject = (Solution) objectInputStream.readObject();

            System.out.println(savedObject);
            System.out.println(loadedObject);
            System.out.println(loadedObject.string.equals(savedObject.string));


        } catch (IOException e) {

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }



    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
