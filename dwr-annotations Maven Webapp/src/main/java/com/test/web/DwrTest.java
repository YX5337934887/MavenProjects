package com.test.web;

import org.directwebremoting.annotations.RemoteProxy;

import com.test.domain.User;

@RemoteProxy(name="DwrTest")
public class DwrTest {
	public User testUser(int id, String username) {
		return new User(id, username);
	}
}
