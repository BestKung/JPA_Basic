/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.relation.onetoone;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author BestKung
 */
@Entity
public class EmployeeOneToOne implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int eid;
    private String name;
    private double salary;
    
    @OneToOne
    private DepartmentOneToOne did;

    public EmployeeOneToOne() {
    }

    public EmployeeOneToOne(int eid, String name, double salary, DepartmentOneToOne did) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
        this.did = did;
    }

    
    
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public DepartmentOneToOne getDid() {
        return did;
    }

    public void setDid(DepartmentOneToOne did) {
        this.did = did;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + this.eid;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EmployeeOneToOne other = (EmployeeOneToOne) obj;
        if (this.eid != other.eid) {
            return false;
        }
        return true;
    }
    
    
    
}
