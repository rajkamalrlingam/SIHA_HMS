package com.spring.siha_hms.config;

import java.util.Collection;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.core.user.OAuth2User;

public class CustomerOAuth2user implements OAuth2User {

	private OAuth2User oauth2user;
	
	
	public CustomerOAuth2user(OAuth2User oauth2user) {
		this.oauth2user = oauth2user;
	}

	@Override
	public String getName() {
		return oauth2user.getName();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return oauth2user.getAuthorities();
	}

	@Override
	public Map<String, Object> getAttributes() {
		return oauth2user.getAttributes();
	}

}
