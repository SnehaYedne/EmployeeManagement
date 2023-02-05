package com.example.SpringBootEmployeManagementSystem.OneToOne;

import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.security.auth.login.Configuration;
import java.util.HashSet;
import java.util.Set;

public class OneToOne1 {

    public static void main(String[] args) {

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Eclipselink_JPA" );
        EntityManager entitymanager = emfactory.createEntityManager( );
        entitymanager.getTransaction( ).begin( );

        Employees employees1= new Employees(1,"Ravi","Jadhav",20000,"Itwara");
        Employees employees2= new Employees(2,"Vishakha","Jadhav",30000,"Itwaranear");

        entitymanager.persist(employees1);
        entitymanager.persist(employees2);

        //Create Clas Set1
        Set<Employees> employeesSet1 = new HashSet();
        employeesSet1.add(employees1);
        employeesSet1.add(employees2);


        Address address1= new Address(1,"Nagar","Pune","Maharastra","411502");
        Address address2= new Address(2,"Nagar","Indore","M.P","450331");

        entitymanager.persist(address1);
        entitymanager.persist(address2);


        entitymanager.getTransaction( ).commit( );
        entitymanager.close( );
        emfactory.close( );


    }
}
