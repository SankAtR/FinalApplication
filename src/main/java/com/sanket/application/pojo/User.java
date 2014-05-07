package com.sanket.application.pojo;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import net.sf.cglib.beans.BeanCopier.Generator;

@Entity
@Table(name = "PM_USER", catalog = "PERSONAL_MANAGEMENT", uniqueConstraints = {
		@UniqueConstraint(columnNames = "ROW_ID"),
		@UniqueConstraint(columnNames = "USER_NAME") })
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private String username, password;
	private int rowid;
	private Set<Authority> authorities;
	private UserDetails details;

	@OneToMany(fetch=FetchType.EAGER,mappedBy="user",cascade=CascadeType.ALL)
	public Set<Authority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Set<Authority> authorities) {
		this.authorities = authorities;
	}

	@OneToOne(fetch=FetchType.EAGER,mappedBy="user")
	public UserDetails getDetails() {
		return details;
	}

	public void setDetails(UserDetails details) {
		this.details = details;
	}

	@Column(name = "USER_NAME", unique = true, nullable = false)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "PASSWORD", nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Id
	@GeneratedValue
	@Column(unique = true, name = "ROW_ID")
	public int getRowid() {
		return rowid;
	}

	public void setRowid(int rowid) {
		this.rowid = rowid;
	}

}
