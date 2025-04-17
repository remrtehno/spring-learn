package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(hibernate_test.entity.Employee.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        Employee emp = new Employee("T", "2", "4", 3);

        session.beginTransaction();
        session.save(emp);
        session.getTransaction().commit();

    }
}
