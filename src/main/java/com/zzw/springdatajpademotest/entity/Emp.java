package com.zzw.springdatajpademotest.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

/**
 * The persistent class for the emp database table.
 * 
 */
@Entity
@NamedQuery(name = "Emp.findAll", query = "SELECT e FROM Emp e")

//11. 查询员工号，姓名，工资，以及工资提高百分之20%后的结果（new salary）
@NamedQuery(name = "Emp.findBySal", query = "select e.empno,e.ename,e.sal,e.sal*1.2 from Emp e")

//12. 将员工的姓名按首字母排序，并使用分页查询查出前5个记录。
@NamedQuery(name = "Emp.findByEnameOrderbyEname", query = "select e.empno,e.ename,e.sal from Emp e order by e.ename")

//13. 查询公司员工工资的最大值，最小值，平均值，总和
@NamedQuery(name = "Emp.findAllSal", query = "select max(e.sal),min(e.sal),avg(e.sal),sum(e.sal) from Emp e")

//14. 查询各deptno的员工工资的最大值，最小值，平均值，总和
@NamedQuery(name = "Emp.findAllDeptno", query = "select e.deptno,max(e.sal),min(e.sal),avg(e.sal),sum(e.sal) from Emp e group by e.deptno")

//15. 查询各个deptno的员工人数
@NamedQuery(name = "Emp.findEachDeptno", query = "select e.deptno,count(e.ename) from Emp e group by e.deptno")
@Data
public class Emp implements Serializable {
    private static final long serialVersionUID = 1L;

//    @Column(name = "comm")
    private BigDecimal comm;

//    @Column(name = "deptno")
    private Integer deptno;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "empno")
    private Integer empno;

//    @Column(name = "ename")
    private String ename;

    @Temporal(TemporalType.DATE)
//    @Column(name = "hiredate")
    private Date hiredate;

//    @Column(name = "job")
    private String job;

//    @Column(name = "mgr")
    private Integer mgr;

//    @Column(name = "sal")
    private BigDecimal sal;

    public Emp() {
    }

    public BigDecimal getComm() {
        return this.comm;
    }

    public void setComm(BigDecimal comm) {
        this.comm = comm;
    }

    public int getDeptno() {
        return this.deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public int getEmpno() {
        return this.empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return this.ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Date getHiredate() {
        return this.hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMgr() {
        return this.mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public BigDecimal getSal() {
        return this.sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

//    @Override
//    public String toString() {
//        return "Emp [comm=" + comm + ", deptno=" + deptno + ", empno=" + empno
//                + ", ename=" + ename + ", hiredate=" + hiredate + ", job=" + job
//                + ", mgr=" + mgr + ", sal=" + sal + "]";
//    }

}