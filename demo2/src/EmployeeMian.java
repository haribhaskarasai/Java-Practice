/**
 * 
 * @author haribhaskarasain
 *
 */
public class EmployeeMian {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.empNo = 45;
		employee.firstName = "Hari";
		employee.lastName = "Nimmala";
		employee.salary = 30000;
		System.out.println("Full Name is : " + employee.fullName());
		Employee employee2 = new Employee();
		employee2.empNo = 55;
		employee2.firstName = "venky";
		employee2.lastName = "katta";
		employee2.salary = 35000;
		System.out.println("Full Name is : " + employee2.fullName());
		System.out.println("Sum of the salaries of two employees : " + (employee.salary + employee2.salary));
		if (employee.salary >= employee2.salary) {
			System.out.println("First employee has highest salary");
		} else {
			System.out.println("Second employee has highest salary");
		}
	}

}
