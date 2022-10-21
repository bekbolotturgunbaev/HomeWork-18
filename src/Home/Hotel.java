package Home;

import Person.FamilyOfHotel;

public class Hotel implements Pay {
    private FamilyOfHotel familyOfHotel;

    public Hotel(FamilyOfHotel familyOfHotel) {
        this.familyOfHotel = familyOfHotel;
    }

    @Override
    public void method() {
        System.out.println("This is a family paying for rent");
    }

    @Override
    public String toString() {
        return "They live in the hotel\n"  + familyOfHotel;
    }
}
