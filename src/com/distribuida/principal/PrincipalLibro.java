package com.distribuida.principal;
 
import java.util.Date;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Libro;
 
public class PrincipalLibro {
	
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Patron de Ioc o Inversion de control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");//este es el contenedor
		LibroDAO libroDAO = context.getBean("libroDAOImpl",LibroDAO.class);//este en minuscula si no no funciona
		//CRUD CREEATE READ UPDATE Y DELETE
		CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImpl",CategoriaDAO.class);
		AutorDAO autorDAO=context.getBean("autorDAOImpl",AutorDAO.class);
		//add
		Libro libro = new Libro (0,"Titulo","editorial",200,"edicion","ing", new Date(),"descripcion","pasta","isbn",20,"portada","presentacion",12.3);
		libro.setCategoria(categoriaDAO.findOne(2));
		libro.setAutor(autorDAO.findOne(2));
		libroDAO.add(libro);
		
		//UPDATE ACTUALIZADO
		
		Libro libro2 = new Libro (73,"Titulo","editorial",200,"edicion","ing", new Date(),"descripcion","pasta","isbn",20,"portada","presentacion",12.3);
		libro2.setCategoria(categoriaDAO.findOne(3));
		libro2.setAutor(autorDAO.findOne(3));
		//facturaDAO.up(factura2);
		
		//del BORRADO
		//facturaDAO.del(86);
		//findOne
		
		
		System.out.println("************DEL*******"+libroDAO.findOne(86));
		//findAll
		//List<Factura> Facturas= FacturaDAO.findAll();	
		libroDAO.findAll().forEach(item -> {System.out.println(item.toString());});
				
		context.close();
	}
 
 
}