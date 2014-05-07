package com.hibernate.model.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.security.core.GrantedAuthority;

import com.sanket.application.pojo.Authority;
import com.sanket.application.pojo.User;

public class VUserDetails implements
		org.springframework.security.core.userdetails.UserDetails {
	private User user;

	public VUserDetails(User user) {
		super();
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Collection<GrantedAuthority> getAuthorities() {
		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
		Set<Authority> roles = this.user.getAuthorities();
		for (final Authority role : roles) {
			authorities.add(new GrantedAuthority() {
				private static final long serialVersionUID = 5095289482677064298L;

				@Override
				public String getAuthority() {
					return role.getRoleName();
				}
			});
		}
		return authorities;
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
