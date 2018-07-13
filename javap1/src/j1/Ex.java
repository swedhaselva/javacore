package j1;

public class Ex {
	
	 public static void main(String args[])
	 {  
		  int r,sum=0,temp,j,sum1=0 ; 
		  int n=44;
		  int i=n;
		  temp=n;    
		  while(n>0){    
		   r=n%10; 
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)   { 
		   System.out.println("palindrome number "); 
		  while(i>0)
		  {
			  j =i%10;
			  if(j%2==0)
			  {
				  sum1=sum1+j;
			  }
				i=i/10;}
				if(sum1>25)
				{
					System.out.println(" greater than 25");
				}
				if(sum1<25)
				{
					System.out.println("less than 25");
				}
		  }
		 else {   
		   System.out.println("not palindrome");    
		}  
}
}
		


