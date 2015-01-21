 /**
 *@Project: Team-Excellence-Hibernate-Repository
 *
 *@Date: 2015Äê1ÔÂ21ÈÕ
 *@Copyright: 2015 sg.nomaka.tk Inc. All rights reserved.
 */
package com.team.excellence.hibernate.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Cain
 *
 */
@Entity
@Table(name="EMAIL")
public class Email {
	@Id
	private Long id;
	
	@Column(name="PRIMARY_EMAIL")
	private String primaryEmail;
	
	@Column(name="SECONDARY_EMAIL")
	private String secondaryEmail;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPrimaryEmail() {
		return primaryEmail;
	}
	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}
	public String getSecondaryEmail() {
		return secondaryEmail;
	}
	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}
}
