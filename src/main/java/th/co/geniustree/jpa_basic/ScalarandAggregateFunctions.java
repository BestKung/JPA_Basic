/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.jpa_basic;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author BestKung
 */
public class ScalarandAggregateFunctions {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_Basic");
        EntityManager em = emf.createEntityManager();
        
        Query query = em.createQuery("Select fname from employees");
        List<String> list = query.getResultList();
        
        for(String s : list){
            System.out.println(s);
        }
    }
}
