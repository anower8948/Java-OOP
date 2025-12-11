package job002day.polymorphism;

public class Doggy extends Animal{
    String name = "Doggy";

    void bark() {
        System.out.println("Doggy is barking");
    }
    void eat() {
        System.out.println("Doggy is eating bone");
    }
    public void cry() {
        System.out.println("Doggy is crying");
    }

}
