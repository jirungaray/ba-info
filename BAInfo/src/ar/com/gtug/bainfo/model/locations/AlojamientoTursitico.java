package ar.com.gtug.bainfo.model.locations;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class AlojamientoTursitico extends Location<AlojamientoTursitico> {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private long id;
	
	private String categoria;
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
	public String getSourceURL() {
		return "https://recursos-data.buenosaires.gob.ar/ckan2/alojamientos-turisticos/alojamientos.csv";
	}

	@Override
	protected AlojamientoTursitico fillValues(String[] values) {
		//CATEGORIA,NOMBRE,DOMICILIO,UBICACION,TELEFONO,DIRECCION,ALTURA,WEB,EMAIL,LAT,LONG
		AlojamientoTursitico newAlojamientoTursitico = new AlojamientoTursitico();
		newAlojamientoTursitico.categoria = values[0];
		newAlojamientoTursitico.nombre = values[1];
		newAlojamientoTursitico.domicilio = values[2];
		newAlojamientoTursitico.ubicacion = values[3];
		newAlojamientoTursitico.telefono = values[4];
		newAlojamientoTursitico.direccion = values[5];
		newAlojamientoTursitico.altura = values[6];
		newAlojamientoTursitico.web = values[7];
		newAlojamientoTursitico.email = values[8];
		newAlojamientoTursitico.latitud = Float.parseFloat(values[9]);
		newAlojamientoTursitico.longitud = Float.parseFloat(values[10]);
		
		return newAlojamientoTursitico;
		
	}

	@Override
	public String getSeparatorChar() {
		return ",";
	}


	public long getId() {
		return id;
	}



	public String getCategoria() {
		return categoria;
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
	
	

}
