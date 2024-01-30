package JAN_Pac;

public class Lab18_employeemain {

	public static void main(String[] args) {
		Employee employee=new Employee();
	     employee.setFname("");
	     employee.setLname("");
	    
	        EmployeeName ck = new EmployeeName();
	        try {
	            ck.empdetails(employee.getFname(),employee.getLname());
	 System.out.println("Employee name is "+employee.getFname()+" "+employee.getLname());
	        } catch (InvalidNameException e) {
	            System.out.println("Invalid Name " + e.getMessage());
	        }
	}
}
