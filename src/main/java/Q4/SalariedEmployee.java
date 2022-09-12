package Q4;

import javax.persistence.Entity;

@Entity
public class SalariedEmployee extends employee {
	
	private int Salary;
	private String Email;
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "SalariedEmployee [Salary=" + Salary + ", Email=" + Email + "]";
	}
	
	
	
	@Override
	public String getEmpName() {
		// TODO Auto-generated method stub
		return super.getEmpName();
	}
	

	
	

}
