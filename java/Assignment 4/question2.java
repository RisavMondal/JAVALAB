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

public class question2 {
    public static void main(String[] args) {
        System.out.println("Beadrooms and Bathrooms Coumts");
        System.out.println("Name:- Ramprasad Dolai Roll- 13");
        House h = new House();
        System.out.println("Number of Bedrooms is:\t" + h.bedrooms + " and each of:\t" + h.footage + " sqr FT.");
        System.out.println("Number of Bathrooms is:\t" + h.bathroom + " and each of:\t" + h.footage + " sqr FT.");

        Office o = new Office();
    }
}