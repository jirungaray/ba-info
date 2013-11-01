package ar.com.gtug.bainfo.model.locations;

import java.util.Arrays;
import java.util.logging.Logger;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;


@PersistenceCapable
public class AgenciaViajes extends Location<AgenciaViajes>{

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private long id;

	private String nombre;
	private String domicilio;
	private String ubicacion;
	private String telefono;
	private String direccion;
	private String altura;
	private String web;
	private String email;
	private float latitud;
	private float longitud;

	@Override
	protected AgenciaViajes fillValues(String[] values) {
		
		
		AgenciaViajes newAgencia = new AgenciaViajes();
		newAgencia.nombre = values[0];
		newAgencia.domicilio = values[1];
		newAgencia.ubicacion = values[2];
		newAgencia.telefono = values[3];
		newAgencia.direccion = values[4];
		newAgencia.altura = values[5];
		newAgencia.web = values[6];
		newAgencia.email = values[7];
		newAgencia.latitud = Float.parseFloat(values[8]);
		newAgencia.longitud = Float.parseFloat(values[9]);
		
		return newAgencia;

	}
	public long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getAltura() {
		return altura;
	}

	public String getWeb() {
		return web;
	}

	public String getEmail() {
		return email;
	}

	public float getLatitud() {
		return latitud;
	}

	public float getLongitud() {
		return longitud;
	}


	@Override
	public String getSourceURL() {
		return "https://recursos-data.buenosaires.gob.ar/ckan2/agencia-viajes/agencia-viajes-turismo.csv";
	}
	@Override
	public String getSeparatorChar() {
		return ",";
	}

}
