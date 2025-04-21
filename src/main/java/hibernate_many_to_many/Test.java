package hibernate_many_to_many;

import hibernate_many_to_many.entity.Children;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Section.class)
                .addAnnotatedClass(Children.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            session = factory.getCurrentSession();
//
//            Children children = new Children(14, "Maria");
//            Children children2 = new Children(16, "Jolli");
//            Children children3 = new Children(17, "John");
//            Section section = new Section("Chess");
//
//
//            section.addChildToSection(children);
//            section.addChildToSection(children2);
//            section.addChildToSection(children3);
//
//            session.beginTransaction();
//            session.save(section);
//            session.getTransaction().commit();
            /* ========================== */

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Section section = new Section("Footbal");
//            Children children4 = new Children(14, "Polina");
//            Children children5 = new Children(14, "Maria");
//            Children children6 = new Children(14, "Anya");
//
//            section.addChildToSection(children4);
//            section.addChildToSection(children5);
//            section.addChildToSection(children6);
//
//            session.save(section);
//            session.getTransaction().commit();
            /* ========================== */

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Section section2 = session.get(Section.class, 2);
//            System.out.println(section2);
//            System.out.println(section2.getChildren());
//
//            session.getTransaction().commit();
            /* ========================== */

            // PERSIST

            session = factory.getCurrentSession();
            session.beginTransaction();

            Section section = new Section("Tennis");
            Children children4 = new Children(14, "Masha");
            Children children5 = new Children(14, "Anjela");
            Children children6 = new Children(14, "Nastya");

            section.addChildToSection(children4);
            section.addChildToSection(children5);
            section.addChildToSection(children6);

            session.persist(section);
            session.getTransaction().commit();

        }finally {
            session.close();
            factory.close();
        }
    }
}
