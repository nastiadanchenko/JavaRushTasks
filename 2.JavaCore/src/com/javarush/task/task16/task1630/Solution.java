package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {

        }
    }

    //add your code here - добавьте код тут

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join(); //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fullFileNam;
       // private String s;
       StringBuilder sb = new StringBuilder("");
        public ReadFileThread() {
        }

        public void run() {
             // объект для посторения строки
            String string;

            try {
                BufferedReader in = new BufferedReader(new FileReader(fullFileNam)); // объект для чтения из буффера
                while ((string = in.readLine()) != null) {

                    sb.append(string);
                    sb.append(" ");
                }
                in.close();
            } catch (FileNotFoundException e) {

            } catch (IOException e) {

            }


            getFileContent();
        }

        public void setFileName(String fullFileName) {
            this.fullFileNam = fullFileName;
        }

        public String getFileContent() {

            return sb.toString();
          /*  StringBuilder sb = new StringBuilder(); // объект для посторения строки
            String string;

            try {
                BufferedReader in = new BufferedReader(new FileReader(fullFileNam)); // объект для чтения из буффера
                while ((string = in.readLine()) != null) {
                    if (string == null) {
                        return "";
                    } else
                        sb.append(string);
                    sb.append(" ");
                }
                in.close();
            } catch (FileNotFoundException e) {

            } catch (IOException e) {

            }
*/
        }


    }

}
