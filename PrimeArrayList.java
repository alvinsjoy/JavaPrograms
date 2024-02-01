import java.util.*;
public class PrimeArrayList {
    public boolean isPrime(int n){
        if (n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter the number of elements:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Enter the element "+(i+1)+":");
            list.add(sc.nextInt());
        }
        System.out.println("Enter the n in n'th prime number to be searched:");
        int key = sc.nextInt();
        Iterator<Integer> itr = list.iterator();
        int count = 0;
        PrimeArrayList p = new PrimeArrayList();
        while(itr.hasNext() && count < key){
            int num = itr.next();
            if(p.isPrime(num)){
                count++;
                if(count == key){
                    System.out.println("The "+ key + "th prime no is:" + num);
                    break;
                }
            }
        }
        if(count < key)
            System.out.println("Not found"); 
    }
}
