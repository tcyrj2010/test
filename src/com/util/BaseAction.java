package com.util;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class BaseAction {

	public UserDetails getLoginUser(){
		SecurityContext scx = SecurityContextHolder.getContext();
		UserDetails user = (UserDetails) scx.getAuthentication().getPrincipal();
		return user;
	}
}
