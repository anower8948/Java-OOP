package job002day.Abstration;

public class AbstractionExample {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        Animal a2 = new Dog();

        a1.makeSound(); // Meow
        a2.makeSound(); // Woof

        a1.eat("Bilai");       // This animal eats food.
        a2.eat("Kukur");       // This animal eats food.
    }
}
