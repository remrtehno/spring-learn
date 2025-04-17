package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {

        try {

            SessionFactory factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Employee.class)
                    .buildSessionFactory();


            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            List<Employee> employees = session.createQuery("from Employee")
//                    .getResultList();

//            List<Employee> employees = session.createQuery("from Employee " +
//                            "where name = 'T'") //name is a an class member prop not a SQL field
//                    .getResultList();

            List<Employee> employees = session.createQuery("from Employee " +
                            "where name = 'Jack' and salary > 300") //name is a an class member prop not a SQL field
                    .getResultList();

            session.getTransaction().commit();

            for (Employee emps : employees){
                System.out.println(emps);
            }

            session.close();

            System.out.println("Done!");
        } finally {

        }


    }
}
