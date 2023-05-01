public class question9 {
    private static int counter = 0;
    public static void main(String args[]) throws InterruptedException {
    
    System.out.println("My Name is: Madhusree Chinya Roll is: 61");
   
    Thread t1 = new Thread(new CounterUpdater(1), "Thread-1");
    Thread t2 = new Thread(new CounterUpdater(3), "Thread-2");
    Thread t3 = new Thread(new CounterUpdater(5), "Thread-3");
    Thread t4 = new Thread(new CounterUpdater(7), "Thread-4");
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t1.join();
    t2.join();
    t3.join();
    t4.join();
    System.out.println("Final value of counter for Thread-1: " + 
   CounterUpdater.getCount(1));
    System.out.println("Final value of counter for Thread-2: " + 
   CounterUpdater.getCount(3));
    System.out.println("Final value of counter for Thread-3: " + 
   CounterUpdater.getCount(5));
    System.out.println("Final value of counter for Thread-4: " + 
   CounterUpdater.getCount(7));
    }
    static class CounterUpdater implements Runnable {
    private int priority;
    private static int[] count = new int[10];
    public CounterUpdater(int priority) {
    this.priority = priority;
    }
    @Override
    public void run() {
    for (int i = 0; i < 10; i++) {
    synchronized (question9.class) {
    counter++;
    count[i] = counter;
    }
    try {
    Thread.sleep(priority * 1);
    } catch (InterruptedException e) {
    e.printStackTrace();
    }
    }
    }
    public static int getCount(int priority) {
    return count[9];
    }
    } }