package Q4;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Demo2 {
	public static void main(String[] args) {
		 EntityManager em= Persistence.createEntityManagerFactory("c2unit").createEntityManager();
		 
		 Query q=em.createQuery("from ConractualEmployee");
		 
		 List<ConractualEmployee> c= q.getResultList();
		   
		 for(ConractualEmployee s:c) {
		
			 System.out.println(s.getEmpName());
			 System.out.println(s.getCostofperday());
			 System.out.println(s.getNoOfWorkingDays());
			 System.out.println(s.getMobileNumber());
			 System.out.println("-------====-------");
		 }
	}

}
