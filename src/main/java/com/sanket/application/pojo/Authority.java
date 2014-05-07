package com.sanket.application.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "PM_AUTHORITY", catalog = "PERSONAL_MANAGEMENT", uniqueConstraints = { @UniqueConstraint(columnNames = "ROW_ID") })
public class Authority implements Serializable {
	private static final long serialVersionUID = 1L;
	private String roleName;
	private int rowid;
	private User user;

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "user"))
	@ManyToOne
	@JoinColumn(name = "USER_ID", nullable = false)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(nullable = false, name = "ROLE_NAME")
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
