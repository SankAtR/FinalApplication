package com.daoarchitecture;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.ui.Model;

import com.hibernate.model.dao.daoarchitecture.GenericHibernateDAOFactory;
import com.sanket.application.pojo.Authority;
import com.sanket.application.pojo.User;
import com.sanket.application.pojo.UserDetails;

public class SignUpModel {

	public boolean addNewUser(Map<String,String> datamodel) throws ParseException{
	
		
		System.out.println("the model is :"+datamodel.toString());
		
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy");
		Date birthdate =sd.parse(datamodel.get("datepicker"));
		
		
		// prepare the model now
		
		User user = new User();
		UserDetails userDetails = new UserDetails();
		
		user.setUsername(datamodel.get("emailID"));
		user.setPassword(datamodel.get("password"));
		
		
		GenericHibernateDAOFactory.getDAO((User.class)).saveOrUpdate(user);
		
		userDetails.setEmailId(datamodel.get("emailID"));
		userDetails.setfName(datamodel.get("fname"));
		userDetails.setlName(datamodel.get("lname"));
		userDetails.setMobile(datamodel.get("mobile"));
		userDetails.setBirthday(birthdate);
		userDetails.setSex("Male");
		userDetails.setCreatedOn(new Date());
		//userDetails.setRowid(6);
		
		
		
		
		
		Authority authority = new Authority();
		authority.setRoleName("ROLE_USER");
		authority.setUser(user);
		
		Set<Authority> authorities= new HashSet<Authority>();
		authorities.add(authority);
		
		
		
		
		
		user.setAuthorities(authorities);
		
		GenericHibernateDAOFactory.getDAO((Authority.class)).saveOrUpdate(authority);
		
		
		user.setDetails(userDetails);
		userDetails.setUser(user);
		
		GenericHibernateDAOFactory.getDAO((UserDetails.class)).saveOrUpdate(userDetails);
		
		
		// save it 
		//GenericHibernateDAOFactory.getDAO((User.class)).saveOrUpdate(user);
		
		
		
		
		
		
		
		
		return false;
		
	}
	
}
