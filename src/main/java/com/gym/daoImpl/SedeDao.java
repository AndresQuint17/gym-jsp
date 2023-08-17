package com.gym.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gym.dao.ISedeDao;
import com.gym.entities.Sede;

@Repository
public class SedeDao implements ISedeDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public Sede getSede(int idSede) {
		Session session = this.sessionFactory.getCurrentSession();
		return session.get(Sede.class, idSede);
	}

}
