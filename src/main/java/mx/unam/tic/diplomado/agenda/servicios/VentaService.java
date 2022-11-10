package mx.unam.tic.diplomado.agenda.servicios;

import java.util.List;

import mx.unam.tic.diplomado.agenda.modelo.entidades.Venta;

public interface VentaService {

	Venta cargaVentaPorId(Integer id);
	
	List<Venta> cargaVentas();	
	
	void guardaVenta(Venta venta);
	
	void actualizaContacto(Venta venta);
	
	void eliminarVenta(Integer id);
}
