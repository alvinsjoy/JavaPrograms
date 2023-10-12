import java.util.Scanner;
class Sum
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows of matrix 1:");
		int r1=sc.nextInt();
		System.out.println("Enter the number of column of matrix 1:");
		int c1=sc.nextInt();
		System.out.println("Enter the number of rows of matrix 2:");
		int r2=sc.nextInt();
		System.out.println("Enter the number of column of matrix 2:");
		int c2=sc.nextInt();
		if(r1==r2&&c1==c2)
		{
			int a[][]=new int[r1][c1];
			int b[][]=new int[r2][c2];
			int c[][]=new int[r1][c1];
			System.out.println("Enter the elements of matrix 1:");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter the elements of matrix 2:");
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				{
					b[i][j]=sc.nextInt();
				}
			}
			System.out.println("Matrix1:");
			for(int i=0;i<r1;i++)
			{  
				for(int j=0;j<c1;j++)
				{ 
					System.out.print(a[i][j]+" ");    
				}
				System.out.println();
			}
			System.out.println("Matrix2:");
			for(int i=0;i<r2;i++)
			{  
				for(int j=0;j<c2;j++)
				{ 
					System.out.print(b[i][j]+" ");    
				}
				System.out.println();
			}
			System.out.println("The result is:");
			for(int i=0;i<r1;i++)
			{  
				for(int j=0;j<c1;j++)
				{
					c[i][j]=a[i][j]+b[i][j]; 
					System.out.print(c[i][j]+" ");    
				}
				System.out.println();
			}
		}
		else
			System.out.println("Addition not possible");
	}
}
