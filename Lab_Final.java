public class Lab_Final {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4 ,3);
        Shape circle  = new Circle(34);
        Shape tringle = new Triangle(2,29,4);



        System.out.println("Rectangle: " + rectangle.area());
        System.out.println("Circle: " + circle.area());
        System.out.println("Triangle: " + tringle.area());

        System.out.println();

        System.out.println("Rectangle: " + rectangle.perimeter());
        System.out.println("Circle: " + circle.perimeter());
        System.out.println("Triangle: " + tringle.perimeter());


    }
}
interface Shape {
    double area();
    double perimeter();
}
class Rectangle implements Shape {
    double width;
    double height;
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double area() {
        return width * height;

    }
    @Override
    public double perimeter() {
        return width * height;
    }

}
class Circle implements Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;

    }
    @Override
    public double area() {
        return radius * radius;

    }
    @Override
    public double perimeter() {
        return 2 * radius;
    }

}
class Triangle implements Shape {
    double a;
    double b;
    double c;
    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double area() {
        return a * b * c;

    }
    @Override
    public double perimeter() {
        return a * b * c;

    }

}