package pe.edu.udaff.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.exception.SQLGrammarException;
import org.springframework.stereotype.Repository;

import pe.edu.udaff.entities.Producto;

@Repository("productoDao")
public class ProductoDaoImpl implements ProductoDao{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Producto> getAll() {
			return (List<Producto>)entityManager.createQuery("from Producto", Producto.class).getResultList();
	}
	
	
	
}

