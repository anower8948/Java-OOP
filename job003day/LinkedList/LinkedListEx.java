package job003day.LinkedList;
import java.util.*;

public class LinkedListEx {
    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        cars.addFirst("F-16");
        System.out.println(cars);
        cars.addLast("F-100");
        System.out.println(cars);
        System.out.println(cars.getFirst());
        Collections.sort(cars);
        System.out.println(cars);
        Collections.sort(cars,Collections.reverseOrder());
        System.out.println(cars);

    }
}
