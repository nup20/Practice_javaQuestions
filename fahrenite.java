package Assignments;

import java.util.Scanner;

public class fahrenite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temp:");
		int tem=sc.nextInt();
		tem = ((tem - 32)*5)/9;
		System.out.println( "result:"+tem);
	}

}
