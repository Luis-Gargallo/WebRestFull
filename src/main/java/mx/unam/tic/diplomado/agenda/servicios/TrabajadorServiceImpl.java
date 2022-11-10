package mx.unam.tic.diplomado.agenda.servicios;

import java.util.List;

import mx.unam.tic.diplomado.agenda.modelo.dao.TrabajadorDao;
import mx.unam.tic.diplomado.agenda.modelo.dao.TrabajadorDaoImplHibernate;
import mx.unam.tic.diplomado.agenda.modelo.entidades.Trabajador;

public class TrabajadorServiceImpl implements  TrabajadorService{

	private static TrabajadorServiceImpl instance;
	
	private TrabajadorServiceImpl() {
		
	}

	public static TrabajadorServiceImpl getInstance() {
		if (instance == null) {
			instance = new TrabajadorServiceImpl();
		}
		return instance;
	}

	@Override
	public List<Trabajador> cargaTrabajadores() {
		TrabajadorDao dao = new TrabajadorDaoImplHibernate();
		return dao.findAll();
		//return null;
	}

	@Override
	public Trabajador cargaTrabajadorPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Trabajador cargaPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}
