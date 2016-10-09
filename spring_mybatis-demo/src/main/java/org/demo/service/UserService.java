package org.demo.service;

import java.util.List;

import org.generator.model.UserInfo;

public interface UserService {

	UserInfo getUserById(int id);
	
	List<UserInfo> getUsers();
	
	int insert(UserInfo userInfo);
}