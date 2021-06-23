package basic;
import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
public class hello implements Comparable<hello>
{
	private final static TreeSet<hello> hello1=null;
	static String words;
	int i;
	String s;
	hello(int i,String s)
	{
		this.i=i;
		this.s=s;
	}
	public String toString() {
		return i+" "+s;
	}

	@Override
	public int compareTo(hello o) {
		return this.s.compareTo(o.s);
	}
	public static void main(String[] args)throws Exception{
		Set<hello> arr=new TreeSet<hello>();
		File inputfile=new File("C:\\Users\\BCP\\Documents\\file1.txt");
		File outputfile=new File("C:\\Users\\BCP\\Documents\\file2.txt");
		FileReader read;
		FileWriter write;		
		try {
			read=new FileReader(inputfile);
			write=new FileWriter(outputfile);
			BufferedReader read2=new BufferedReader(read);
			BufferedWriter write2=new BufferedWriter(write);
			while((words=read2.readLine())!=null)
			{	
				
				String[] partition=words.split(",");
				hello hll=new hello(Integer.parseInt(partition[0]),partition[1]);
				arr.add(hll);
			}
			
			System.out.println(arr);
		 for(hello sorted:arr)
		 {
			 write2.write(sorted.toString());
			 write2.newLine();
		 }
		write2.flush();
		Thread.sleep(5000);
		System.out.println("file written successfully");
		System.out.println("check ur destination file");
		
		
	}
		catch(Exception e)
		{
			String errors=e.getMessage();
			System.out.println(errors);
		}
		
	}
}
	
	


