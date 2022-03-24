/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan10_IOStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Dell
 */
public class BufferedInputStream_Example {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        InputStream ins = new FileInputStream("output.txt");
        BufferedInputStream input = new BufferedInputStream(ins);
        
        System.out.println("Available byte to read: "+input.available());
        
        //doc byte dau tien
        int i = input.read();
        while(i!=-1){
            System.out.print((char)i);
            
            //doc byte tiep theo
            i=input.read();
        }
        input.close();
        
        //System.out.println("Data in the output file: ");
        
    }
}
