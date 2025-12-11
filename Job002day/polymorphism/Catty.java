package job002day.polymorphism;

public class Catty extends Animal{
    String name = "Catty";
    int age = 3;
    
    void bark() {
        System.out.println("Catty is meowing");
    }
    void eat() {
        System.out.println("Catty is eating fish");
    }
}
