
public class EmployeeWageForMultipleCompanies {
	 public static final int IS_PART_TIME=1;
		public static final int IS_FULL_TIME=2;
		private final String company;
		private final int empRatePerHour;
		private final int numOfWorkingDays;
		private final int maxHoursPerMonth;

		public EmployeeWageForMultipleCompanies(String company, int empRatePerHour,
				                          int numOfWorkingDays, int maxHoursPerMonth) {
			this.company=company;
			this.empRatePerHour=empRatePerHour;
			this.numOfWorkingDays=numOfWorkingDays;
			this.maxHoursPerMonth=maxHoursPerMonth;
		}
		private int computeEmpWage() {
			
			//variables
			int empHrs=0, totalEmpHrs=0, totalWorkingDays=0;

			while(totalEmpHrs<=maxHoursPerMonth && totalWorkingDays<numOfWorkingDays){
				totalWorkingDays++;
				
			   int empcheck=(int)Math.floor(Math.random()*10)%3;
			   switch(empcheck) {
			     case IS_FULL_TIME:
			    	empHrs=8;
			    	break;
			     case IS_PART_TIME:
				    empHrs=4;
				    break;
			     default:
			        empHrs=0;
			  }
		   	
			totalEmpHrs+=empHrs;
			System.out.println("Day#:"+totalWorkingDays+ "EmpHrs:"+empHrs);
			}
			return totalEmpHrs*empRatePerHour;
		}
		
		public static void main(String[] args) {
			 EmployeeWageForMultipleCompanies employeeObject1=new EmployeeWageForMultipleCompanies("Jio" ,20,2,10);
			 EmployeeWageForMultipleCompanies employeeObject2=new  EmployeeWageForMultipleCompanies("Amazon",25, 5,15);
			 System.out.println("Total employee wage for company " 
			           +employeeObject1.company+ " is:" +employeeObject1.computeEmpWage());
			 System.out.println("Total employee wage for company " 
			           +employeeObject2.company+ " is:" +employeeObject2.computeEmpWage());
			 
			
			
			
		}

}
