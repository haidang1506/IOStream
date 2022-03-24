/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan10_IOStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Dell
 */
public class BufferedOutputStream_Example {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String data = "Buffered Output Stream file example.";
        
        FileOutputStream file = new FileOutputStream("bufferedoutput.txt");
        BufferedOutputStream bos = new BufferedOutputStream(file);
        
        try {
            byte[] array = data.getBytes();
            bos.write(array);
            System.out.println("Data is written in bufferedoutput file.");
            bos.close();
        }
        catch(Exception e){
            e.getMessage();
        }
    }
}
