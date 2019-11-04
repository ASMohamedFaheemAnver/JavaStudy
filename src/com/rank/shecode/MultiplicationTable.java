package com.rank.shecode;

import java.io.DataInputStream;
import java.io.IOException;

public class MultiplicationTable {
    private static int bufferPointer = 0;
    private static int bytesRead = 0;
    private static int BUFFER_SIZE = 1<<16;
    private static byte[] buffer = new byte[BUFFER_SIZE];
    private static DataInputStream dataInputStream;

    public static byte read() throws IOException {
        if (bufferPointer==bytesRead){
            bytesRead = dataInputStream.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead==-1){
                buffer[0] = -1;
            }
        }
        return buffer[bufferPointer++];
    }
    public static void main(String[] args) throws IOException {
        dataInputStream = new DataInputStream(System.in);
        short input = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do {
            input = (short) (input * 10 + c - '0');
        } while ((c = read()) >= '0' && c <= '9');

        if (input>=1&&input<=1000){
            for (int i = 0; i<12; i++){
                System.out.printf("%d x %02d = %d\n",input, i+1, (input*(i+1)));
            }
        }
    }
}
