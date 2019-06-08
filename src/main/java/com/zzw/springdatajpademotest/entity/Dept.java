package com.zzw.springdatajpademotest.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 * The persistent class for the dept database table.
 * 
 */
@Entity
@NamedQuery(name = "Dept.findAll", query = "SELECT d FROM Dept d")
//@Data
public class Dept implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "deptno")
    private int deptno;

//    @Column(name = "dname")
    private String dname;

//    @Column(name = "loc")
    private String loc;

    public Dept() {
    }

    public int getDeptno() {
        return this.deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return this.dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return this.loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

}