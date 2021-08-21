public class EmployeeWage {
	public static int IS_PRESENT = 1;

	public static void main(String[] args) {
		double employeeCheck = Math.floor(Math.random() * 10) % 2;
		if (employeeCheck == IS_PRESENT) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is not present");
		}
	}
}
