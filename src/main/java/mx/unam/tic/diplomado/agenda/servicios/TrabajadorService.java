package mx.unam.tic.diplomado.agenda.servicios;

import java.util.List;

import mx.unam.tic.diplomado.agenda.modelo.entidades.Trabajador;

public interface TrabajadorService {

	List<Trabajador> cargaTrabajadores();
	
	Trabajador cargaTrabajadorPorId(Integer id);
	
	Trabajador cargaPorNombre(String nombre);
}
