package com.sanket.application.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "PM_USER_DETAILS", catalog = "PERSONAL_MANAGEMENT", uniqueConstraints = { @UniqueConstraint(columnNames = "ROW_ID") })
public class UserDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	private String fName, lName, emailId, mobile, sex;
	private Date createdOn, birthday;
	private int rowid;
	private User user;

	@GenericGenerator(name = "generator", strategy = "foreign",  parameters = @Parameter(name="property", value="user"))
	
	@OneToOne
	@JoinColumn(name = "USER_ID", nullable = false)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(nullable = false, name = "F_NAME")
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	@Column(name = "L_NAME")
	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	@Column(unique = true, nullable = false, name = "EMAIL_ID")
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name = "MOBILE")
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(nullable = false, name = "SEX")
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Column(unique = true, nullable = false, name = "CREATED_ON")
	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name = "BIRTHDATE")
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
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
