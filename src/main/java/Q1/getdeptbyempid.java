package Q1;

public class getdeptbyempid{
	
	public static void main(String[] args) {
		EmpDao em=new EmpDao();
		
		try {
			System.out.println(em.getDepartmentDetailsByEmployeeId(3));
		} catch (DepartmentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
