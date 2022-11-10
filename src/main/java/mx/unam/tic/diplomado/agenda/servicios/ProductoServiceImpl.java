package mx.unam.tic.diplomado.agenda.servicios;

import java.util.List;

import mx.unam.tic.diplomado.agenda.modelo.dao.ProductoDao;
import mx.unam.tic.diplomado.agenda.modelo.dao.ProductoDaoImplHibernate;
import mx.unam.tic.diplomado.agenda.modelo.entidades.Producto;

public class ProductoServiceImpl implements ProductoService {

	private static ProductoServiceImpl instance;

	private ProductoServiceImpl() {

	}

	public static ProductoServiceImpl getInstance() {
		if (instance == null) {
			instance = new ProductoServiceImpl();
		}
		return instance;
	}

	@Override
	public List<Producto> cargaProductos() {
		ProductoDao dao = new ProductoDaoImplHibernate();
		return dao.findAll();
		//return null;
	}

	@Override
	public Producto cargaProductoPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto cargaPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
