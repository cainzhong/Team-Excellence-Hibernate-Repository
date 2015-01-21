 /**
 *@Project: Team-Excellence-Hibernate-Repository
 *
 *@Date: 2015Äê1ÔÂ21ÈÕ
 *@Copyright: 2015 sg.nomaka.tk Inc. All rights reserved.
 */
package com.team.excellence.hibernate.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Cain
 *
 */
@Entity
@Table(name="ACCOUNT")
public class Account {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long id;
	
	@Column(name="User_Name")
	private String username;
	
	@Column(name="Password")
	private String password;
	
	@OneToMany
	private Email email;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public Email getEmail() {
		return email;
	}
	public void setEmail(Email email) {
		this.email = email;
	}
}
