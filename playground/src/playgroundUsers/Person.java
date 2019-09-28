package playgroundUsers;

public class Person {
	
	private String name;
	private String surname;
	private int age;
	
	Person(){
		
		this.name = null;
		this.surname = null;
		this.age = 0;
		
	}
	
	Person(String name, String surname, int age){
		
		this.name = name;
		this.surname = surname;
		this.age = age;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public String getSurname() {
		
		return surname;
		
	}
	
	public int getAge() {
		
		return age;
		
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public void setSurname(String surname) {
		
		this.surname = surname;
		
	}
	
	public void setAge(int age) {
		
		this.age = age;
		
	}

}
