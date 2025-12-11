package job002day.Abstration;

abstract class Animal {
    abstract void makeSound();

    void eat(String animalName) { 
        System.out.println("This " + animalName + "  eats food.");
    }
}
