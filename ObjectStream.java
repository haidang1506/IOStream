/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan10_IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Dell
 */
public class ObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int n1 = 1;
        int n2 = 2;
        String s = "Object Stream Example";
        try {
            FileOutputStream fos = new FileOutputStream("output2.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            /*fos.write(s.getBytes());
            fos.write(n1);
            fos.write(n2);*/
            
            oos.writeInt(n1);
            oos.writeInt(n2);
            oos.writeObject(s);
            
            System.out.println("Data is written in the output2 file.");
            
            FileInputStream fis = new FileInputStream("output2.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            System.out.println("Integer data: "+ois.readInt());
            System.out.println("String data: "+ois.readObject());
            
            oos.close();
            ois.close();
        }
        catch (IOException e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
