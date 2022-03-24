/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan10_IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author Dell
 */
public class FileOutputStream_Example {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String data = "It will appear in output file.";
        try{
            OutputStream os = new FileOutputStream("output.txt");
            
            //convert string sang byte
            byte[] array = data.getBytes();
            
            //write array vào outputstream
            os.write(array);
            System.out.println("Data is written in output file");
            
            //đóng outputstream
            os.flush();
            os.close();
        }
        catch(IOException e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
