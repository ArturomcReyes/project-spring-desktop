/**
 * 
 */
package com.arturoserver.projectspringdesktop.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arthurserver.projectspringdesktop.dao.DisqueraDAO;
import com.arthurserver.projectspringdesktop.dao.impl.DisqueraDAOImpl;

/**
 * @author Arthurserver
 * Clase de Prueba Unitaria que permite realizar pruebas con el framework SPRING.
 */
class SpringDesktopTest {

	@Test
	void testContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		assertNotNull(context);
		
		DisqueraDAO disqueraDAO = (DisqueraDAO) context.getBean("disqueraDAO");
		assertNotNull(disqueraDAO);
		
		DisqueraDAO disqueraDAONuevo = (DisqueraDAO) context.getBean("disqueraDAO");
		
		DisqueraDAO disqueraDAOSinSpring = new DisqueraDAOImpl();
		DisqueraDAO disqueraDAOSinSpringNuevo = new DisqueraDAOImpl();
		
		System.out.println("Contexto cargado exitosamente");
		System.out.println(disqueraDAO);
		System.out.println(disqueraDAONuevo);
		
		System.out.println(disqueraDAOSinSpring);
		System.out.println(disqueraDAOSinSpringNuevo);
		
		//::::::::::PROPERTIRES:::::::::::::::
		Properties properties = (Properties) context.getBean("properties");
		System.out.println(properties.get("spring-username"));
	}

}
