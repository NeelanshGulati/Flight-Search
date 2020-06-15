package com.nagarro.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nagarro.model.User;

@Repository
public class LoginDAOImpl implements LoginDAO {
	@Autowired
	private SessionFactory sessionFactory;
	boolean userFound = false;

	public boolean checkLogin(String username, String password) {
		Session session = sessionFactory.openSession();

		Query query = session
				.createQuery("from User where username ='" + username + "' and password ='" + password + "'");
		List<User> users = query.list();
		if (users.size() > 0) {
			userFound = true;
		}

		session.close();
		return userFound;
	}

}
