
package domain;

public class Amimal {
    private String name;
    private int age;
    private double weight;

    public Amimal() {
        System.out.println("Animal created");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void StringtoString() {
        System.out.println("Name: " + name + ", Age: " + age + ", Weight: " + weight);
    }

    public void speak() {
        System.out.println("Animal makes a sound");
    }
}
