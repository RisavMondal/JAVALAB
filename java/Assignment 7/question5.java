public class question5 {
    public static void main(String args[]) {
    
    System.out.println("My Name is: Madhusree Chinya Roll is: 61");
    
    Thread thread = new MyThread();
    thread.start();
    String threadName = thread.getName();
    System.out.println("Thread name is " + threadName);
    }
    static class MyThread extends Thread {
    public void run() {
    System.out.println("Thread is running.");
    }
    } }