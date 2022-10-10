
public class EmployeeWagesUsingClassMethod {
	final int IS_PART_TIME=1;
	final int IS_FULL_TIME=2;
	final int EMP_RATE_PER_HOUR=20;
	final int NUM_OF_WORKING_DAYS=20;
	final int MAX_HRS_IN_MONTH=100;
	
	public void EmplyeeWagesUsingClassMethod() {
	
	//variables
	int empHrs=0;
	int totalEmpwage=0;
	int totalEmpHrs=0;
	int totalWorkingdays=0;
	
	while(totalEmpHrs<=MAX_HRS_IN_MONTH && 
			totalWorkingdays<NUM_OF_WORKING_DAYS) {
	   totalWorkingdays++;
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
	   System.out.println("Day:" +totalWorkingdays+ "EmpHr:" +empHrs);
  }
  totalEmpwage=totalEmpHrs*EMP_RATE_PER_HOUR;	
  System.out.println("Total Emp Wage:" +totalEmpwage);
	}

	public static void main(String[] args) {
		 EmployeeWagesUsingClassMethod employeeObj=new EmployeeWagesUsingClassMethod();
		 employeeObj.EmplyeeWagesUsingClassMethod();	
		
	}

}
