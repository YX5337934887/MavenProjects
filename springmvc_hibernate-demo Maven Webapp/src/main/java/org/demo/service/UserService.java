package org.demo.service;

import java.util.List;

import org.generator.entity.AcctUser;

public interface UserService {
	AcctUser load(String id);

	AcctUser get(String id);

	List<AcctUser> findAll();

	void persist(AcctUser entity);

	String save(AcctUser entity);

	void saveOrUpdate(AcctUser entity);

	void delete(String id);

	void flush();
}