public class question10 {
    private static int counter = 0;
    public static void main(String args[]) throws InterruptedException {
    
    System.out.println("My Name is: Madhusree Chinya Roll is: 61");
    
    Thread t1 = new Thread(new CounterUpdater(), "Thread-1");
    Thread t2 = new Thread(new CounterUpdater(), "Thread-2");
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    System.out.println("Final value of counter: " + counter);
    }
    static class CounterUpdater implements Runnable {
    private synchronized void incrementCounter() {
    counter++;
    }
    @Override
    public void run() {
    for (int i = 0; i < 10000; i++) {
    incrementCounter();
    }
    }
    } }