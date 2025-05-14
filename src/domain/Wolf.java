
package domain;

public class Wolf extends Predator {
    private String biteForce;

    public Wolf(String name, int age, double weight, String biteForce) {
        System.out.println("Wolf created with bite force: " + biteForce);
    }

    public Wolf() {
        System.out.println("Wolf created");
    }

    public void communicateWithPack() {
        System.out.println("Wolf is howling with the pack");
    }
}
