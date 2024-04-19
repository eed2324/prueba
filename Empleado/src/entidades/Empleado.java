package entidades;

import java.time.LocalDate;

public class Empleado {
	String nombre;
	String dni;
	LocalDate fNacimiento;
	String ciudad;
	double sueldo;
	
	public Empleado(String nombre, String dni, LocalDate fNacimiento, String ciudad, double sueldo) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.fNacimiento = fNacimiento;
		this.ciudad = ciudad;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDate getfNacimiento() {
		return fNacimiento;
	}

	public void setfNacimiento(LocalDate fNacimiento) {
		this.fNacimiento = fNacimiento;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
}
