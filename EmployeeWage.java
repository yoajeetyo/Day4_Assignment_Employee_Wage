public class EmployeeWage {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int TOTAL_DAYS=20;
	public static final int MAX_HRS_IN_A_MONTH=100;

	public static void main(String[] args) {
		int totalWage=0;
		int totalWorkingDays=0;
		int totalEmpHrs=0;
		while (totalEmpHrs<=MAX_HRS_IN_A_MONTH && totalWorkingDays<TOTAL_DAYS){
			int empHrs=0;
			totalWorkingDays++;
		int employeeCheck =(int) Math.floor(Math.random() * 10) % 3;
		switch (employeeCheck) {
			case IS_FULL_TIME :
				empHrs=8;
				break;
			case IS_PART_TIME :
				empHrs=4;
				break;
			default :
				empHrs=0;
		}
		totalEmpHrs +=empHrs;
		int empWage=empHrs*EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage is : "+empWage );
		totalWage+=empWage;
		}
		System.out.println("Total working hours in a month is : "+totalEmpHrs);
		System.out.println("Total Wage is : "+totalWage);
	}
}
