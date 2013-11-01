package ar.com.gtug.bainfo.model.locations;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Biblioteca extends Location<Biblioteca>{

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private long id;

	private int IdBiblioteca;
	private String nombre;
	private String tipo;
	private String domicilio;
	private String telefono;
	private String nombreMapa;
	private String barrios;
	private String comuna;
	private String email;
	private float longitud;
	private float latitud;
	
	@Override
	public String getSourceURL() {
		return "https://recursos-data.buenosaires.gob.ar/ckan2/bibliotecas/bibliotecas.csv";
	}

	@Override
	protected Biblioteca fillValues(String[] values) {
		// ID2,NOMBRE,TIPO,DOMICILIO,TELEFONO,NOM_MAPA,BARRIOS,COMUNA,CORREO,LONGITUDE,LATITUDE,GEOJSON
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.IdBiblioteca = Integer.parseInt(values[0]);
		biblioteca.nombre =  values[1];
		biblioteca.tipo =  values[2];
		biblioteca.domicilio =  values[3];
		biblioteca.telefono =  values[4];
		biblioteca.nombreMapa =  values[5];
		biblioteca.barrios =  values[6];
		biblioteca.comuna =  values[7];
		biblioteca.email =  values[8];
		biblioteca.longitud =  Float.parseFloat(values[9]);
		biblioteca.latitud =  Float.parseFloat(values[10]);
		return biblioteca;
	
		
	}

	@Override
	public String getSeparatorChar() {
		return ",";
	}


	public long getId() {
		return id;
	}


	public int getIdBiblioteca() {
		return IdBiblioteca;
	}


	public String getNombre() {
		return nombre;
	}


	public String getTipo() {
		return tipo;
	}


	public String getDomicilio() {
		return domicilio;
	}


	public String getTelefono() {
		return telefono;
	}


	public String getNumeroMapa() {
		return nombreMapa;
	}


	public String getBarrios() {
		return barrios;
	}


	public String getComuna() {
		return comuna;
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
