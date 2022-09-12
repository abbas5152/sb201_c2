package Q3;

import Q1.DepartmentException;
import Q1.EmpDao;
import Q1.EmployeeException;

public class teachertocourse {
	public static void main(String[] args) {

      TrainingDao t=new TrainingDao();
		
		
			try {
				t.assignTeacherWithCourse(5, 4);
			} catch (TeacherException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (CourseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}

}
