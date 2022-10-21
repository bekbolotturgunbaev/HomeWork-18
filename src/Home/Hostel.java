package Home;

import Person.FamilyOfHostel;

public class Hostel implements Pay {
    private FamilyOfHostel familyOfHostel;

    public Hostel(FamilyOfHostel familyOfHostel) {
        this.familyOfHostel = familyOfHostel;
    }

    @Override
    public void method() {
        System.out.println("This is a family paying for rent");
    }

    @Override
    public String toString() {
        return "They live in the hostel\n"  + familyOfHostel;
    }
}
