import java.util.*;
class Token{
	public static void main(String args[]){
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		String n = sc.nextLine();
		StringTokenizer s= new StringTokenizer(n);
		while(s.hasMoreTokens()){
			System.out.println(s.nextToken());
		}
	}
}
