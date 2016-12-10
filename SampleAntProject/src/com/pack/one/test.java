package com.pack.one;

import java.io.File;
import java.io.IOException;

public class test {

	
	
	public static void main(String args[]) throws IOException{
		
		
		System.out.println(System.getProperty("java.classpath"));
		
		String str = "Shashavali";
		
		for(int i=0;i<str.length();i++)
		{
			int k = 0;
			
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j)){
					k = k+1;
					
				}
			}
			
			System.out.println(str.charAt(i) +" --- "+ k);
		}
		
	}
}
