public class question3 {
    static int factorial(int x){
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("My Name is: Arnav Ghosh Roll is: 55");
        try{
            if (args[0].equals("0"))
                throw new IllegalArgumentException("0 is not Allowed.");
            System.out.println(factorial(Integer.parseInt(args[0])));
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bound.");
        }
        catch (NumberFormatException e){
            System.out.println("Value is Not an Integer.");
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
}