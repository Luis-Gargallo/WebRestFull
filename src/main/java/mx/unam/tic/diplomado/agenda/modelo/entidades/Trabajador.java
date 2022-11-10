package mx.unam.tic.diplomado.agenda.modelo.entidades;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_trabajador")
public class Trabajador {

	private Integer idTrabajador;
	private String nombre;
	private String apellido;
	private String numeroCelular;
	private Integer edad;
	private String genero;
	private String curp;
	
	//@ManyToOne 
	//@JoinColumn(name = "tt_venta_trabajador")
	private Venta venta;
	
	public Trabajador() {
		// TODO Auto-generated constructor stub
	}

	public Trabajador(Integer idTrabajador, String nombre, String apellido, String numeroCelular, Integer edad,
			String genero, String curp) {
		super();
		this.idTrabajador = idTrabajador;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroCelular = numeroCelular;
		this.edad = edad;
		this.genero = genero;
		this.curp = curp;
	}

	@Id
	@Column(name = "id_trabajador")
	public Integer getIdTrabajador() {
		return idTrabajador;
	}

	public void setIdTrabajador(Integer idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	@Column(name = "tt_nombres")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "tt_apellidos")
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
	@Column(name = "tt_numero_celular")
	public String getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	@Column(name = "tt_edad")
	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Column(name = "tt_genero")
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Column(name = "tt_curp")
	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	@ManyToOne 
	@JoinColumn(name = "tt_venta_trabajador")
	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	@Override
	public String toString() {
		return "Trabajador [idTrabajador=" + idTrabajador + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", numeroCelular=" + numeroCelular + ", edad=" + edad + ", genero=" + genero + ", curp=" + curp + ", venta=" + venta + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, curp, edad, genero, idTrabajador, nombre, numeroCelular);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trabajador other = (Trabajador) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(curp, other.curp)
				&& Objects.equals(edad, other.edad) && Objects.equals(genero, other.genero)
				&& Objects.equals(idTrabajador, other.idTrabajador) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(numeroCelular, other.numeroCelular);
	}
	
	
	
}
