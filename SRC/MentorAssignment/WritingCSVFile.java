package student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingCSVFile {

	public static void main(String[] args) throws IOException {
		int n,year;
		String Qualification;
		
		
		FileWriter f=new FileWriter("C:\\Users\\BCP\\Documents\\file19.csv");
		BufferedWriter br=new BufferedWriter(f);
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		sb.append("year");
		sb.append(", ");
		sb.append("Qualification");
		sb.append("\n");
		
		br.write(sb.toString());

		
		
		
	
		  System.out.println("enter the size ");
		  n=sc.nextInt();
		  while(n>0) {
		 System.out.println("Enter the year ");
		 year=sc.nextInt(); 
		 br.write(year+" "+",");

		  System.out.println("Enter the  value of Qualification ");
		  Qualification=sc.next(); 
		  br.write(" "+Qualification+"\n");
		  --n; 
		  }
		  br.flush(); 
		  System.out.println("content written successfully");
		  
		 
	}

}
