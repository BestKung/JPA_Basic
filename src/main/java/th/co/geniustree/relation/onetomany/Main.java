/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.relation.onetomany;

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
        //Create Employee
        EmployeeOneToMany emp1 = new EmployeeOneToMany();
        emp1.setName("Best");
        emp1.setSalary(140000);
        //Create Employee
        EmployeeOneToMany emp2 = new EmployeeOneToMany("Kittiporn", 123456);
        // Create Employee
        EmployeeOneToMany emp3 = new EmployeeOneToMany();
        emp3.setName("Khamlai");
        emp3.setSalary(150000);
        
        em.persist(emp1);
        em.persist(emp2);
        em.persist(emp3);
        
        //Create List<Employee>
        List<EmployeeOneToMany> emplist = new ArrayList();
        emplist.add(emp1);
        emplist.add(emp2);
        emplist.add(emp3);
        
        //Create Department
        DepartmentOneToMany dep = new DepartmentOneToMany();
        dep.setName("Programmer");
        dep.setEmployee(emplist);
        em.persist(dep);
        em.getTransaction().commit();
    }
    
}
