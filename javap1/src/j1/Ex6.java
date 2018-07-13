package j1;
	import java.util.Scanner;
	public class Ex6
	{
	   public static void main(String[] args)
	   {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a character : ");
		String  s=scanner.nextLine() ;
	for(int i=0;i<s.length();i++)
	{ char ch =s.charAt(i);s
		if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
		{
			System.out.println("it is vowels");;
		}
		else
		{
		
			  System.out.println("consonant");
		}
	}
	   }
	}
		