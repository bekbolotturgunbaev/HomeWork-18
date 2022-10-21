import Home.Apartment;
import Home.Hostel;
import Home.Hotel;
import Home.Pay;
import Person.Family;
import Person.FamilyOfApartment;
import Person.FamilyOfHostel;
import Person.FamilyOfHotel;

public class Main {

    public static void main(String[] args) {

        Pay house1 = new Apartment();
        Pay house2 = new Hostel();
        Pay house3 = new Hotel();

        Family[] family = {new FamilyOfApartment("Alex","Lisa","Jon",70,"Semenovskaya ploshad 34"),
                new FamilyOfHostel("Kevin","Kirra",null,100,"Bakuninskaya 11"),
                new FamilyOfHotel("Mark","Bella","Klark",200,"Preobrajenskaya 4")};

        for (Family fam : family) {
            if (fam instanceof FamilyOfApartment) {
                System.out.println(fam);
                house1.method();
                System.out.println("__________________________________________________________________________");
            }
        }

        for (Family fam : family) {
            if (fam instanceof FamilyOfHostel) {
                System.out.println(fam);
                house2.method();
                System.out.println("__________________________________________________________________________");
            }
        }

        for (Family fam : family) {
            if (fam instanceof FamilyOfHotel) {
                System.out.println(fam);
                house3.method();
            }
        }


    }
}
