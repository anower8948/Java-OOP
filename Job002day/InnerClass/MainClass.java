package job002day.InnerClass;

public class MainClass {

    public static void main(String[] args) {

        OuterClass outer = new OuterClass();
        outer.HeyThere();

        OuterClass.InnerClass inner =  new OuterClass.InnerClass();
        inner.InnerMethod();
        System.out.println("Inner number: " + inner.innerNumber);
    }
}

