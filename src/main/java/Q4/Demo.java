package Q4;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             EntityManager em= Persistence.createEntityManagerFactory("c2unit").createEntityManager();
             
             ConractualEmployee c= new ConractualEmployee();
             c.setEmpName("abbas");
             c.setCostofperday(100);
             c.setNoOfWorkingDays(20);
             c.setMobileNumber("96879");
             
             
             ConractualEmployee c1= new ConractualEmployee();
             c1.setEmpName("jsy");
             c1.setCostofperday(100);
             c1.setNoOfWorkingDays(20);
             c1.setMobileNumber("96879");
             
             ConractualEmployee c2= new ConractualEmployee();
             c2.setEmpName("parth");
             c2.setCostofperday(100);
             c2.setNoOfWorkingDays(20);
             c2.setMobileNumber("96879");
             
             ConractualEmployee c3= new ConractualEmployee();
             c3.setEmpName("meet");
             c3.setCostofperday(100);
             c3.setNoOfWorkingDays(20);
             c3.setMobileNumber("96879");
             
             SalariedEmployee s1=new SalariedEmployee();
             s1.setEmpName("root");
             s1.setSalary(24500);
             s1.setEmail("fgft@gmail.com");
             
             SalariedEmployee s2=new SalariedEmployee();
             s2.setEmpName("smith");
             s2.setSalary(24500);
             s2.setEmail("fgft@gmail.com");
             
             SalariedEmployee s3=new SalariedEmployee();
             s3.setEmpName("hales");
             s3.setSalary(24500);
             s3.setEmail("fgft@gmail.com");
             
             SalariedEmployee s4=new SalariedEmployee();
             s4.setEmpName("king");
             s4.setSalary(24500);
             s4.setEmail("fgft@gmail.com");
             
             em.getTransaction().begin();;
             em.persist(c);
             em.persist(c1);
             em.persist(c2);
             em.persist(c3);
             em.persist(s1);
             em.persist(s2);
             em.persist(s3);
             em.persist(s4);
             em.getTransaction().commit();
             
             em.close();
             
             
             
             
             
             
             
	}

}
