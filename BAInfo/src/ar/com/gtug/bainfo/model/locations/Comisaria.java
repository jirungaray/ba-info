package ar.com.gtug.bainfo.model.locations;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Comisaria extends Location<Comisaria> {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private long id;

	private int idComisaria;
	private String nombre;
	private String direccion;
	private String comuna;
	private String barrio;
	private String cirscuncri;
	private float longitud;
	private float latitud;


	@Override
	public String getSourceURL() {
		return "https://recursos-data.buenosaires.gob.ar/ckan2/comisarias/comisarias.csv";
	}

	@Override
	protected Comisaria fillValues(String[] values) {
		// id;nombre;direccion;comuna;barrio;circunscri;longitude;latitude;geojson
		Comisaria comisaria =new Comisaria();
		comisaria.idComisaria = Integer.parseInt(values[0]);
		comisaria.nombre = values[1];
		comisaria.direccion = values[2];
		comisaria.comuna = values[3];
		comisaria.barrio = values[4];
		comisaria.cirscuncri = values[5];
		comisaria.longitud =  Float.parseFloat(values[6]);
		comisaria.latitud =  Float.parseFloat(values[7]);
		return comisaria;
	}

	@Override
	public String getSeparatorChar() {
		return ";";
	}

	public long getId() {
		return id;
	}

	public int getIdComisaria() {
		return idComisaria;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public String getBarrio() {
		return barrio;
	}

	public String getCirscuncri() {
		return cirscuncri;
	}

	public float getLongitud() {
		return longitud;
	}

	public float getLatitud() {
		return latitud;
	}
	
	

}
