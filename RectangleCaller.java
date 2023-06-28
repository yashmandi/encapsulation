public class RectangleCaller {
    public static void main(String[] args) {
        // Creating object of "Rectangle"
        Rectangle r1 = new Rectangle();

        // Setting values using setter
        r1.setLength(20.5);
        r1.setWidth(50.5);

        // Getting values using getter
        double len = r1.getLength();
        double wid = r1.getWidth();

        // Printing the result
        System.out.println("Length is " + len + " and Width is " + wid);

    }  
}
