package hibernate_one_to_many_uni;


import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory()) {

//            Session session = factory.getCurrentSession();
//            Department dep = new Department("HR"
//                    , 1500, 500);
//
//            Employee emp1 = new Employee("Oleg", "Ivanov"
//                    , 800);
//            Employee emp2 = new Employee("Andrey", "Kovalev"
//                    , 1300);
//
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//
//            session.beginTransaction();
//
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


//            Session session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Department dep = session.get(Department.class, 3);
//
//            System.out.println(dep);
//            System.out.println(dep.getEmps());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


//            Session session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 4);
//
//            System.out.println(employee);
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


//            Session session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Department department = session.get(Department.class, 2);
//
//            session.delete(department);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

        }

    }
}
