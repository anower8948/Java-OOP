package job002day.staticvsnonstatic;

public class cat {
    String name;
    int age;
    int livesRemaining;

    public void meow() {
        System.out.println(name + " says: Meow!");
    }

    public static void bark() {
        System.out.println("Woof! Woof!");
    }
}
