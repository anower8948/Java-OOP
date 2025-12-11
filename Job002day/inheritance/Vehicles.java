package job002day.inheritance;

class Vehicles {

    String name;
    int wheels;
    double speed;

    
    void go() {
        System.out.println("The vehicle is going at " + speed + " km/h.");
    }

    void stop() {
        System.out.println("The vehicle has stopped.");
    }

    public static void main(String[] args) {
        Vehicles some = new Vehicles();
        some.wheels = 4;
        some.stop();
    }

    public static void example() {
        System.out.println("This is a static method in the Vehicles class.");
    }

}