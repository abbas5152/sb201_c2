package Q1;

public class addept {
	
	public static void main(String[] args) {
		EmpDao ed=new EmpDao();
		
		Department dp=new Department();
		dp.setDeptName("HR");
		dp.setLocation("kolkatta");
		
	
		
		ed.addDepartment(dp);
	}

}
