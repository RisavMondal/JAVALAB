public class question1 {
 
    public static void main(String args[]) {
    
    System.out.println("My Name is: Madhusree Chinya Roll is: 61");
    
    Thread thread1 = new MyThread("Thread 1");
    Thread thread2 = new MyThread("Thread 2");
    Thread thread3 = new MyThread("Thread 3");
    Thread thread4 = new MyThread("Thread 4");
    
    thread1.setPriority(Thread.MAX_PRIORITY); 
    thread2.setPriority(Thread.NORM_PRIORITY + 1); 
    thread3.setPriority(Thread.NORM_PRIORITY); 
    thread4.setPriority(Thread.MIN_PRIORITY); 
    
    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();
    }
    
    static class MyThread extends Thread {
    public MyThread(String name) {
    super(name);
    }
    public void run() {
    System.out.println("Thread Name: " + getName() + " Priority: " 
   + getPriority());
    }
    } }