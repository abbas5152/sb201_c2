package Q1;

public class emptodep {
	public static void main(String[] args) {
		EmpDao ed=new EmpDao();
		
		try {
			ed.registerEmployeeTODepartment(3, 1);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DepartmentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
