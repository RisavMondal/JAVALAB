import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
public class question8 {
 public synchronized void synchronizedMethod() {
 System.out.println("This is a synchronized method.");
 }
 public void unsynchronizedMethod() {
 System.out.println("This is an unsynchronized method.");
 }
 public static void main(String[] args) throws 
NoSuchMethodException {
 
 System.out.println("My Name is: Madhusree Chinya Roll is: 61");
 
 question8 obj = new question8();
 Method synchronizedMethod = 
obj.getClass().getMethod("synchronizedMethod");
 System.out.println("Is synchronizedMethod() synchronized? " + 
Modifier.isSynchronized(synchronizedMethod.getModifiers()));
 Method unsynchronizedMethod = 
obj.getClass().getMethod("unsynchronizedMethod");
 System.out.println("Is unsynchronizedMethod() synchronized? " 
+ Modifier.isSynchronized(unsynchronizedMethod.getModifiers()));
 } }