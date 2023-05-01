import java.util.Scanner;

interface Department{
    String deptName = "name";
    String deptHead = "head";
    void displayDept();
}

class Hostel{
    Scanner scan = new Scanner(System.in);
    String hostelName;
    String hostelLocation;
    int numberOfRooms;

    void setAttributes(){
        System.out.print("Hostel Name:\t");
        this.hostelName = scan.nextLine();
        scan.nextLine();
        System.out.print("Hostel Location:\t");
        this.hostelLocation = scan.nextLine();
        System.out.print("How Many Number of Rooms are There:\t");
        this.numberOfRooms = scan.nextInt();
    }

    void display(){
        System.out.println("Hostel Name is:\t" + this.hostelName);
        System.out.println("Hostel Location is:\t" + this.hostelLocation);
        System.out.println("There are total " + this.numberOfRooms + " Rooms.");
    }
}

class Student extends Hostel implements Department{
    String studentName;
    long regNo;
    String electiveSubject;
    float avgMarks;

    void setvalues(){
        System.out.print("Student Name:\t");
        studentName = scan.nextLine();
        System.out.print("Elective Subject is:\t");
        electiveSubject = scan.nextLine();
        System.out.print("Registration Number:\t");
        regNo = scan.nextLong();
        System.out.print("Average Marks is:\t");
        avgMarks = scan.nextFloat();
    }

    void displayValues(){
        System.out.println("Student Name:\t" + studentName);
        System.out.println("Elective Subject:\t" + electiveSubject);
        System.out.println("Registration Number:\t" + regNo);
        System.out.println("Average Marks:\t" + avgMarks);
        System.out.println("Hostel Name:\t" + hostelName);
        System.out.println("Hostel Location:\t" + hostelLocation);
        System.out.println("Total Room Number:\t" + numberOfRooms);
    }

    @Override
    public void displayDept() {
        System.out.println("Department Name:\t" + deptName);
        System.out.println("Department Head:\t" + deptHead);
    }
}

public class question3 {
    public static void main(String[] args) {
        System.out.println("My Name is: Arnav Ghosh Roll is: 55");
        Student s = new Student();
        s.setvalues();
        s.setAttributes();
        s.displayValues();
        s.displayDept();
    }
}