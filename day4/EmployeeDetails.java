package week1.day4;

public class EmployeeDetails {
public void EmployeeDetails() {
	String EmployeeName="sandy";
	int EmployeeId=9;
	System.out.println("EmployeeName");
	System.out.println("EmployeeId");
}
public void EmployeeAddress() {
	String EmployeeAddress="Chennai";
	
	System.out.println("EmployeeAddress");
}
public void EmployeeSalary() {
	double EmployeeSalary=345666;
	System.out.println("EmployeeSalary");
}
public void EmployeeMobileNumber() {
	long EmployeeMobileNumber=56448836l;
	System.out.println("EmployeeMobileNumber");
}
public static void main(String[] args) {
	EmployeeDetails dets=new EmployeeDetails();
	dets.EmployeeAddress();
	dets.EmployeeDetails();
	dets.EmployeeMobileNumber();
	dets.EmployeeSalary();
	
	
}
	
	
	
}

