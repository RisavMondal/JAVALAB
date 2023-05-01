public class question3 {
    public static void main(String args[]) {
    
    System.out.println("My Name is: Madhusree Chinya Roll is: 61");
    
    Thread thread = new MyThread("MyThread");
    thread.start();
    int priority = thread.getPriority();
    System.out.println("Priority level of " + thread.getName() + " is " 
   + priority);
    }
    static class MyThread extends Thread {
    public MyThread(String name) {
    super(name);
    }
    public void run() {
    System.out.println("Thread " + getName() + " is running.");
    }
    }
   }