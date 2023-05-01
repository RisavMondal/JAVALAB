import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        System.out.println("My Name is: Arnav Ghosh Roll is: 55");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Length of Array:\t");
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i <= n; i++) {
            System.out.println("Variable " + (i+1) + " is:\t");
            try {
                arr[i] = scan.nextInt();
                arr[i] = arr[i] / (n-i-1);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Array Index is Out of Bound.");
            }
            catch (ArithmeticException e){
                System.out.println("This is an Arithmetic Exception.");
            }
        }
    }
}