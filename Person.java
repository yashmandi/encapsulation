/* Q- Write a Java program to create a class called Person with private instance variables name,
age. and country. Provide public getter and setter methods to access and modify these variables */

class Person{
    private String name;
    private int age;
    private String country;

    // Setting the getters and setters to the variable

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}