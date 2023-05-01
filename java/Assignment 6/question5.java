import java.util.Scanner;

class CustomException extends Exception{
    public CustomException(String s){
        super(s);
    }
}

public class question5 {
    public static void main(String[] args) {
        System.out.println("My Name is: Arnav Ghosh Roll is: 55");
        Scanner scan = new Scanner(System.in);
        int x, y, p , q, z, i;
        System.out.print("Value of X = ");
        x = scan.nextInt();
        System.out.print("Value of Y = ");
        y = scan.nextInt();
        System.out.print("Value of P = ");
        p = scan.nextInt();
        System.out.print("Value of Q = ");
        q = scan.nextInt();
        System.out.print("Value of Z = ");
        z = scan.nextInt();
        System.out.print("Value of I = ");
        i = scan.nextInt();

        try {
            if (q == 0)
                throw new CustomException("Divide By Zero is not Allowed.");
            else
                System.out.println("The Result is:\t" + (x + y * (p / q) * z - i));
        }
        catch (CustomException e){
            System.out.println(e);
            
        }
    }
}