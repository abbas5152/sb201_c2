package Q4;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Demo1 {
	public static void main(String[] args) {
		 EntityManager em= Persistence.createEntityManagerFactory("c2unit").createEntityManager();
		 
		 Query q=em.createQuery("from SalariedEmployee");
		 
		 List<SalariedEmployee> c= q.getResultList();
		   
		 for(SalariedEmployee s:c) {
			
			 System.out.println(s.getEmpName());
			 System.out.println(s.getEmail());
			 System.out.println(s.getSalary());
		 }
	}

}
