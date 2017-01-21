import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;

import Pojo.Student;

public class FirstHibernateClass {

	public static void main(String[] args) {
		
		Configuration configure=new AnnotationConfiguration().configure("hibernate.cfg.xml");
		SessionFactory buildSessionFactory = configure.buildSessionFactory();
		
		Session openSession = buildSessionFactory.openSession();
		
		
		
		
		
		
		
		Criteria createCriteria = openSession.createCriteria(Student.class);
		createCriteria.add(Restrictions.gt("age", "25"));
		createCriteria.add(Restrictions.ne("fName", "feroz"));
		
		List<Student> list = createCriteria.list();
		
		for (Student student : list) {

			System.out.println("Studnet information: " + student.getfName());
			System.out.println(" Studnet information: " + student.getAge());
		}
		
		
		
		
		
		
		
		
		
		//Student student=(Student)openSession.get(Student.class, 6);
		
		/*Query query=openSession.createQuery("from Student where fName=:myName and lName=:myLname");
	
		query.setParameter("myName", "srinu");
		query.setParameter("myLname", "ramachandram");
		
		List<Student> list = query.list();
		
		for (Student student : list) {
			
			System.out.println("Studnet information: "+student.getfName());
			System.out.println(" Studnet information: "+student.getAge());
		}
		
	*/	
		
		
		
		
		/*	for(int i=0;i<list.size();i++){
				
				Student student=	list.get(i);
				
				System.out.println("Studnet information: "+student.getfName());
				System.out.println(" Studnet information: "+student.getAge());
				
			}
			*/
		
		
		
		
		//Transaction beginTransaction = openSession.beginTransaction();
		/*Student student=new Student();
		student.setfName("Feroz");
		student.setlName("XXXX");
		student.setAge("23");
		
		openSession.save(student);
*/	//	beginTransaction.commit();
		
	}
}
