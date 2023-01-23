//Write a program (How to write plaindrom program)
import java.util.*;
class plaindrom
{
	public static void main(String arg[])
	{
		int n,temp=0,k,r=0;
		Scanner in=new Scanner(System.in);
		System.out.printf("Enter a number=");
		n=in.nextInt();
		temp=n;
		while(n!=0)
		{
			k=n%10;
			r=r*10+k;
			n=n/10;
		}
		if(temp==r)
			System.out.println("This is plaindrom");
		else
			System.out.println("This is not plaindeom");
	}
}