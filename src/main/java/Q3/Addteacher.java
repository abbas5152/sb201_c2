package Q3;

public class Addteacher {
	
	
	public static void main(String[] args) {
		TrainingDao t=new TrainingDao();
	
		Teacher c=new Teacher();
		
		c.setTeacherName("famle");
		c.setNoYearOfExperince("6");
		c.setEmail("dhfhfg@gmail.com");
		
		t.registerTeacher(c);
	}

}
