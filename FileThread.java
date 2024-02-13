import java.io.*;
import java.util.*;

class Even extends Thread{
    int even;
    Even(int n){
        this.even = n;
    }
    public void run(){
        FileWriter fw = null;
        try{
            File f = new File("./files/even.txt");
            if(f.createNewFile())
                System.out.println("File " + f.getName() + " created");
            else
                System.out.println("Number "+ even + " written to " + f.getName());
        }
        catch(IOException e){
            e.printStackTrace();
        }
        try{
            fw = new FileWriter("./files/even.txt", true);
            fw.write(even);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        try{
            fw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
class Odd extends Thread{
    int odd;
    Odd(int n){
        this.odd = n;
    }
    public void run(){
        FileWriter fw = null;
        try{
            File f = new File("./files/odd.txt");
            if(f.createNewFile())
                System.out.println("File " + f.getName() + " created");
            else
                System.out.println("Number "+ odd + " written to " + f.getName());
        }
        catch(IOException e){
            e.printStackTrace();
        }
        try{
            fw = new FileWriter("./files/odd.txt", true);
            fw.write(odd);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        try{
            fw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
public class FileThread extends Thread{
    public static void main(String args[]){
        Random r = new Random();
        for(int i = 0; i < 20; i++){
            int random = r.nextInt(10);
            if(random % 2 == 0){
                Even eve = new Even(random);
                eve.start();
            }
            else{
                Odd od = new Odd(random);
                od.start();
            }
            try{
                Thread.sleep(1000);
            } 
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        FileReader fr = null;
        try{
            fr = new FileReader("./files/even.txt");
            System.out.println("===== Even File =====");
            int i;
            while((i = fr.read()) != -1){
                System.out.println("Even number: " + i);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        try{
            fr.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        try{
            fr = new FileReader("./files/odd.txt");
            System.out.println("===== Odd File =====");
            int i;
            while((i = fr.read()) != -1){
                System.out.println("Odd number: " + i);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        try{
            fr.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
