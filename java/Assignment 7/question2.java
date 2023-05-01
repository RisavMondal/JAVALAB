public class question2 implements Runnable {
 
    @Override
    public void run() {
    System.out.println("Thread is running.");
    }
    
    public static void main(String args[]) {
    
    System.out.println("My Name is: Madhusree Chinya Roll is: 61");
    
    Thread myThread = new Thread(new question2());
    myThread.start();
    } }