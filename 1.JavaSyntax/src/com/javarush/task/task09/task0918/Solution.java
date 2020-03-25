package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
*/

import java.io.IOException;
import java.net.SocketException;
import java.nio.file.FileSystemException;

public class Solution {
    public static void main(String[] args) {
    }

    static class MyException extends IOException{

    }

    static class MyException2 extends SocketException{
    }

    static class MyException3 extends ArithmeticException{
    }

    static class MyException4 extends NullPointerException{
    }
}

