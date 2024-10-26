package com.demo;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee
{
  @Id
  private int eid;
  private String ename;
  private double esalary;
  
  @Embedded
  private Address add;
  
public Employee() 
{
	super();
	
}

public Employee(int eid, String ename, double esalary, Address add) 
{
	super();
	this.eid = eid;
	this.ename = ename;
	this.esalary = esalary;
	this.add = add;
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

public double getEsalary() {
	return esalary;
}

public void setEsalary(double esalary) {
	this.esalary = esalary;
}

public Address getAdd() {
	return add;
}

public void setAdd(Address add) {
	this.add = add;
}

}
