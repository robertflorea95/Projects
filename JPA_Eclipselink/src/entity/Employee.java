package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	
	@Id
	@GeneratedValue ( strategy = GenerationType.AUTO)
	
	private int eid;
	private String name;
	private double salary;
	private String deg;
	
	public <String> Employee(int eid, String name, double salary, String deg) {
		
		super();
		this.eid = eid;
		this.salary = salary;
		this.name = name;
		this.deg = deg;
		
	}
	
	public Employee() {
		super();
	}
	
	public int getEid() {
		return eid;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String getDeg() {
		return deg;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setDeg(String deg) {
		this.deg = deg;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + name + ", salary=" + salary + ", deg=" + deg + "]";
	}
}
