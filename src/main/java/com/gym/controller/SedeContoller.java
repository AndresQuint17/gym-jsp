package com.gym.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gym.dao.ISedeDao;
import com.gym.entities.Sede;

@Controller
@RequestMapping("/sedes")
public class SedeContoller {

	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	private ISedeDao sedeDao;
	
	@GetMapping("/listaSedes")
	public String paginaSedes(Model modelo) {
		//Buscar las sedes en BD
		List<Sede> listaSedes = buscarSedes();
		
		modelo.addAttribute("listaSedes", listaSedes);
		
		return "SedesView";
	}
	
	@RequestMapping("/infoSede")
	public String infoSede(@RequestParam("idSede") int idSede, Model modelo) {
		Sede laSede = sedeDao.getSede(idSede);
		modelo.addAttribute("datosSede", laSede);
		return "InfoSedeView";
	}
	
	private List<Sede> buscarSedes() {
		/*SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Cliente.class).buildSessionFactory();*/
		
		Session session = sessionFactory.openSession();
		List<Sede> listaSedes=new ArrayList<Sede>();
		
		try {
			if(session != null) {
				System.out.println("conexion exitosa");
			}
			session.beginTransaction();
			listaSedes = session.createQuery("from Sede").getResultList();
			for (Sede sede : listaSedes) {
				System.out.println(sede.toString());
			}
			session.getTransaction().commit();
		}catch(Exception e) {
			session.getTransaction().rollback();
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return listaSedes;
	}
	
}
