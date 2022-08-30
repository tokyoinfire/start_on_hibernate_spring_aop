package hibernate_one_many_bi;


import hibernate_one_many_bi.entity.Department;
import hibernate_one_many_bi.entity.Employee;
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
//            Department dep = new Department("Sales"
//                    , 1300, 300);
//
//            Employee emp1 = new Employee("Sergey", "Veklenko"
//                    , 1000);
//            Employee emp2 = new Employee("Elena", "Veklenko"
//                    , 1200);
//            Employee emp3 = new Employee("Anton", "Sidorov"
//                    , 700);
//
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            dep.addEmployeeToDepartment(emp3);
//
//            session.beginTransaction();
//
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//************************************************************************************************

            Session session = factory.getCurrentSession();
            session.beginTransaction();

            Department dep = session.get(Department.class, 4);

            System.out.println(dep);
            System.out.println(dep.getEmps());

            session.getTransaction().commit();
            System.out.println("Done!");

//************************************************************************************************

//            Session session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//************************************************************************************************
//            Session session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 4);
//
//            session.delete(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

        }

    }
}
