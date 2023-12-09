import java.util.Scanner;
class Binary
{
	public static void main(String args[])
	{
		int n,i,key;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		n=sc.nextInt();
		int arr[]=new int[n];
		int start=0,end=n-1;
		int mid=(start+end)/2;
		System.out.println("Enter the array elements:");
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the element "+(i+1)+":");
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to search:");
		key=sc.nextInt();
		while(start<=end)
		{
			if(arr[mid]<key)
				start=mid+1;
			else if(arr[mid]==key)
			{
				System.out.println("Element found at: "+(mid+1));
				break;
			}
			else
				end=mid-1;
			mid=(start+end)/2;
		}
		if(start>end)
		{
			System.out.println("Element not found");
		}
	}
}
