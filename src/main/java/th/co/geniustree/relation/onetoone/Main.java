/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.relation.onetoone;

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
        DepartmentOneToOne dep = new DepartmentOneToOne();
        dep.setName("Programmer");
        em.persist(em);
        
        EmployeeOneToOne emp1 = new EmployeeOneToOne();
        emp1.setName("Kittiporn");
        emp1.setSalary(150000);
        emp1.setDid(dep);
        
        EmployeeOneToOne emp2 = new EmployeeOneToOne();
        emp2.setName("Best");
        emp2.setSalary(150000);
        emp2.setDid(dep);
        
        em.persist(emp1);
        em.persist(emp2);
       em.getTransaction().commit();
        
        
      /*  
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA_Basic" ); 
        EntityManager entitymanager = emfactory. createEntityManager( );
        entitymanager.getTransaction( ).begin( );
        
        //Create Department Entity 
        DepartmentOneToOne department = new DepartmentOneToOne(); 
        department.setName("Development"); 
//Store Department 
        entitymanager.persist(department); 
//Create Employee Entity 
        EmployeeOneToOne employee = new EmployeeOneToOne(); 
        employee.setName("Satish"); 
        employee.setSalary(45000.0); 
       
        employee.setDid(department); 
//Store Employee 
        entitymanager.persist(employee);
        entitymanager.getTransaction().commit();*/
    }
    
}
