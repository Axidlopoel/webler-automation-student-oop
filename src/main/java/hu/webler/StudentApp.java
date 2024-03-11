package hu.webler;

import hu.webler.model.Student;
import hu.webler.model.Teacher;
import hu.webler.value.School;

public class StudentApp {

    public static void main(String[] args) {

        Student student = new Student();
        System.out.println(student);
        Student first = new Student("Elek", "Teszt", 26);
        System.out.println(first);
        Student second = new Student("Elek", "Viz", 19);
        System.out.println(second);
        System.out.println(first);
        System.out.println(student);

        String firstFirstName = first.getFirstName();
        String secondFirstName = second.getFirstName();
        boolean isFirstNameEquals = firstFirstName.equals(secondFirstName);
        System.out.println("A két keresztnév egyezik: " + isFirstNameEquals);

        String name = "Elek";
        boolean isNameEquals = first.getFirstName().equals(name);
        System.out.println("A két keresztnév egyezik: " + isNameEquals);

        String nameOther = new String("Elek");
        boolean isOtherNameEquals = first.getFirstName().equals(nameOther);
        System.out.println("A két keresztnév egyezik: " + isOtherNameEquals);

        boolean oMG1 = name == firstFirstName;
        System.out.println("A két keresztnév egyezik: " + oMG1);

        boolean oMG2 = name == nameOther;
        System.out.println("A két keresztnév egyezik: " + oMG2);

        String nameOther2 = new String("Elek");
        boolean oMG3 = nameOther2 == nameOther;
        System.out.println("A két keresztnév egyezik: " + oMG3);

        Teacher teacher = new Teacher("Csaba");
        System.out.println(teacher);

        System.out.println(School.GREENFOX);
    }
}
