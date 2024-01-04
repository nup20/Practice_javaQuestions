package TCQ;
import java.util.Scanner;
public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter the no=");
int a=sc.nextInt();
System.out.println("The table of "+a);
for(int i=1;i<=10;i++)
{
	System.out.println(a+"*"+i+"="+(a*i));
}

	}

}
//7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
//Test Data:
//Input a number: 8
//Expected Output :
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//...
//8 x 10 = 80