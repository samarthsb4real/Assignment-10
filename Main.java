// Name: Samarth Bhadane
// PRN: 24070126503
// Batch: A2

public class Main {
    public static void main(String[] args) {
        // creating thread objects
        Thread t1 = new Thread(new Numbers());
        Thread t2 = new Thread(new Alphabet());
        Thread t3 = new Thread(new EvenOdd());

        // starting threads
        t1.start();
        t2.start();
        t3.start();
    }
}
