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

/**
 *
 * @author BestKung
 */
@Entity
public class DepartmentOneToOne implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int did;
    private String name;

    public DepartmentOneToOne() {
    }

    public DepartmentOneToOne(int did, String name) {
        this.did = did;
        this.name = name;
    }

    
    
    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + this.did;
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
        final DepartmentOneToOne other = (DepartmentOneToOne) obj;
        if (this.did != other.did) {
            return false;
        }
        return true;
    }
        
}
