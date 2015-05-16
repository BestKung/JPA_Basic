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
public class MyClass implements Serializable{
    
    @Id
    private int cid;
    private String cname;
    
    @ManyToMany(targetEntity = MyTeacher.class)
    private List<MyTeacher> myteacher;

    public MyClass() {
    }

    public MyClass(int cid, String cname, List<MyTeacher> myteacher) {
        this.cid = cid;
        this.cname = cname;
        this.myteacher = myteacher;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<MyTeacher> getMyteacher() {
        return myteacher;
    }

    public void setMyteacher(List<MyTeacher> myteacher) {
        this.myteacher = myteacher;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.cid;
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
        final MyClass other = (MyClass) obj;
        if (this.cid != other.cid) {
            return false;
        }
        return true;
    }
    
    
}
