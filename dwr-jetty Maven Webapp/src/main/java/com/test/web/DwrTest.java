package com.test.web;

import com.test.domain.User;

public class DwrTest {
	public User testUser(int id, String username) {
		return new User(id, username);
	}
}
