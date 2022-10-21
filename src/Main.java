import Home.Apartment;
import Home.Hostel;
import Home.Hotel;
import Home.Pay;
import Person.Family;
import Person.FamilyOfApartment;
import Person.FamilyOfHostel;
import Person.FamilyOfHotel;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Apartment apartment = new Apartment(new FamilyOfApartment("Alex","Lisa","Jon",70,"Semenovskaya ploshad 34"));
        Hostel hostel = new Hostel(new FamilyOfHostel("Kevin","Kirra",null,100,"Bakuninskaya 11"));
        Hotel hotel = new Hotel( new FamilyOfHotel("Mark","Bella","Klark",200,"Preobrajenskaya 4"));

        Pay[] pay = {apartment,hostel,hotel};

        for (Pay fam : pay) {
            if (fam instanceof Apartment) {
                System.out.println(fam);
                apartment.method();
                System.out.println("__________________________________________________________________________");
            }
        }

            for (Pay fam : pay) {
                if (fam instanceof Hostel) {
                    System.out.println(fam);
                    hostel.method();
                    System.out.println("__________________________________________________________________________");
                }
            }

            for (Pay fam : pay) {
                if (fam instanceof Hotel) {
                    System.out.println(fam);
                    hotel.method();
                }
            }



    }
}
