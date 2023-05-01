class Vehicle {
    int wheels;
    float speed;
}

class Car extends Vehicle {
    int passengers;

    public Car(int wheels, float speed, int passengers) {
        super.wheels = wheels;
        super.speed = speed;
        this.passengers = passengers;
    }

    void display(){
        System.out.println("Number of Wheels is:\t" + super.wheels);
        System.out.println("Speed of Car is:\t" + super.speed);
        System.out.println("Number of Passengers is:\t" + this.passengers);
    }
}

class Truck extends Vehicle {
    int load_limit;

    public Truck(int wheels, float speed, int load_limit){
        super.wheels = wheels;
        super.speed = speed;
        this.load_limit = load_limit;
    }

    void display(){
        System.out.println("Number of Wheels is:\t" + super.wheels);
        System.out.println("Speed of Truck is:\t" + super.speed);
        System.out.println("maximum Load Limit is:\t" + this.load_limit);
    }
}

public class question5 {
    public static void main(String[] args) {
        System.out.println("Veheicale Info");
        System.out.println("Name:- Ramprasad Dolai Roll- 13");
        Car c = new Car(4, 100, 6);
        Truck t = new Truck(12, 130, 200);
        c.display();
        t.display();

        if (c.speed > t.speed)
            System.out.println("Car is Faster.");
        else
            System.out.println("Truck is Faster.");
    }
}