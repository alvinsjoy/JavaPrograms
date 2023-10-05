class fibonacci
{
	public static void main(String args[])
	{
		long num1=0,num2=1;
		int n=10,i=0
        	while (i<n) 
        	{
            		System.out.print(num1+" ");
            		long num3=num2+num1;
           		num1=num2;
           		num2=num3;
            		i+=1;
        	}
	}
}
