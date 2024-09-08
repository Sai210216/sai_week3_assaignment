import java.util.Scanner;
class Shape {

  public double calculateArea() {
        System.out.println("The area of this shape is undefined.");
        return 0;
    }
}
 class Circle extends Shape {
    double radius;
 
    public Circle(double radius) {
        this.radius = radius;
    }
 
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
 
class Rectangle extends Shape {
    double length, width;
 
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
 
    public double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base, height;
 
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
 
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

 
class Test {
    public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of Circle");
        Shape circle = new Circle(sc.nextInt()); 
        System.out.println("Enter Length and Width of rectangle");		
        Shape rectangle = new Rectangle(sc.nextInt(), sc.nextInt()); 
        System.out.println("Enter Base and height of traingle");
		Shape triangle = new Triangle(sc.nextInt(), sc.nextInt());
		
        System.out.println("Circle area: " + circle.calculateArea());        
        System.out.println("Rectangle area: " + rectangle.calculateArea());  
        System.out.println("Triangle area: " + triangle.calculateArea());   
        
    }
}
