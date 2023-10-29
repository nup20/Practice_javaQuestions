package Assignments;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("::Swaping with 3 variables::");
		System.out.println("Enter the 2 nos");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Before Swaping a:"+a );
		System.out.println("Before Swaping b:"+b );
		
       int c=b;
       b=a;
       a=c;
       System.out.println("After Swaping a:"+a );
		System.out.println("After Swaping b:"+b );
		
		System.out.println("::Swaping with 2 variables::");
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("After Swaping a:"+a );
		System.out.println("After Swaping b:"+b );
	}

}
