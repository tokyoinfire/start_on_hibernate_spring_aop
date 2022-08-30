package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory()) {

            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Smirnov"
//                    , "Sales", 700);
//            Detail detail = new Detail("Baku", "345345345345"
//                    , "email@email.com");

//            employee.setEmpDetail(detail);
            session.beginTransaction();

//            Employee emp = session.get(Employee.class, 10);
//            session.save(employee);
//            System.out.println(emp.getEmpDetail());

            Employee emp = session.get(Employee.class, 2);
            session.delete(emp);

            session.getTransaction().commit();
            System.out.println("Done!");
        }

    }
}
