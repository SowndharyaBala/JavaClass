package com.inheritance;

class Animal {
    void eat() {
        System.out.println("It eats");
    }
}

// Class names should start with uppercase letters
class Elephant extends Animal {
    void colour() {
        System.out.println("Black in colour");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Barking");
    }
}

public class Hier_Inheri {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat(); // Output: It eats
        
        Elephant e = new Elephant();
        e.eat();   // Inherited method from Animal
        e.colour(); // Output: Black in colour
        
        Dog d = new Dog();
        d.sound(); // Output: Barking
        d.eat();   // Inherited method from Animal
    }
}


