package hu.webler.model;

// Parent class
public class Person {

    // közös mező vagy mezők a gyermekekben
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public Person() {
        this("");
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}