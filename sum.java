import java.util.*;
class sum
{
	public static void main(String args[])
	{
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the limit:");
		n=sc.nextInt();
		System.out.println("The first "+n+" numbers are:");
		for(i=1;i<=n;i++)
		{
			System.out.println(i);
			sum+=i;
		}
		System.out.println("Sum of first "+n+" numbers: "+sum);
	}
}
