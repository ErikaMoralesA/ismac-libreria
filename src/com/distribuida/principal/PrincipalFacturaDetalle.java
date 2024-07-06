package com.distribuida.principal;

import java.util.Date;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.FacturaDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.dao.FacturaDetalleDAO;

public class PrincipalFacturaDetalle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Patron de Ioc o Inversion de control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");//este es el contenedor
		FacturaDetalleDAO facturadetalleDAO = context.getBean("facturadetalleDAOImpl",FacturaDetalleDAO.class);//este en minuscula si no no funciona
		//CRUD CREEATE READ UPDATE Y DELETE
		FacturaDAO facturaDAO=context.getBean("facturaDAOImpl",FacturaDAO.class);
		LibroDAO libroDAO=context.getBean("libroDAOImpl",LibroDAO.class);
		//add
		FacturaDetalle facturadetalle = new FacturaDetalle (0,2,30,84,0,0);
		facturadetalle.setFactura(facturaDAO.findOne(5));
		facturadetalle.setLibro(libroDAO.findOne(54));
		facturadetalleDAO.add(facturadetalle);
		
		//UPDATE ACTUALIZADO
		
		FacturaDetalle facturadetalle2 = new FacturaDetalle (210,5,20,84,0,0);
		facturadetalle2.setFactura(facturaDAO.findOne(3));
		facturadetalle2.setLibro(libroDAO.findOne(3));
		//facturaDAO.up(factura2);
		
		//del BORRADO
		//facturaDAO.del(86);
		//findOne
		
		
		System.out.println("************DEL*******"+facturadetalleDAO.findOne(86));
		//findAll
		//List<Factura> FacturaDetalle= FacturaDetalleDAO.findAll();	
		facturadetalleDAO.findAll().forEach(item -> {System.out.println(item.toString());});
				
		context.close();
	}

}
