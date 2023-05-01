
abstract class Shape{
    abstract void area(int length1, int length2);
    abstract void show();
}

class Rectangle extends Shape{
    @Override
    void area(int length1, int length2) {
        System.out.println("The Area is:\t" + (length1 * length2));
    }

    @Override
    void show() {
        System.out.println("This is a Rectangle.");
    }
}

class Triangle extends Shape{
    @Override
    void area(int length1, int length2) {
        System.out.println("The Area is:\t" + (0.5 * length1 * length1));
    }

    @Override
    void show() {
        System.out.println("This is a Triangle.");
    }
}

public class question1 {
    public static void main(String[] args) {
        System.out.println("My Name is: Arnav Ghosh Roll is: 55");
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        r.show();
        r.area(10, 20);
        t.show();
        t.area(20, 15);
    }
}