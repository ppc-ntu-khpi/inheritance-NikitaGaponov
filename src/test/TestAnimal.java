
package test;

import domain.*;

public class TestAnimal {
    public static void main(String[] args) {
        Wolf wolf = new Wolf("Grey", 5, 45.5, "Strong");
        wolf.eat();
        wolf.speak();
        wolf.hunt();
        wolf.communicateWithPack();
        
        Amimal animal = new Amimal();
        animal.eat();
        animal.speak();
        animal.StringtoString();
    }
}
