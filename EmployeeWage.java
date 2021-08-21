public class EmployeeWage {
	public static int IS_FULL_TIME = 1;
	public static int EMP_RATE_PER_HOUR=20;

	public static void main(String[] args) {
		int empHrs=0;
		int empWage=0;
		double employeeCheck = Math.floor(Math.random() * 10) % 2;
		if (employeeCheck == IS_FULL_TIME) {
			empHrs=8;
		} else {
			empHrs=0;
		}

		empWage=empHrs*EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage is : "+empWage );
	}
}
