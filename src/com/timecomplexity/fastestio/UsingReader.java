package com.timecomplexity.fastestio;

import java.io.DataInputStream;
import java.io.IOException;

class KeyBordBufferReader {

    // Size of the buffer we are using
    // We are using this buffer size to get 1..16*0 buffer at once
    private final int BUFFER_SIZE = 1 << 16;

    // We use DataInputStream to get data from the keyBord buffer
    private DataInputStream dataInputStream = new DataInputStream(System.in);

    // We are getting input as a byte
    private byte[] buffer = new byte[BUFFER_SIZE];

    // We use bufferPointer to get the current position of the buffer
    private int bufferPointer = 0;

    // We use bytesRead to remember how many bytes we read from the buffer
    private int bytesRead = 0;

    public void fillBuffer() throws IOException {
        bytesRead = dataInputStream.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if (bytesRead==-1){
            buffer[0] = -1;
        }
    }

    // We use read method to get&return bytes from buffer
    public byte read() throws IOException {
        if (bufferPointer==bytesRead){
            fillBuffer();
        }
        // This will return one element from the buffer
        return buffer[bufferPointer++];
    }
}


public class UsingReader{
    public static void main(String[] args) throws IOException {
        KeyBordBufferReader keyBordBufferReader = new KeyBordBufferReader();
        for (int i = 0; i<5; i++){
            System.out.println((char) keyBordBufferReader.read());
        }
    }
}