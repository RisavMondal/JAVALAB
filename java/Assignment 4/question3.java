class Building {
    int floors = 5;
    int rooms = 15;
    int footage = 28;
}

class House extends Building {
    int bedrooms = 2;
    int bathroom = 1;
}

class Office extends Building {
    int no_of_telephones = 3;
    int no_of_tables = 5;
}

public class question3 {
    public static void main(String[] args) {
        System.out.println("Beadrooms and Bathrooms Coumts");
        System.out.println("Name:- Ramprasad Dolai Roll- 13");
    
        Office o = new Office();
        System.out.println("Number of Telephones in Office:\t" + o.no_of_telephones);
        System.out.println("Number of Tables in Office:\t" + o.no_of_tables);
    }
}