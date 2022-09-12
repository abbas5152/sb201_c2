package Q1;

public class addemp {

	public static void main(String[] args) {
		EmpDao ed=new EmpDao();
		
		Employee emp=new Employee();
		emp.setEmpName("abbas");
		emp.setSalary(23758);
		emp.setAddress(new Address("jam","gj","676876"));
		
		
	
		
		ed.addEmployee(emp);
	}
}
