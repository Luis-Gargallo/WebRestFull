package mx.unam.tic.diplomado.agenda.servicios;

import java.util.List;

import mx.unam.tic.diplomado.agenda.modelo.entidades.Producto;

public interface ProductoService {

	List<Producto> cargaProductos();
	
	Producto cargaProductoPorId(Integer id);
	
	Producto cargaPorNombre(String nombre);
}
