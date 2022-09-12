package Q1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmpDao {
	
	public void addDepartment(Department dept) {
		
		
		
		
		
		 EntityManager em= Persistence.createEntityManagerFactory("c2unit").createEntityManager();
		 em.getTransaction().begin();
		 
		 em.persist(dept);
		 
		 em.getTransaction().commit();
		 em.close();
		 
		 System.out.println("done");
		
		
	}
	public void addEmployee(Employee emp) {
		 EntityManager em= Persistence.createEntityManagerFactory("c2unit").createEntityManager();
		 em.getTransaction().begin();
		 em.persist(emp);
		 em.getTransaction().commit();
		 em.close();
		 System.out.println("done");
		
	}
	public void registerEmployeeTODepartment(int empId, int deptId)throws EmployeeException, DepartmentException{
		
		
		 EntityManager em= Persistence.createEntityManagerFactory("c2unit").createEntityManager();
		 
		 Employee e=em.find(Employee.class, empId);
		 
		 Department d=em.find(Department.class, deptId);
		 
		 if(e!=null && d!=null) {
		 e.setDept(d);
		 d.getEmp().add(e);
		 
		 em.getTransaction().begin();
		 em.persist(e);
		 em.getTransaction().commit();
		 em.close();
		 System.out.println("done");
		 }
		 else if(e==null) {
			 throw new EmployeeException("Emp not found");
		 }
		 else if(d==null) {
			 throw new DepartmentException("dept not found");
		 }
		 
		
		
		
	}
	
	public List<Employee> getAllEmployeeWithDeptName(String deptName)throws EmployeeException{
		
		List<Employee> li=null;
		 EntityManager em= Persistence.createEntityManagerFactory("c2unit").createEntityManager();
		 
		 Query q= em.createQuery("select emp from Department where deptName=?1");
		 q.setParameter(1, deptName);
		 
		li=q.getResultList();
		 
		 if(li.size()==0) {
			 throw new EmployeeException("Employee not in this department");
		 }
		 
		 return li;
		
	}
	public Department getDepartmentDetailsByEmployeeId(int empId)throws DepartmentException{
		Department d1=null;
		
		EntityManager em= Persistence.createEntityManagerFactory("c2unit").createEntityManager();
		
		Employee e=em.find(Employee.class, empId);
		
		d1=e.getDept();
		if(d1==null) {
			throw new DepartmentException("not in any department");
		}
		
		return d1;
		
	}


}
