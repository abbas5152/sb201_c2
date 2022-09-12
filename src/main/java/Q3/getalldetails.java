package Q3;

import java.util.List;

import Q1.EmpDao;
import Q1.Employee;
import Q1.EmployeeException;

public class getalldetails {
	
public static void main(String[] args) {
	 TrainingDao t=new TrainingDao();
	try {
		List<Student> li= t.getAlltheStudentsByCourseName("java");
		 System.out.println(li);
	} catch (CourseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 
}

		 

}


