package com.hibernate.model.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.hibernate.model.dao.daoarchitecture.GenericHibernateDAOFactory;
import com.sanket.application.pojo.User;

public class LoginService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {
		// load the actual user. 
		List<User> users = GenericHibernateDAOFactory.getDAO((User.class)).retrieve("from User as u where u.username = '" + username + "'");
		if (users == null || users.size() != 1) {
			return null;
		}
		User user = users.get(0);

		// finally return the new user details object. 
		UserDetails userDetails = new VUserDetails(user);

		// load the ACL for this user. 
		// TODO: Refer to the below mentioned links while rendering the module panel. 
		// http://giannisapi.wordpress.com/2011/09/21/accessing-user-credentials-in-spring-3-by-using-principal-object/
		// http://stackoverflow.com/questions/7807967/accessing-my-custom-user-object-in-jsp-page-using-spring-3-security

		return userDetails;
	}
}
