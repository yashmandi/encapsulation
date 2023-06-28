public class EmployeeCaller {
    public static void main(String[] args) {

        // Creating object of "Employee"
        Employee e1 = new Employee();

        // Assigning values using getter and setter
        e1.setEmployeeId(01);
        e1.setEmployeeName("Abc");
        e1.setEmployeeSalary(15000);

        int e1id = e1.getEmployeeId();
        String e1Name = e1.getEmployeeName();
      //   double e1Sal = e1.getEmployeeSalary();
        String e1FromatSal = e1.getFormatSal();

        // Printing 
        System.out.println("Employee ID: " + e1id);
        System.out.println("Employee Name: " + e1Name);
        // System.out.println("Employee Salary: " + e1Sal);
        System.out.println("Formatted Salary: " + e1FromatSal);
    }
}
