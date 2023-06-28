public class CircleCaller {
    public static void main(String[] args) {
        // Creating object
        Circle c1 = new Circle();

        // Setting the values
        c1.setRadius(12.0);

        // Getting the radius
        double radius = c1.getRadius();

        // Calculate and print result
        double area = c1.calculateArea();
        double perimeter = c1.calculatePerimeter();

        System.out.println("Circle Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }   
}
