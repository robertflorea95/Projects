package entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	
	private int id;
	private String name;
	private String surname;
	private int year;
	private String degree;
	private String birthDate;
	private String location;
	private String country;
	
	public Student(int id, String name, String surname, int year, String degree, String birthDate, String location, String country) {
		
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.year = year;
		this.degree = degree;
		this.birthDate = birthDate;
		this.location=location;
		this.country=country;
		
	}
	
	public Student() {
		
		super();
		
	}
	
	public int getId() {
		
		return this.id;
		
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
	public String getSurname() {
		
		return this.surname;
		
	}
	
	public int getYear() {
		
		return this.year;
		
	}
	
	public String getDegree() {
		
		return this.degree;
		
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setId(int Id) {
		
		this.id = id;
		
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public void setSurname(String surname) {
		
		this.surname = surname;
	}
	
	public void setYear(int year) {
		
		this.year = year;
	}
	
	public void setDegree(String degree) {
		
		this.degree = degree;
		
	}

}
