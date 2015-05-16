/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.relation.manytomany;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author BestKung
 */
@Entity
public class MyTeacher implements Serializable{
    
    @Id
    private int tid;
    private String name;
    
    @ManyToMany(targetEntity = MyClass.class)
    private List<MyClass> myclass;

    public MyTeacher() {
    }

    public MyTeacher(int tid, String name, List<MyClass> myclass) {
        this.tid = tid;
        this.name = name;
        this.myclass = myclass;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MyClass> getMyclass() {
        return myclass;
    }

    public void setMyclass(List<MyClass> myclass) {
        this.myclass = myclass;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.tid;
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
        final MyTeacher other = (MyTeacher) obj;
        if (this.tid != other.tid) {
            return false;
        }
        return true;
    }
    
    
    
}
