package job002day.inheritance.shape;

public class polymorphism {
    public static void main(String[] args) {
        Shape shape;


        Trainagle triangle = new Trainagle();
        shape = triangle;
        shape.setValues(10, 20);
        System.out.println("Triangle Area: " + triangle.getArea());

        Rectangele rectangle = new Rectangele();
        shape = rectangle;
        shape.setValues(10, 20);
        System.out.println("Rectangle Area: " + rectangle.getArea());
    }
}
