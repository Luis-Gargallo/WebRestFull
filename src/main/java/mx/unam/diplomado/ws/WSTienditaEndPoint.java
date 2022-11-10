package mx.unam.diplomado.ws;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import mx.unam.tic.diplomado.agenda.servicios.ProductoService;
import mx.unam.tic.diplomado.agenda.servicios.ProductoServiceImpl;
import mx.unam.tic.diplomado.agenda.servicios.TrabajadorService;
import mx.unam.tic.diplomado.agenda.servicios.TrabajadorServiceImpl;
import mx.unam.tic.diplomado.agenda.servicios.VentaService;
import mx.unam.tic.diplomado.agenda.servicios.VentaServiceImpl;

@Path("/tienda")
public class WSTienditaEndPoint {

	@GET
	@Path("/venta")
	@Produces(MediaType.APPLICATION_JSON)
	public Response cargaVenta() {
		VentaService ventaService = VentaServiceImpl.getInstance();
		return Response.ok().entity(ventaService.cargaVentas()).build();
	}
	/*
	@GET
	@Path("/producto")
	@Produces(MediaType.APPLICATION_JSON)
	public Response cargaProducto() {
		ProductoService productoService = ProductoServiceImpl.getInstance();
		return Response.ok().entity(productoService.cargaProductos()).build();
	}
	
	@GET
	@Path("/trabajador")
	@Produces(MediaType.APPLICATION_JSON)
	public Response cargaTrabajador() {
		TrabajadorService trabajadorService = TrabajadorServiceImpl.getInstance();
		return Response.ok().entity(trabajadorService.cargaTrabajadores()).build();
	} */
	
}
