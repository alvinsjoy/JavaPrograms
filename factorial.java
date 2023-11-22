import java.util.Scanner;

class Fact
{
	static int factorial(int n)
	{
		if (n==0||n==1)
			return 1;
		return n*factorial(n-1);
	}
	public static void main(String args[])
	{
		Fact f=new Fact();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int ans=f.factorial(num);
		System.out.println("Factorial of "+num+" is:"+ans);
	}
}
