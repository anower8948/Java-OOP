package job003day.Abstraction;

public class Car extends Vehicles implements Interfac{

    @Override
    void go(){
        System.out.println("The Driver is driving the Car");
    }

    @Override
    public void honk(){
        System.out.println("Peeeeeppp Peeeeeeeeeeeppppp");    
    }
    
    
}
