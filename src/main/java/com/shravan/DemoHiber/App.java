package com.shravan.DemoHiber;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
        AlienName as = new AlienName();
        as.setFname("Shravan");
        as.setMname("S");
        as.setLname("Aligar");
        
        Alien a = new Alien();
        a.setAid(3);
        a.setAname(as); // for inserting data into DataBase
        a.setColor("Blue");
        
       
      
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        
        SessionFactory sf = con.buildSessionFactory();
        
        Session s = sf.openSession();
        
       /* a=(Alien)s.get(Alien.class,101);*/ // for getting data from DataBase
        
        s.beginTransaction();
        
        s.save(a);
        
        s.getTransaction().commit();
        
        s.close();
    }
}

