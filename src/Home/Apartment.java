package Home;

import Person.FamilyOfApartment;

import java.util.Arrays;

public class Apartment implements Pay {
    private FamilyOfApartment familyOfApartment;

    public Apartment(FamilyOfApartment familyOfApartment) {
        this.familyOfApartment = familyOfApartment;
    }

    @Override
    public void method() {
        System.out.println("This is a family paying for a utility service");
    }

    @Override
    public String toString() {
        return "They live in the apartment\n"  + familyOfApartment;
    }
}
