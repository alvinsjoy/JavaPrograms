import java.util.Scanner;
public class palindrome
{
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine().toLowerCase();
		int flag=1,left=0,right;
		right=str.length()-1;
		while(left<right)
		{
			if (str.charAt(left)!=str.charAt(right))
				flag=0;
			left++;
			right--;
		}
		if(flag==0)
			System.out.println("Not a Palindrome");
		else
			System.out.println("Palindrome");
	}
}
