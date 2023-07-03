package com.rd.person;

public class Man extends Person {

    public Man(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.partner = null;
        this.gender = "M";
    }

    @Override
    public boolean isRetired() {
        boolean isRetired;
        String isRetiredPrint;

        isRetired = getAge() >= 65;
        isRetiredPrint = (isRetired)? ("ТАК"): ("НІ");
        System.out.println(getFirstName() + " " + getLastName() + " - цей чоловік вже на пенсії? " + isRetiredPrint);
        return isRetired;
    }

    @Override
    public void registerPartnership(Person person) {
        setPartner(person);
        person.setPartner(this);
        person.setLastName(getLastName() + "(a)");
        System.out.print("Співчуваю! " + this.firstName + " " + this.lastName + " тепер одружений. Його дружина: " + person.getFirstName() + " " + person.getLastName() + ".");
    }

    @Override
    public void deregisterPartnership(boolean isReturnLastName) {
        System.out.print("Нажаль, " + this.firstName + " " + this.lastName + " та " + partner.getFirstName() + " " + partner.getLastName() + " не зійшлися характерами.");
        if (isReturnLastName) {
            partner.setLastName(((Woman) partner).getMaidenName());
        }
        partner.setPartner(null);
        setPartner(null);
    }

}
