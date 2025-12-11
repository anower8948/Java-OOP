package job002day.polymorphism;

public class ploymorph {
    public static void main(String[] args) {
        // Create an instance of the Animal class
        Animal animal = new Animal();
        animal.bark(); // Output: Animal is barking
        animal.eat();  // Output: Animal is eating
        Doggy dog = new Doggy();
        dog.bark(); // Output: Animal is barking
        dog.eat();  // Output: Animal is eating
        Catty cat = new Catty();
        cat.bark(); // Output: Animal is barking
        cat.eat();  // Output: Animal is eating
    }
    
}
