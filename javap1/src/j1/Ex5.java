package j1;

import java.util.Scanner;

public class Ex5 {
	public static void main(String args[]) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter the charater");
		char n= s.next().charAt(0);
if (n>=97 && n<=123)
{
	System.out.println("lowercase");


}
else if (n>=65 && n<=96)
{
	System.out.println("uppercase");

}
else if (n>=48 && n<=57)
{
	System.out.println("it is an integer");
}
	


	else
	{
		System.out.println("it is a special character");
	}
}
}