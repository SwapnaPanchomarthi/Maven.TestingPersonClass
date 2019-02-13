package com.zipcodewilmington.person;

import java.util.Date;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String dept;
    private String jobRole;
    private String company;
    private double salary;
    private int jobId;

    public Person() {
       this.name="";
       this.age=Integer.MAX_VALUE;
       this.dept="";
       this.company="";
       this.jobId=Integer.MAX_VALUE;
       this.salary=Double.MIN_VALUE;
       this.jobRole="";
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name=name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person (String jobRole, double sal){
        this.jobRole=jobRole;
        this.salary=sal;
    }
    public void details(String company, String jRole)
    {
        this.company=company;
        this.jobRole=jRole;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public String getName() {

        return name;
    }

    public Integer getAge() {
        return age;
    }
    public String getDept( ) {

        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }
}
