package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Optional;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {
    String fileName;
    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        if (!fileName.endsWith(".txt")){
            super.close();
            throw new UnsupportedFileNameException();
        } else {
            this.fileName = fileName;
        }
    }


    public static void main(String[] args) {
    }
}

