package job002day.Abstration;

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
    public static void main(String[] args) {
        Cat catblack = new Cat();
        catblack.eat("Cat");     // Output: This animal eats food.
    }
}