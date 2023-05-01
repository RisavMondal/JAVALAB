public class question4 extends Thread {
 
    @Override
    public void run() {
    System.out.println("Thread is running.");
    }
    
    public static void main(String[] args) {
    
    System.out.println("My Name is: Madhusree Chinya Roll is: 61");
    
    question4 myThread = new question4();
    myThread.start();
    } }