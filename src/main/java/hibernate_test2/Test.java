package hibernate_test2;

import hibernate_test2.entity.Detail;
import hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(hibernate_test2.entity.Employee.class)
                .addAnnotatedClass(hibernate_test2.entity.Detail.class)
                .buildSessionFactory();


        Session session = factory.getCurrentSession();
        try {


            Employee emp = new Employee("T", "2", "4", 3);
            Detail detail = new Detail("Baku", "998909897372", "test@gmail.com");
            emp.setEmpDetail(detail);


            session.beginTransaction();
//            session.save(emp);
//            System.out.println(emp);


            System.out.println("Retrive");
            Employee employeeRetrieved = session.get(Employee.class, 1);
            System.out.println(employeeRetrieved.getEmpDetail());


            System.out.println("Deletion");
            session.delete(employeeRetrieved); // WE DELETE with CASCADE

            session.getTransaction().commit(); // IMPORTANT TO COMMIT !!!!!!!!!!!!!!!!!!!


//            session.close();
        } finally {
            // we use it here as it can be a leak of connection close
            session.close();
        }


    }
}
