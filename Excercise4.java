package com.first;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Excercise4 {
	public static void main (String[]args)throws IOException{
		

		try {
		File f = new File("C:\\Users\\anusu\\OneDrive\\Desktop\\Jeeva.txt");
		FileReader fr = new FileReader(f);
		int temp =0;
		
		while((temp=fr.read())!=-1) {
			System.out.print((char)(temp));
		}
		}
		catch(IOException i) {
			System.out.println(i+" Unknown File");
			i.printStackTrace();
		}
		System.out.println("");
		System.out.println("Success");
		
		
	}
}
