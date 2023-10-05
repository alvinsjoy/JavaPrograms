import java.util.*;
public class armstrong 
{
    public static void main(String[] args)
    {
        int n;
        int p=0;
        Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the number:");
		n=sc.nextInt();
		int temp=n;
        while (n>0) {
            int rem=n%10;
            p=p+(rem*rem*rem);
            n=n/10;
        }
        if (temp==p) {
            System.out.println("Armstrong No.");
        }
        else {
            System.out.println("Not an Armstrong No.");
        }
    }
}

