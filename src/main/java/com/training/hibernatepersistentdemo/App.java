package com.training.hibernatepersistentdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Person p = new Person();
    	p.setPid(103);
    	p.setPname("Trainer");
    	p.setTechnology("Python");
    	p.setHobbies("Programming");
    	Configuration con = new Configuration().configure().addAnnotatedClass(Person.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	session.save(p);
    	
    	Person p1 = (Person)session.get(Person.class, 101);
    	
    	System.out.println("Person Details "+p1.getPid()+" : "+p1.getPname());
    	
    	tx.commit();
        System.out.println( "Hello World!" );
    }
}
