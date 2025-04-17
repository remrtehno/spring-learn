package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Tes2 {
    public static void main(String[] args) {

        try {

            SessionFactory factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Employee.class)
                    .buildSessionFactory();


            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Jack", "Bechar", "IT", 30000);
            session.beginTransaction();
            session.save(emp);
//            session.getTransaction().commit();
            System.out.println(emp);

            // get by id
//            session = factory.getCurrentSession();
//            session.beginTransaction();
            Employee employee = session.get(Employee.class, emp.getId());
            System.out.println("Got the employee by id: " + employee);
            session.getTransaction().commit();

            session.close();
        } finally {

        }


    }
}
