package com.polytech.Todolist.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.sql.DataSource;
import javax.transaction.Transactional;

import com.polytech.Todolist.business.Users;
import com.polytech.Todolist.business.authorities;

@Transactional
public class JpaUserRepository implements UserRepository {
	
	private DataSource dataSource;
	
	@PersistenceContext
    EntityManager userEntityManager;
	
	public JpaUserRepository(DataSource dataSource) {
		this.dataSource=dataSource;
	}
	
	public List<Users> findUsername(String username) {
		Query query=userEntityManager.createQuery("SELECT s FROM Users s WHERE s.username=:username")
				.setParameter("username", username);
		return query.getResultList();
	}
	public int register(Users user) {
		 List<Users> userList=findUsername(user.getUsername());
		
		 if(userList.size()==0) {
			 userEntityManager.persist(user);
			 userEntityManager.persist(new authorities(user.getUsername(),"user"));
			 return 1;
		 }
		 else {
			 return 0;
		 }

	
	}

}
