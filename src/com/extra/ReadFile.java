package com.extra;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {

        // Read line by line
        File file = new File("/home/ubunturifa/Desktop/GitHub/JavaStudy/src/com/extra/readme.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);


        // Reading char by char
        FileReader fr =
                new FileReader("/home/ubunturifa/Desktop/GitHub/JavaStudy/src/com/extra/readme.txt");

        int i;
        while ((i=fr.read()) != -1)
            System.out.print((char) i);
    }
}
