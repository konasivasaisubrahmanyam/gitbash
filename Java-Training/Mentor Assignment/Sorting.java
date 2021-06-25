package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sorting implements Comparable<Sorting>{
	
	 int i;
	String s;
	 int n;
	Sorting(){
	}
	Sorting(int i,String s)
	{
		this.i=i;
		this.s=s;
	}
	@Override
	public String toString() {
		
		return "index no="+i+"\n"+"name="+s;
	}
	@Override
	public  int compareTo(Sorting o) {
		
		return this.s.compareTo(o.s);
	}
	
	public static void main(String[] args) {
		int n,i;
		String s; 
		List<Sorting> list=new ArrayList<Sorting>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size ");
		n=sc.nextInt();
		while(n>0)
		{
		System.out.println("Enter the index value of name ");
		i=sc.nextInt();
		System.out.println("Enter the  value of name ");
		s=sc.next();
		list.add(new Sorting(i,s));
		 --n;
		
		}
		Collections.sort(list);
		for(Sorting so:list)
		{
			System.out.println(so.toString());
		}
	}
}
