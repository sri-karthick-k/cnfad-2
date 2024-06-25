package org.example;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Iterator;
import java.util.List;

public class Main {

    SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    Session session = sf.openSession();
    Transaction transaction = session.beginTransaction();

    public void insert(){
        Student s = new Student();
        s.setId(1);
        s.setTotalMarks(100);
        s.setName("sri");
        session.save(s);
        transaction.commit();
    }

    public void display(){
        Query q = session.createQuery("from Student");
        List l = q.getResultList();
        Iterator i = l.iterator();

        while(i.hasNext()){
            Student s =(Student) i.next();
            System.out.println(s.toString());
        }


    }

    public void search(){
        Query q = session.createQuery("from Student where id=:id");
        q.setParameter("id", 1);
        List l = q.getResultList();
        Iterator i = l.iterator();

        while(i.hasNext()){
            Student s =(Student) i.next();
            System.out.println(s.toString());
        }
    }

    public void delete(){
        Transaction t = session.beginTransaction();
        Query q = session.createQuery("delete from Student where id=:id");
        q.setParameter("id", 2);
        int status = q.executeUpdate();
        if(status == 0){
            System.out.println("Failed to delete");
        } else {
            System.out.println("Deleted succesfully");
        }
        t.commit();
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.insert();
        m.display();
        m.search();
        m.delete();
    }
}