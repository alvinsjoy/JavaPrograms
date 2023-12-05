import java.util.Random;
class RandomNumbers extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++){
            Random r = new Random();
            int random = r.nextInt(100);

            System.out.println("Random Number generated: "+random);

            if ((random % 2) == 0){
                SquareThread s = new SquareThread(random);
                s.start();
            } else{
                CubeThread c = new CubeThread(random);
                c.start();
            }

            try{
                Thread.sleep(1000);
            } 
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class SquareThread extends Thread {
	int n;
    SquareThread(int number) {
    n=number;
    }
    public void run() {
        System.out.println("Square of " + n + ": " + (n * n));
    }
}
class CubeThread extends Thread {
	int n;
    CubeThread(int number) {
    n=number;
    }
    public void run() {
        System.out.println("Cube of " + n + "= " + (n * n * n));
    }
}
class MultipleThreads {
    public static void main(String args[]) {
        RandomNumbers rn = new RandomNumbers();
        rn.start();
    }
}

