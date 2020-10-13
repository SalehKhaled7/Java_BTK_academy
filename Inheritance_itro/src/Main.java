public class Main {
    //Inheritance : making new classes for common fields and methods
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Customer customer1 = new Customer();

        employee1.firstName="ali";
        customer1.firstName="ali";


        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();

        customerManager.add();
        employeeManager.add();



    }
}
