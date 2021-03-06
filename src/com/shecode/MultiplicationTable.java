package com.shecode;

import java.io.DataInputStream;
import java.io.IOException;

public class MultiplicationTable {
    private static int bufferPointer = 0;
    private static int bytesRead = 0;
    private static int BUFFER_SIZE = 1<<16;
    private static byte[] buffer = new byte[BUFFER_SIZE];
    private static DataInputStream dataInputStream;
    private static boolean isDouble = false;

    public static byte read() throws IOException {
        if (bufferPointer==bytesRead){
            bytesRead = dataInputStream.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead==-1){
                buffer[0] = -1;
            }
        }
        if (buffer[bufferPointer]=='.'){
            isDouble = true;
        }
        return buffer[bufferPointer++];
    }
    public static void main(String[] args) throws IOException {
        dataInputStream = new DataInputStream(System.in);
        int input = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();

        while (c >= '0' && c <= '9'){
            input = (short) (input * 10 + c - '0');
            c = read();
        }
        if (neg){
            input = -input;
        }

        if (input>=1&&input<=1000){
            for (int i = 0; i<12; i++){
                System.out.printf("%d x %02d = %d\n",input, i+1, (input*(i+1)));
            }
        }
    }
}
