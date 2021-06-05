package javacampders4ode3Game.Entities;

import java.time.LocalDate;

public class User {
	private int id;
	private String name;
	private String surname;
	private LocalDate localdate;
	private String tcNumber;
	
	public User() {
		
	}
	
	
	public User(int id, String name, String surname, LocalDate localdate, String tcNumber) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.localdate = localdate;
		this.tcNumber = tcNumber;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public LocalDate getLocaldate() {
		return localdate;
	}


	public void setLocaldate(LocalDate localdate) {
		this.localdate = localdate;
	}


	public String getTcNumber() {
		return tcNumber;
	}


	public void setTcNumber(String tcNumber) {
		this.tcNumber = tcNumber;
	}

}
