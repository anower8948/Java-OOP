package job003day.ArrayList;
import java.util.ArrayList;

public class ArrayListPractise {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volbo1");
        cars.add("BMW2");
        cars.add("FORD3");
        cars.add("MADZA4");
        cars.add("TOYTOTA");

        System.err.println(cars);
        cars.add(0,"F-15");
        System.err.println(cars);
        cars.get(0);
        cars.set(0,"F-22");
        System.err.println(cars);
        cars.remove(1);
        System.err.println(cars);
        System.out.println(cars.size());

        for(int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }

        for(String i: cars){
            System.out.println(i);
        }
        
        cars.clear();
        System.err.println(cars);

        
    }
}
