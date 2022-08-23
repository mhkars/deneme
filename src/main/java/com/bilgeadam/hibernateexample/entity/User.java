package com.bilgeadam.hibernateexample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbluser")
public class User {
	@Id
	@GeneratedValue(generator = "sq_tblmusteri_id")
	private long id;
	private String username;
	private String password;
	private String gender;

	public User(String username, String password, String gender) {
		super();
		this.username = username;
		this.password = password;
		this.gender = gender;
	}

	public User(long id, String username, String password, String gender) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.gender = gender;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", gender=" + gender + "]";
	}

}
