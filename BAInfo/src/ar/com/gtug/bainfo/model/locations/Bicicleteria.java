package ar.com.gtug.bainfo.model.locations;

import java.util.Arrays;
import java.util.logging.Logger;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Bicicleteria extends Location<Bicicleteria> {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private long id;

	private String nombre;
	private String domicilio;
	private String telefono;
	private String web;
	private String barrio;
	private String comuna;
	private float longitud;
	private float latitud;


	@Override
	public String getSourceURL() {
		return "https://recursos-data.buenosaires.gob.ar/ckan2/bicicleterias/bicicleterias.csv";
	}

	@Override
	protected Bicicleteria fillValues(String[] values) {
		//bicicleteria;direccion;telefono;pagina_web;barrio;comuna;longitude;latitude;geojson

		Bicicleteria bicicleteria = new Bicicleteria();
		bicicleteria.nombre = values[0];
		bicicleteria.domicilio = values[1];
		bicicleteria.telefono = values[2];
		bicicleteria.web = values[3];
		bicicleteria.barrio = values[4];
		bicicleteria.comuna = values[5];
		bicicleteria.longitud =  Float.parseFloat(values[6]);
		bicicleteria.latitud =  Float.parseFloat(values[7]);
		
		return bicicleteria;
	
	}
	
	@Override
	public String getSeparatorChar() {
		return ";";
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

	public String getTelefono() {
		return telefono;
	}

	public String getWeb() {
		return web;
	}

	public String getBarrio() {
		return barrio;
	}

	public String getComuna() {
		return comuna;
	}

	public float getLatitud() {
		return latitud;
	}

	public float getLongitud() {
		return longitud;
	}
	
	

}
