/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.relation.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author BestKung
 */
public class main {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_Basic");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        // Create Department Entity
        Department2 de = new Department2();
        de.setName("Best");
        em.persist(de);
        
        // Create Employees
        Employees2 emp = new Employees2();
        emp.setEname("Kittiporn");
        emp.setSalary(150000);
        emp.setDid(de);
        em.persist(emp);
        em.getTransaction().commit();
    }
}
