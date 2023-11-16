import java.util.Scanner;
interface Sports
{
	final int sportwt=6;
	public abstract void putwt();
}
class Student
{
	Scanner sc=new Scanner(System.in);
	int rollnumber;
	void getNumber()
	{
		System.out.println("Enter the roll number:");
		rollnumber=sc.nextInt();
	}
	void putNumber()
	{
		System.out.println("Roll number:"+rollnumber);
	}
}
class Test extends Student
{
    float term1, term2;
    void getMarks()
	{
		System.out.println("Enter the marksfor term1:");
		term1=sc.nextFloat();
		System.out.println("Enter the marksfor term2:");
		term2=sc.nextFloat();
	}
	void putMarks()
	{
		System.out.println("Term1: "+term1+"\tTerm2: "+term2);
	}
}
class Results extends Test implements Sports
{
	public void putwt()
	{
		System.out.println("Enter the Sports weightage="+sportwt);
	}
}
class MultInh
{
	public static void main(String args[])
	{
		Results r=new Results();
		r.getNumber();
		r.getMarks();
		r.putNumber();
		r.putMarks();
		r.putwt();
	}
}
