package com.distribuida.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.distribuida.entities.FacturaDetalle;

@Repository
public interface FacturaDetalleDAO {
	
	//CRUD básico
	
			public List<FacturaDetalle> findAll();
			
			public FacturaDetalle findOne(int id);
			
			public void add(FacturaDetalle facturadetalle);
			
			public void up(FacturaDetalle facturadetalle);

			public void del(int id);
			
			//CRUD avanzado

}
