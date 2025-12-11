package job002day.inheritance;

public class Bus extends Vehicles{
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        bus1.speed = 60.0;
        bus1.go();

        Vehicles.example();
    }


}
