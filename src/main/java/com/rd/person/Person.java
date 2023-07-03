package com.rd.person;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected Person partner;
    protected String gender;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public abstract boolean isRetired ();

    public abstract void registerPartnership(Person person);

    public abstract void deregisterPartnership(boolean isReturnLastName);

    @Override
    public String toString() {
        String partnerName;
        partnerName = (partner == null)? (null): (partner.firstName + " " + partner.lastName);
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", partner=" +  partnerName +
                ", gender='" + gender + '\'' +
                '}';
    }
}
