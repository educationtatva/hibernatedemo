package com.hibernate.hibernatedemo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Alien ab = new Alien();
    	ab.setAid(101);
    	ab.setAname("navin");
    	ab.setColor("Green");
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session session  = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	session.save(ab);
    	tx.commit();
        System.out.println( "Hello World!" );
    }
}
