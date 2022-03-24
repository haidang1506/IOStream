/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan10_IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Dell
 */
public class FileInputStream_Example {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        byte[] arr = new byte[100];
        try{
            InputStream is = new FileInputStream("input.txt");
            
            //trả về số byte trong input stream
            System.out.println("Available bytes in the file: "+is.available());
            
            //đọc byte trong input stream
            is.read(arr);
            System.out.println("Data in the file: ");
            
            //covert byte sang string
            String data = new String(arr);
            System.out.println(data);
            
            //đóng input stream
            is.close();
        }
        catch(IOException e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
