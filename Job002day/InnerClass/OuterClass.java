package job002day.InnerClass;

public class OuterClass {
    int number = 10;

    public void HeyThere() {
        System.out.println("Hello from OuterClass!");
        // local inner class
        class LocalInnerClass {
            String localNumber = "Yeah Real Real Real!";
            public void LocalMethod() {
                System.out.println("Hello from LocalInnerClass! " + localNumber);
            }
        }
        // create an instance of the local inner class and call its method
        LocalInnerClass localInner = new LocalInnerClass();
        localInner.LocalMethod();
    }

    // static inner class
    public static class InnerClass{
        int innerNumber = 20;
        public void InnerMethod() {
            System.out.println("Hello from InnerClass!");
        }
    }

}
