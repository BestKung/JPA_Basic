/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.relation.manytoone;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author BestKung
 */
@Entity
@Table(name = "Employees")
public class Employees2 implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int eid;
    private String ename;
    private double salary;
    @ManyToOne
    private Department2 did;

    public Employees2() {
    }

    public Employees2(int eid, String ename, double salary, Department2 did) {
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
        this.did = did;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department2 getDid() {
        return did;
    }

    public void setDid(Department2 did) {
        this.did = did;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.eid;
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
        final Employees2 other = (Employees2) obj;
        if (this.eid != other.eid) {
            return false;
        }
        return true;
    }
    
    
}
