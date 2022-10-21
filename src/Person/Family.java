package Person;

import Home.Apartment;

public abstract class Family  {
    private String nameIsFather;
    private String nameIsMother;
    private String nameIsChild;
    private int pay;
    private String address;

    public Family(String nameIsFather, String nameIsMother, String nameIsChild, int pay,String address) {
        this.nameIsFather = nameIsFather;
        this.nameIsMother = nameIsMother;
        this.nameIsChild = nameIsChild;
        this.pay = pay;
        this.address =address;
    }

    @Override
    public String toString() {
        return "name is Father: " + nameIsFather + "\n" +
                "name is Mother: " + nameIsMother + "\n" +
                "name is Child: " + nameIsChild + "\n" +
                "pay: " + pay + "$\n" +
                "address: " + address;
    }

    public String getNameIsFather() {
        return nameIsFather;
    }

    public void setNameIsFather(String nameIsFather) {
        this.nameIsFather = nameIsFather;
    }

    public String getNameIsMother() {
        return nameIsMother;
    }

    public void setNameIsMother(String nameIsMother) {
        this.nameIsMother = nameIsMother;
    }

    public String getNameIsChild() {
        return nameIsChild;
    }

    public void setNameIsChild(String nameIsChild) {
        this.nameIsChild = nameIsChild;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
