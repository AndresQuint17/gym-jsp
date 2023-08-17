package com.gym;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gym.entities.Cliente;
import com.gym.entities.Deportista;

public class PruebaConexionBBDD {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Cliente.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		try {
			
			if(session != null) {
				System.out.println("conexion exitosa");
			}
			session.beginTransaction();
			List<Cliente> listaClientes = session.createQuery("from Cliente").getResultList();
			for (Cliente cliente : listaClientes) {
				System.out.println(cliente.toString());
			}
			session.getTransaction().commit();
		}catch(Exception e) {
			session.getTransaction().rollback();
		}finally {
			if(session != null) {
				session.close();
			}
			if(sessionFactory != null) {
				sessionFactory.close();
			}
		}
	}

}
