class Vehicle{
    protected int regNo;
    protected int speed;
    protected String color;
    protected String ownerName;

    void set(int regNo, int speed, String color, String ownerName) {
        this.regNo = regNo;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    void showData(){
        System.out.println("Registration Number is\t" + this.regNo);
        System.out.println("Highest Speed is:\t" + this.speed);
        System.out.println("Color:\t" + this.color);
        System.out.println("Owner Name:\t" + this.ownerName);
    }
}

class Bus extends Vehicle{
    private String routeNo;

    public Bus(String routeNo, int regNo, int speed, String color, String ownerName) {
        super.set(regNo, speed, color, ownerName);
        this.routeNo = routeNo;
    }

    @Override
    void showData() {
        super.showData();
        System.out.println("Route Number is:\t" + this.routeNo);
    }
}

class Car extends Vehicle{
    private String manufacturerName;

    public Car(String manufacturerName, int regNo, int speed, String color, String ownerName){
        super.set(regNo, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }

    @Override
    void showData() {
        super.showData();
        System.out.println("Manufacturer Name is:\t" + this.manufacturerName);
    }
}

public class question2 {
    public static void main(String[] args) {
        System.out.println("My Name is: Arnav Ghosh Roll is: 55");
        Bus b = new Bus("33/A", 12345, 150, "Cyan", "Arnav Ghosh");
        Car c = new Car("Scorpio", 54321, 250, "Black", "Rupam Mondal");
        b.showData();
        c.showData();
    }
}