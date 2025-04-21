package hibernate.one_to_many;


import hibernate.one_to_many.entity.*;
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
//            Department department = new Department("HR", 300, 1200);
//            Employee employee = new Employee("Petr", "Surname", 900);
//            Employee employee2 = new Employee("Helen", "Surname", 100);
//
//            department.addEmpToDepartment(employee);
//            department.addEmpToDepartment(employee2);
//
//            session.beginTransaction();
//            session.save(department);
//
//            session.getTransaction().commit();

            session.beginTransaction();
            System.out.println("Fetching department data");
            Department department = session.get(Department.class, 7);
            System.out.println(department);

            /* JUST TO FIX LAZY ISSUE - SUB LOADING JUST TO DO IT BEFORE THE SESSION IS CLOSED*/
            department.getEmployees().get(0);

            session.getTransaction().commit();

            System.out.println("Fetching employee data");
            System.out.println(department.getEmployees());






        } finally {
            // we use it here as it can be a leak of connection close
            session.close();
        }


    }
}
