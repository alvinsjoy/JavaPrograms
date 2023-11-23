import java.io.File;
import java.io.IOException;
import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
class File
{
	public static void main(String[] args)
    {	
    	String data;
    	try {
    		File f = new File("./files/file.txt");
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
        	FileWriter fw = new FileWriter("./files/file.txt");
        	fw.write(data);
        }
        catch(IOException e){
        	System.out.println("File not found");
        	e.printStackTrace();
        }
        try{
        int i;
        	FileReader fr = new FileReader("./files/file.txt");
        	while((i=fr.read())!=-1)    
              System.out.print(i);
        }
        catch(IOException e){
        	System.out.println("File not found");
        	e.printStackTrace();
        }
        finally{
        	f.close();
        }
    }
}
