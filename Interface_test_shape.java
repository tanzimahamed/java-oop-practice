
public class Interface_test_shape {
    public static void main(String[] args) {
        Shape Circle =new Circle(7);
        Shape Rectangle =new Rectangle(5,5);
        Shape Triangle =new Triangle(5,5);

        System.out.println("Circle:"+Circle.getArea());
        System.out.println("Rectangle:"+Rectangle.getArea());
        System.out.println("Triangle:"+Triangle.getArea());

        System.out.println();

        System.out.println("Perimeter:"+Circle.getPerimeter());
        System.out.println("Area:"+Rectangle.getArea());
        System.out.println("Perimeter:"+Triangle.getArea());


    }
}
interface Shape {
    double getArea();
    double getPerimeter();

}
class Circle implements Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;

    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;

    }
}
class Rectangle implements Shape {
    double length;
    double width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;

    }
    public double getArea() {
        return length * width;

    }
    public double getPerimeter() {
        return length * width;

    }

}
class Triangle implements Shape {
    double length;
    double width;
    Triangle(double length, double width) {
        this.length = length;
        this.width = width;

    }
    @Override
    public double getArea() {
        return length * width;

    }
    @Override
    public double getPerimeter() {
        return length * width;
    }
}