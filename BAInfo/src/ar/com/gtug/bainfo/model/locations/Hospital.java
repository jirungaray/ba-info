package ar.com.gtug.bainfo.model.locations;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Hospital extends Location<Hospital> {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private long id;

	private int idHospital;
	private String nombre;
	private String calle;
	private String altura;
	private String telefono;
	private String guardia;
	private String fax;
	private String web;
	private String codPostal;
	private String tipoEspecialidad;
	private String tipo;
	private String modoAt1;
	private String modoAt2;
	private String dependAdm;
	private String direccion;
	private float longitud;
	private float latitud;
	
	
	
	@Override
	public String getSourceURL() {
		return "https://recursos-data.buenosaires.gob.ar/ckan2/hospitales/hospitales.csv";
	}

	@Override
	protected Hospital fillValues(String[] values) {
		// id;nombre_est;calle;altura;telefono;guardia;fax;web;cod_postal;
		//tipo_espec;tipo;mod_at_1;mod_at_2;depend_adm;direccion;longitude;latitude;geojson
		Hospital hospital = new Hospital();
		hospital.idHospital = idHospital;
		hospital.nombre = nombre;
		hospital.calle = calle;
		hospital.altura = altura;
		hospital.telefono = telefono;
		hospital.guardia = guardia;
		hospital.fax = fax;
		hospital.web = web;
		hospital.codPostal = codPostal;
		hospital.tipoEspecialidad = tipoEspecialidad;
		hospital.tipo = tipo;
		hospital.modoAt1 = modoAt1;
		hospital.modoAt2 = modoAt2;
		hospital.dependAdm = dependAdm;
		hospital.direccion = direccion;
		hospital.longitud = longitud;
		hospital.latitud = latitud;
		return hospital;
	}

	@Override
	public String getSeparatorChar() {
		return ";";
	}

	public long getId() {
		return id;
	}

	public int getIdHospital() {
		return idHospital;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCalle() {
		return calle;
	}

	public String getAltura() {
		return altura;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getGuardia() {
		return guardia;
	}

	public String getFax() {
		return fax;
	}

	public String getWeb() {
		return web;
	}

	public String getCodPostal() {
		return codPostal;
	}

	public String getTipoEspecialidad() {
		return tipoEspecialidad;
	}

	public String getTipo() {
		return tipo;
	}

	public String getModoAt1() {
		return modoAt1;
	}

	public String getModoAt2() {
		return modoAt2;
	}

	public String getDependAdm() {
		return dependAdm;
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
