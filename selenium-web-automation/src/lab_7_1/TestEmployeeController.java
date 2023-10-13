package lab_7_1;

import java.util.Arrays;

public class TestEmployeeController {
    public static void main(String[] args) {
        // Create 3 full-time employees
        Employee FulltimeEmployee1 = new FulltimeEmployee();
        Employee FulltimeEmployee2 = new FulltimeEmployee();
        Employee FulltimeEmployee3 = new FulltimeEmployee();
        // Create 2 contractors
        Employee contractor1 = new Contractor();
        Employee contractor2 = new Contractor();

        int totalSalary = EmployeeController.totalSalary(Arrays.asList(FulltimeEmployee1,FulltimeEmployee2, FulltimeEmployee3, contractor1,contractor2));
        System.out.printf("Total salary is: %d", totalSalary);
    }
}
