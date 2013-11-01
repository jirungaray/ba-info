package ar.com.gtug.bainfo.model.locations;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class CentroAtencionCESAC extends Location<CentroAtencionCESAC> {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private long id;
	
	private int idCentro;
	private String nombre;
	private String telefono;
	private String area;
	private String region;
	private String comuna;
	private String barrio;
	private String direccion;
	private float longitud;
	private float latitud;

	@Override
	public String getSourceURL() {
		return "https://recursos-data.buenosaires.gob.ar/ckan2/cesac/cesac.csv";
	}

	@Override
	protected CentroAtencionCESAC fillValues(String[] values) {
		//id;nombre;telefono_;area_prog;region_san;comuna;barrio;direccion;longitude;latitude;geojson
		CentroAtencionCESAC atencionCESAC = new CentroAtencionCESAC();
		atencionCESAC.idCentro = Integer.parseInt(values[0]);
		atencionCESAC.nombre = values[1];
		atencionCESAC.telefono = values[2];
		atencionCESAC.area = values[3];
		atencionCESAC.region = values[4];
		atencionCESAC.comuna = values[5];
		atencionCESAC.barrio = values[6];
		atencionCESAC.direccion = values[7];
		atencionCESAC.longitud = Float.parseFloat(values[8]);
		atencionCESAC.latitud = Float.parseFloat(values[9]);
		return atencionCESAC;
		
	}

	@Override
	public String getSeparatorChar() {
		return ";";
	}

	public long getId() {
		return id;
	}

	public int getIdCentro() {
		return idCentro;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getArea() {
		return area;
	}

	public String getRegion() {
		return region;
	}

	public String getComuna() {
		return comuna;
	}

	public String getBarrio() {
		return barrio;
	}

	public String getDireccion() {
		return direccion;
	}

	public float getLongitud() {
		return longitud;
	}

	public float getLatitud() {
		return latitud;
	}
	
	

}
