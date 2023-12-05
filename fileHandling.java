import java.io.*;
import java.util.*;
class Files
{
	public static void main(String[] args) throws IOException
    {	
    	String data;
		FileWriter fw = null;
		FileReader fr = null;
    	try {
    		File file = new File("files/file.txt");
    		if (file.createNewFile())
    			System.out.println("File "+file.getName()+" is created");
    		else
    			System.out.println("File already exist");
    	}
    	catch(IOException e){
    		System.out.println("An unexpected error has occurred.");
    		e.printStackTrace();
    	}   
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data:");
        data = sc.nextLine();
        try{
        	fw = new FileWriter("files/file.txt");
        	fw.write(data);
        }
        catch(IOException e){
        	System.out.println("File not found");
        	e.printStackTrace();
        }
		finally{
			try{
				fw.close();
			}
			catch(IOException e){
				System.out.println("File not found");
				e.printStackTrace();
			}
		}
        try{
        	int i;
        	fr = new FileReader("files/file.txt");
        	while((i=fr.read())!=-1)
				System.out.print((char)i);
        }
        catch(IOException e){
        	System.out.println("File not found");
        	e.printStackTrace();
        }
        finally{
			try{
				fr.close();
			}
			catch(IOException e){
				System.out.println("File not found");
				e.printStackTrace();
			}
        }
    }
}
