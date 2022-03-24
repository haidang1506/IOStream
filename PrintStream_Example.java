/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan10_IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class PrintStream_Example {
    public static void main(String[] args) throws FileNotFoundException {
        String data = "Print Stream output ";
        try {
            FileOutputStream file = new FileOutputStream("printStreamOutput.txt");
            PrintStream ps = new PrintStream(file);
            
            ps.print(data);
            System.out.println("Data is written in the print stream output file.");
            Scanner sc = new Scanner(System.in);
            System.out.println("Your age: ");
            int n = sc.nextInt();
            ps.print("\n");
            ps.printf("I am Dang and I am %d years old.", n);
            System.out.println("More information is written.");
            System.out.println("Is there any error during print into output file ? "+ps.checkError());
            ps.close();
        }
        catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
