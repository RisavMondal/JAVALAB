import java.util.Scanner;

class CheckArgument extends Exception{
    public CheckArgument(String s){
        super(s);
    }
}

public class question4 {
    public static void main(String[] args) {
        System.out.println("My Name is: Arnav Ghosh Roll is: 55");
        try {
            if (args.length < 5)
                throw new CheckArgument("Argument Number is Less than 5.");
            else {
                int x = 0;
                for (String c :
                        args) {
                    x += Integer.parseInt(c);
                }
                System.out.println("The Sum is:\t" + x);
            }
        }
        catch (CheckArgument e){
            System.out.println(e);
        }
    }
}