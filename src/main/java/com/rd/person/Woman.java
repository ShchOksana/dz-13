package com.rd.person;

public class Woman extends Person {
    private final String maidenName;

    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.partner = null;
        this.gender = "W";
        maidenName = this.lastName;
    }

    @Override
    public boolean isRetired() {
        boolean isRetired;
        String isRetiredPrint;
        isRetired = getAge() >= 60;
        isRetiredPrint = (isRetired)? ("ТАК"): ("НІ");
        System.out.println(getFirstName() + " " + getLastName() + "- ця жінка вже на пенсії? " + isRetiredPrint);
        return isRetired;
    }

    @Override
    public void registerPartnership(Person person) {
    setPartner(person);
    person.setPartner(this);
    setLastName(person.getLastName() + "(a)");
    System.out.print("Вітаю! " + this.firstName + " " + this.lastName + " тепер заміжня! Її чоловік " + person.getFirstName() + " " + person.getLastName() + ".");
    }

    @Override
    public void deregisterPartnership(boolean isReturnLastName) {
        System.out.print("Нажаль, " + this.firstName + " " + this.lastName + " та " + partner.getFirstName() + " " + partner.getLastName() + " не зійшлися характерами.");
        partner.setPartner(null);
        setPartner(null);
        if (isReturnLastName) {
            setLastName(maidenName);
        }
    }

    public String getMaidenName() {
        return maidenName;
    }

}
