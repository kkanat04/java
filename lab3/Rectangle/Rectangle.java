package lab3.Rectangle;

public class Rectangle {

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public void printInfo() {
        System.out.println("width: " + width);
        System.out.println("height: " + height);
        System.out.println("area: " + area());
        System.out.println("perimeter: " + perimeter());
    }
}
