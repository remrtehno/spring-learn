package hibernate_test3;

import hibernate_test3.Employee;
import hibernate_test3.entity.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();


        Session session = factory.getCurrentSession();
        try {
            Department department = new Department("It", 300, 1200);
            Employee employee = new Employee("Jack", "Surname", 900);
            Employee employee2 = new Employee("Poter Pen", "Surname", 100);

            department.addEmpToDepartment(employee);
            department.addEmpToDepartment(employee2);

            session.beginTransaction();
            session.save(department);

            session.getTransaction().commit();


        } finally {
            // we use it here as it can be a leak of connection close
            session.close();
        }


    }
}
