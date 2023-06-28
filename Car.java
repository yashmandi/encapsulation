// Write a Java program to create a class called Car with private instance variables company_name, model_name, year, and mileage.
// Provide public getter and setter methods to access and modify the company_name, model_name, and year variables.
// However, only provide a getter method for the mileage variable.

class Car {
    private String companyName;
    private String modelName;
    private int year;
    private double mileage;

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getYear () {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }
}
