public class PersonCaller {
    public static void main(String[] args) {
        
        // Creating an object of a "Person" Class
        Person p1 = new Person();
        Person p2 = new Person();

        // Setting the values using setters
        p1.setName("abc");
        p1.setAge(21);
        p1.setCountry("India");

        p2.setName("xyz");
        p2.setAge(12);
        p2.setCountry("UAE");

        // Getting the values using getters
        String p1name = p1.getName();
        int p1age = p1.getAge();
        String p1country = p1.getCountry();

        // Printing out the result
        System.out.println("Name: " + p1name);
        System.out.println("Age: " + p1age);
        System.out.println("Country: " + p1country);

        System.out.println("Name: " + p2.getName());
        System.out.println("Age: " + p2.getAge());
        System.out.println("Country: " + p2.getCountry());
        
    }
}
