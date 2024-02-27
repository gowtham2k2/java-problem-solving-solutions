
public class Main {

    public static void main(String args[]) {
        Cat mycat1 = new Cat(24, "Pochitha", 1, "Gowtham");
        Cat mycat2 = new Cat(10, "mellow", 2, "sigma");
        Cat me = new Owner(3, "biji", 3, "magi", "gowtham", 22);

        Thread myThread1 = new Thread(mycat1);
        myThread1.start();
        try {
            myThread1.join(); // it defeats the purpose of multithreading by executing 1 thread after another
                              // and not by executing at the same time...
        } catch (InterruptedException e) {
        }

        Thread myThread2 = new Thread(mycat2);
        myThread2.start();
        if (myThread2.isAlive() == true)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}