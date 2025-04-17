package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {

        try {

            SessionFactory factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Employee.class)
                    .buildSessionFactory();


            Session session = factory.getCurrentSession();
            Employee emp = new Employee("T", "2", "4", 3);

            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
            System.out.println(emp);

            session.close();
        } finally {

        }


    }
}
