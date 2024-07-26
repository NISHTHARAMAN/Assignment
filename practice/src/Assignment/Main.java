package Assignment;

import com.nishtha.assignment.employees.Developer;
import com.nishtha.assignment.employees.Manager;
import com.nishtha.assignment.utilities.EmployeeUtilities;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager ma = new Manager("Nishtha",12,23000,"Javascript");
        Developer de = new Developer("krishna", 34, 3400000,"Python");
        EmployeeUtilities employeeUtilities = new EmployeeUtilities();
        
        
       
        
		employeeUtilities.display(ma);
		 System.out.println("Department : "+ma.getDepartment());
		
        System.out.println();
        employeeUtilities.display(de);
        System.out.println("Skills : "+de.getSkills());
	}

}
