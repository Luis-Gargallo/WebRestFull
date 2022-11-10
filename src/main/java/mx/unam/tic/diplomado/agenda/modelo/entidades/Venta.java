package mx.unam.tic.diplomado.agenda.modelo.entidades;

import java.sql.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
@Table(name = "t_venta")
/*
@NamedQueries(
		{@NamedQuery(name = "ventaAll", query = "FROM Venta"),
			@NamedQuery(name = "ventaById", query = "SELECT v FROM Venta v WHERE v.id = :id"),
			@NamedQuery(name ="ventaByProducto", query = "SELECT v FROM Venta v WHERE v.producto.id = :idProducto"),
			@NamedQuery(name ="ventaByTrabajador", query = "SELECT v FROM Venta v WHERE v.trabajador.id = :idTrabajador")
			}) */
public class Venta {

	
	private Integer idVenta;
	private Double total;
	private Integer cantidad;
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaVenta;
	
	//@OneToMany(mappedBy = "venta")
	private List<Producto> producto;
	
	//@OneToMany(mappedBy = "venta")
	private Trabajador trabajador;
	
	public Venta() {
		// TODO Auto-generated constructor stub
	}

	public Venta(Integer idVenta, Double total, Integer cantidad, Date fechaVenta) {
		super();
		this.idVenta = idVenta;
		this.total = total;
		this.cantidad = cantidad;
		this.fechaVenta = fechaVenta;
	}

	@Id
	@Column(name = "id_venta")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}

	@Column(name = "tv_total")
	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	@Column(name = "tv_cantidad")
	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	@Column(name = "tv_fecha_venta")
	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	//@OneToMany 
	//@JoinColumn(name = "id_producto")
	@OneToMany(mappedBy = "venta", cascade = CascadeType.ALL, orphanRemoval = true)
	//@OneToMany(mappedBy = "venta", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	//@OneToMany(mappedBy = "id_producto", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	//@Fetch(FetchMode.JOIN)
	public List<Producto> getProducto() {
		return producto;
	}

	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}

	@ManyToOne 
	@JoinColumn(name = "id_trabajador")
	public Trabajador getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}

	@Override
	public String toString() {
		return "Venta [idVenta=" + idVenta + ", total=" + total + ", cantidad=" + cantidad + ", fechaVenta="
				+ fechaVenta +  "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cantidad, fechaVenta, idVenta, total);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venta other = (Venta) obj;
		return Objects.equals(cantidad, other.cantidad) && Objects.equals(fechaVenta, other.fechaVenta)
				&& Objects.equals(idVenta, other.idVenta) && Objects.equals(total, other.total);
	}
	
	
}
