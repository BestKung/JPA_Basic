/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.jpa_basic;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author BestKung
 */
@Entity
@Table(name = "employees")
public class Employee implements Serializable{
    @Id
    @Column(name = "id")
    private int eid;
    @Column(name = "fname",nullable = false , length = 50)
    private String efname;
    @Column(name = "lname",nullable = false , length = 50)
    private String elname;
    @Column(name = "tel",nullable = false , length = 11)
    private String etel;
    @Column(name = "salary",nullable = false)
    private double esalary;

    public Employee(int eid, String efname, String elname, String etel, double esalary) {
        this.eid = eid;
        this.efname = efname;
        this.elname = elname;
        this.etel = etel;
        this.esalary = esalary;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEfname() {
        return efname;
    }

    public void setEfname(String efname) {
        this.efname = efname;
    }

    public String getElname() {
        return elname;
    }

    public void setElname(String elname) {
        this.elname = elname;
    }

    public String getEtel() {
        return etel;
    }

    public void setEtel(String etel) {
        this.etel = etel;
    }

    public double getEsalary() {
        return esalary;
    }

    public void setEsalary(double esalary) {
        this.esalary = esalary;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.eid;
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
        final Employee other = (Employee) obj;
        return true;
    }
    
    
}
