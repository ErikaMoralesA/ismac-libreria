package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Patron de IoC o Inversión de Conrtol
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

				
		context.close();
		
	}

}
