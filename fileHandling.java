import java.io.*;
import java.util.*;
class Files
{
	public static void main(String[] args)
    {	
    	String data;
    	try {
    		File f = new File("files/file.txt");
    		if (f.createNewFile())
    			System.out.println("File "+f.getName()+" is created");
    		else
    			System.out.println("File already exist");
    	}
    	catch(IOException e){
    		System.out.println("An unexpected error is occurred.");
    		e.printStackTrace();
    	}   
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data:");
        data = sc.nextLine();
        try{
        	FileWriter f = new FileWriter("files/file.txt");
        	f.write(data);
			f.close();
        }
        catch(IOException e){
        	System.out.println("File not found");
        	e.printStackTrace();
        }
        try{
        	int i;
        	FileReader f = new FileReader("files/file.txt");
        	while((i=f.read())!=-1)
				System.out.print((char)i);
			f.close();
        }
        catch(IOException e){
        	System.out.println("File not found");
        	e.printStackTrace();
        }
        finally{
        	//f.close();
        }
    }
}
