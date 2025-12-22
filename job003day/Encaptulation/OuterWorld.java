package job003day.Encaptulation;

public class OuterWorld {
    public static void main(String[] args) {
        Lockedthings myObject = new Lockedthings();

        System.out.println( " My Name is " + myObject.getName());
        System.out.println(" My age is "+ myObject.getAge());
        System.out.println(" My gender is "+ myObject.getGender());
        System.out.println(" ");

        myObject.setName("Nokia");
        myObject.setAge("20");
        myObject.setGender(" Not LGBT ");

        
        System.out.println( " My Name is " + myObject.getName());
        System.out.println(" My age is "+ myObject.getAge());
        System.out.println(" My gender is "+ myObject.getGender());
        System.out.println(" ");
    }
}
