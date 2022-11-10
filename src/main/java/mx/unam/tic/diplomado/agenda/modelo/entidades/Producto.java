package mx.unam.tic.diplomado.agenda.modelo.entidades;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "t_producto")
public class Producto implements Serializable  {

	private static final long serialVersionUID = 1L;
	private Integer idProducto;
	private String nombreProducto;
	private Double precio;
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaRegistro;
	
	//@ManyToOne(targetEntity = Producto.class, optional = false, fetch = FetchType.LAZY)
	//@JoinColumn(name = "venta_producto",  nullable = false)
	private Venta venta;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(Integer idProducto) {
		super();
		this.idProducto = idProducto;
	}

	public Producto(Integer idProducto, String nombreProducto, Double precio, Date fechaRegistro) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.fechaRegistro = fechaRegistro;
	}

	@Id
	@Column(name = "id_producto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	@Column(name = "tp_nombre_producto")
	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	@Column(name = "tp_precio")
	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Column(name = "tp_fecha_registro")
	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	@ManyToOne
	@JoinColumn(name = "tp_venta_producto")
	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precio=" + precio
				+ ", fechaRegistro=" + fechaRegistro + ", venta=" + venta + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaRegistro, idProducto, nombreProducto, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(fechaRegistro, other.fechaRegistro) && Objects.equals(idProducto, other.idProducto)
				&& Objects.equals(nombreProducto, other.nombreProducto)
				&& Objects.equals(venta, other.venta);
	}
}
