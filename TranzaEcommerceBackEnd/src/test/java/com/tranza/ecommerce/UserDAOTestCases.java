package com.tranza.ecommerce;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tranza.ecommerce.dao.UserDAO;

import com.tranza.ecommerce.model.User;

public class UserDAOTestCases {

	@Autowired
	private static UserDAO userDAO;
	
	@Autowired
	static User user = null;


	static AnnotationConfigApplicationContext context;

	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.tranza");
		context.refresh();
		userDAO = (UserDAO) context.getBean("userDAO");
		user = (User) context.getBean("user");
		//cart = (Cart) context.getBean("cart");
	}

	@Test
	public void addUserTest() {

		// cart.setGrandTotal(1000);
		// cart.setNumberOfCartItems(1);
		// cart.setCartItems(null);
		
		//User user = new User();
		user.setFirstName("Djaitai");
		user.setLastName("Koffi");
		user.setEmail("djaitai@gmail.com");
		user.setGender("Male");
		user.setMobileNumber("99875789");
		user.setPassword("123");
		// user.setCart(cart);
		user.setEnabled(true);
		user.setRole("USER");
		// cart.setUser(user);
		//userDAO.addUser(user);
		Assert.assertEquals("Failed to add the user!" , true, userDAO.addUser(user));
	}

}
