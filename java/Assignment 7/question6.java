public class question6 {
    public static void main(String args[]) {
    
    System.out.println("My Name is: Madhusree Chinya Roll is: 61");
    
    MyThread myThread = new MyThread();
    myThread.start();
    try {
    Thread.sleep(3000);
    } catch (InterruptedException e) {
    e.printStackTrace();
    }
    myThread.stop();
    System.out.println("Thread stopped.");
    }
    static class MyThread extends Thread {
    public void run() {
    while (true) {
    System.out.println("Thread is running.");
    try {
    Thread.sleep(1000);
    } catch (InterruptedException e) {
    e.printStackTrace();
    }
    }
    }
    } }