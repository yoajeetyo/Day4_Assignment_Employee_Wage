public class EmployeeWage {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	public static void wageCalculationForAMonth(int empRatePerHr, int totalWorkingDaysInAMonth, int maxHrsInAMonth) {
		int totalWage = 0;
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;
		while (totalEmpHrs <= maxHrsInAMonth && totalWorkingDays < totalWorkingDaysInAMonth) {
			int empHrs = 0;
			totalWorkingDays++;
			int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (employeeCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			int empWage = empHrs * empRatePerHr;
			System.out.println("Emp Wage is : " + empWage);
			totalWage += empWage;
		}
		System.out.println("Total working hours in a month is : " + totalEmpHrs);
		System.out.println("Total Wage is : " + totalWage);

	}

	public static void main(String[] args) {
		wageCalculationForAMonth(20, 20, 100);
	}
}

