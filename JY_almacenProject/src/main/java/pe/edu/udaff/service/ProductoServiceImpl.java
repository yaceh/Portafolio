package pe.edu.udaff.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.udaff.dao.ProductoDao;
import pe.edu.udaff.entities.Producto;
@Service("productoService")
@Transactional
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoDao productoDao;
	@Override
	public List<Producto> getAll() {
		
		return productoDao.getAll();
	}

}
