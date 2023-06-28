public class CarCaller {
    public static void main(String[] args) {
        // Creating Car object
        Car c1 = new Car();

        // Setting values using setter
        c1.setCompanyName("Audi");
        c1.setModelName("A8");
        c1.setYear(2020);

        // Getting values using getter
        String name = c1.getCompanyName();
        String model = c1.getModelName();
        int year = c1.getYear();
        double mileage = c1.getMileage();

        // Printing the values
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);

    }
}
