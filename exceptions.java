class Exception
{
	void testTry()
	{
		try{
			int a = 5/0;
			String str = null;
			System.out.println(str.length());
		}
		catch(ArithmeticException e1) {
			System.out.println("An arithmetic exception has occured");
		}
		catch(NullPointerException e1) {
			System.out.println("NullPointerException has occured");
		}
		finally {
			System.out.println("Finally is executed");
		}
	}
	void testThrow() throws ArithmeticException
	{
		if(1>0)
			throw new ArithmeticException("1>0");
		else
			System.out.println("1<0");
	}
}
class Test 
{
	public static void main(String args[])
	{	
		Exception e = new Exception();
		e.testTry();
		e.testThrow();
	}
}
