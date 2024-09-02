package employees;
import employees.Manager;
import employees.Developer;
import employees.Employeeutilities;

public class Assignmentmain {
	public static void main(String[] args) {
        // Creating a Manager instance
        Manager manager = new Manager();
        manager.setName("Rohith H");
        manager.setEmployeeId(072);
        manager.setSalary(95000);
        manager.setDepartment("Sales");

        // Creating a Developer instance
        Developer developer = new Developer();
        developer.setName("ram");
        developer.setEmployeeId(002);
        developer.setSalary(85000);
        developer.setProgrammingLanguage("Java");

        // Using EmployeeUtilities methods or functions
        EmployeeUtilities.increaseSalary(manager, 10);  // Increasing salary by 10%
        EmployeeUtilities.increaseSalary(developer, 15);  // Increasing salary by 15%

        // Printing employee details by passing manager or developer instance 
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);
    }

}
