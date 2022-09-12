package Q1;

import java.util.List;

public class detailswithdname {
	
	public static void main(String[] args) {
		EmpDao ed=new EmpDao();
		
		List<Employee> em = null;
		try {
			em = ed.getAllEmployeeWithDeptName("HR");
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Employee e:em) {
			System.out.println(e.getEmpId());
			System.out.println(e.getEmpName());
			System.out.println(e.getAddress());
			System.out.println(e.getSalary());
			System.out.println(e.getDept());
		}
	}

}
