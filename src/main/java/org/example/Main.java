package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Laptop l = new Laptop();
//        l.setLid(121);
//        l.setLname("mac");
//        l.setPrice(10000);
//        Laptop l1 = new Laptop();
//        l1.setLid(42);
//        l1.setLname("mac");
//        l1.setPrice(10000);

//        Employee e = new Employee();
//        e.setId(2);
//        e.setName("Ammu");
//        e.setSalary(10000);
//        System.out.println(e);
//        l.setEmployees(List.of(e));
//        e.setLaptops(List.of(l));


        Configuration configuration = new Configuration().configure().addAnnotatedClass(Employee.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
//        Employee e = session.get(Employee.class,32);
//        System.out.println(e);
//        session.save(l);
        Query q = session.createQuery("from Employee");
        List<Employee> employees = q.list();
//        System.out.println(employees.listIterator().next());
        System.out.println(employees);
        transaction.commit();
    }
}