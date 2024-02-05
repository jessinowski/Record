package com.github;

public class Main {
    public static void main(String[] args) {
        //Step 5:
        //In your main method, let multiple `Animal` objects have the same `Species`.
        Species cat = new Species("Cat", 2000);
        Species bird = new Species("Bird", 500);
        Species bear = new Species("Bear", 5000);

        Owner me = new Owner("Jessica", 30, "Hamburg");

        //Step 2:
        //In a main method, create multiple Animals.
        //Call the automatically generated methods in the Record and check if they do what you expect (equals, toString).

        Animal tiger = new Animal(123, "Tiger", cat, 5, null);
        Animal pelikan = new Animal(124, "Pelikan", bird, 3, null);
        Animal lion = new Animal(135, "Lion", cat, 8, null);
        Animal grizzly = new Animal(158, "Grizzly", bear, 10, me);

        System.out.println(tiger.equals(pelikan));
        System.out.println(tiger.toString());
        System.out.println(grizzly.toString());
        System.out.println(tiger.species().equals(lion.species()));
    }
}