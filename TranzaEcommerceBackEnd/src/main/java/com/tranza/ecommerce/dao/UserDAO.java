package com.tranza.ecommerce.dao;

import java.util.List;

import com.tranza.ecommerce.model.User;

public interface UserDAO {
	
	List<User> getAllUser();
	User getUserById(int userId);
	User getByUserEmail(String email);
	boolean addUser(User user);
	boolean deleteUser(User user);
	boolean updateUser(User user);
	boolean isValidate(String userName, String password);	

}
