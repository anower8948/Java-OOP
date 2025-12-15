package job002day.inheritance.shape;

public class Shape {
    private double height;
    private double width;

    // set hieght and witdth
    public void setValues(double height, double width) {
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }   
    public double getWidth() {
        return width;
    }
}
