package job001day;

public class ControlFlow {

    static void staticmethod(){
        System.out.println("Static method can be called without creating an object of the class");
    }

    public void nonStaticMethod(){
        System.out.println("Non-static method can be called only by creating an object of the class");
    }
    public static void main(String args[]){

        staticmethod();
        
        ControlFlow objeControlFlow = new ControlFlow();
        objeControlFlow.nonStaticMethod(); 
    }
}
