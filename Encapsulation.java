/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.williamproject;

/**
 *
 * @author HP
 */

class Employee {
    private int empno;
    private String name;
    private double salary;
    
    public int getempno()
    {
    return empno;
    }
    public String getname()
    {
    return name;
    }
    public double getsalary()
    {
    return salary;
    }
    public void setempno(int a)
    {
     empno=a;
    }
    public void setname( String b)
    {
     name=b;
    }
    public void setsalary(double c)
    {
     salary=c;
    }
}

class Department {
    private int deptId;
    private String deptName;

    public int getDeptId() {
        return deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}

class Company {
    private String companyName;
    private String companyLocation;

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyLocation() {
        return companyLocation;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCompanyLocation(String companyLocation) {
        this.companyLocation = companyLocation;
    }
}

public class Encapsulation {
    public static void main (String[] args)
    {
    Employee emp1 = new Employee();
    
    emp1.setempno(10118);
    emp1.setname("William");
    emp1.setsalary(100000);
    
    System.out.println("Employee no:" +emp1.getempno()+"\tEmployee Name: "  +emp1.getname() + "\t Employee Salary: " +emp1.getsalary());
    
    Employee emp2 = new Employee();
    
    emp2.setempno(10120);
    emp2.setname("Eugenio");
    emp2.setsalary(200000);
    
    System.out.println("Employee no:" +emp2.getempno()+"\tEmployee Name: "  +emp2.getname() + "\t Employee Salary: " +emp2.getsalary());
    
    Department dept1 = new Department();
    
    dept1.setDeptId(1);
    dept1.setDeptName("HR");

    Department dept2 = new Department();
    
    dept2.setDeptId(2);
    dept2.setDeptName("Finance");

    Company company = new Company();

    company.setCompanyName("ABC Corporation");
    company.setCompanyLocation("New York");
    
    System.out.println("Employee Dept Id:" +dept1.getDeptId()+"\tEmployee Dept Name: "  +dept1.getDeptName()+"\tEmployee Company Name: "  +company.getCompanyName() +"\tEmployee Company Location: "  +company.getCompanyLocation());
    System.out.println("Employee Dept Id:" +dept2.getDeptId()+"\tEmployee Dept Name: "  +dept2.getDeptName()+"\tEmployee Company Name: "  +company.getCompanyName()+"\tEmployee Company Name: "  +company.getCompanyLocation());
    }
}
