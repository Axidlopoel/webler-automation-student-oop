package hu.webler.model;

/*
Amikor egy változót static-ként deklarálunk egy osztályban, az az osztályhoz tartozik, nem pedig az osztály példányaihoz.
Ez azt jelenti, hogy minden osztálypéldány megosztja ugyanazt az static változót. Tehát ha módosítunk egy static változót
egy példányban, az a módosítás más példányokra is érvényes lesz, mivel azok mind ugyanarra a static változóra hivatkoznak.
Ezáltal a counter változó minden Student osztály példányához tartozik, és az összes példány megosztja és módosíthatja azt.
*/

// Child class, inheritance with extends keyword! -> öröklés az extends kulcsszó használatával!
public class Student extends Person {

    private String lastName;
    private int age;

    private static int counter;

    // mivel ez meghivja a paraméteres constructor-t, igy helyesen fogja növelni countert!
    public Student() {
        this("", "", 0);
    }

    /*
    A counter növelése a konstruktorban történik, tehát minden alkalommal, amikor egy új Student objektumot hozunk létre,
    a counter automatikusan növekszik. Ez azt jelenti, hogy minden példányosítás esetén a counter értéke frissül, és
    mindig megfelelően jelzi az összes létrehozott Student objektum számát.
     */
    public Student(String firstName, String lastName, int age) {
        super(firstName);
        this.lastName = lastName;
        this.age = age;
        counter++;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public static int getCounter() {
        return counter;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void setCounter(int counter) {
        Student.counter = counter;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' + '\'' +
                ", counter='" + counter + '\'' +
                '}';
    }
}