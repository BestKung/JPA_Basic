/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.relation.manytomany;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author BestKung
 */
public class Main {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_Basic");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        //Create MyClass 1,2,3
        MyClass class1 = new MyClass(0, "M.4", null);
        MyClass class2 = new MyClass(0, "M.5", null);
        MyClass class3 = new MyClass(0, "M.6", null);
        
        em.persist(class1);
        em.persist(class2);
        em.persist(class3);
        
        List<MyClass> lc1 = new ArrayList();
        lc1.add(class1);
        lc1.add(class2);
        lc1.add(class3);
        
        List<MyClass> lc2 = new ArrayList();
        lc2.add(class3);
        lc2.add(class2);
        lc2.add(class1);
        
        List<MyClass> lc3 = new ArrayList();
        lc3.add(class2);
        lc3.add(class1);
        lc3.add(class3);
        
        //Create MyTeacher
        MyTeacher teacher1 = new MyTeacher();
        teacher1.setTid(1);
        teacher1.setName("Kittiporn");
        teacher1.setMyclass(lc1);
        
        MyTeacher teacher2 = new MyTeacher();
        teacher2.setName("Best");
        teacher2.setTid(1);
        teacher2.setMyclass(lc2);
        
        MyTeacher teacher3 = new MyTeacher();
        teacher3.setTid(3);
        teacher3.setName("Khamlai");
        teacher3.setMyclass(lc3);
        
        em.persist(teacher1);
        em.persist(teacher2);
        em.persist(teacher3);
        
        em.getTransaction().commit();
    }
}
