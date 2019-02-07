package com.tranza.ecommerce.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tranza.ecommerce.dao.UserDAO;
import com.tranza.ecommerce.model.Cart;
import com.tranza.ecommerce.model.User;

@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	User user;

	@Autowired
	Cart cart;

	//@Override
	public List<User> getAllUser() {
		String hql = "FROM USERS";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

	//@Override
	public User getUserById(int userId) {
		return (User) sessionFactory.getCurrentSession().get(User.class, userId);
	}

	//@Override
	public User getByUserEmail(String email) {
		String hql = "FROM USER WHERE email =:email";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("email", email);
		List<User> listOfUser = query.getResultList();
		if (listOfUser != null && !listOfUser.isEmpty()) {
			return listOfUser.get(0);
		}
return null;
	}

	//@Override
	public boolean addUser(User user) {
		try {
			sessionFactory.getCurrentSession().persist(user);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
}
	}

	//@Override
	public boolean deleteUser(User user) {
		try {
			sessionFactory.getCurrentSession().delete(user);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
}
	}

	//@Override
	public boolean updateUser(User user) {
		try {
			sessionFactory.getCurrentSession().update(user);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
}
	}

	public boolean isValidate(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
