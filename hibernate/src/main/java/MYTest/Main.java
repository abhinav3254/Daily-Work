package MYTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Employee employeeAshok = new Employee(101,"Ashok",15000,201);
		Transaction transaction = session.beginTransaction();
		session.save(employeeAshok);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
