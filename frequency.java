import java.util.Scanner;
public class frequency {

    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the string:");
        String str=sc.nextLine();
        System.out.println("Enter the character:");
        char ch=sc.next().charAt(0);
        int freq=0;
        for(int i=0;i<str.length();i++)
        {
            if(ch==str.charAt(i))
                freq++;
        }
        System.out.println("Frequency of "+ch+": "+freq);
    }
}
