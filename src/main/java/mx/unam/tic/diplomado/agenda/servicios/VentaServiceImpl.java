package mx.unam.tic.diplomado.agenda.servicios;

import java.util.List;

import mx.unam.tic.diplomado.agenda.modelo.dao.VentaDao;
import mx.unam.tic.diplomado.agenda.modelo.dao.VentaDaoImplHibernate;
import mx.unam.tic.diplomado.agenda.modelo.entidades.Venta;

public class VentaServiceImpl implements VentaService {
	
	private static VentaServiceImpl instance;

	private VentaServiceImpl() {
		
	}
	
	public static VentaServiceImpl getInstance() {
		if(instance == null) {
			instance = new VentaServiceImpl();
		}
		return instance;
	}

	@Override
	public Venta cargaVentaPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Venta> cargaVentas() {
		VentaDao dao = new VentaDaoImplHibernate();
		return dao.findAll();
	}

	@Override
	public void guardaVenta(Venta venta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizaContacto(Venta venta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarVenta(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
