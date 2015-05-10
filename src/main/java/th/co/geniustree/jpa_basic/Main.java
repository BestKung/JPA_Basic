/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.jpa_basic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author BestKung
 */
public class Main {
    
    public static void main(String[] args) {
        EntityManagerFactory emfactory = Persistence. createEntityManagerFactory( "JPA_Basic" ); 
        EntityManager entitymanager = emfactory. createEntityManager( );
        entitymanager.getTransaction().begin();
        Employee employee = new Employee(1, "Kittiporn", "Khamlai", "0923671111", 150000);
        entitymanager.persist(employee);
        entitymanager.getTransaction().commit();
    }
    
}
