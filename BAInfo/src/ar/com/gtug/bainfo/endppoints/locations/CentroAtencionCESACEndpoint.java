package ar.com.gtug.bainfo.endppoints.locations;

import ar.com.gtug.bainfo.model.PMF;
import ar.com.gtug.bainfo.model.locations.CentroAtencionCESAC;

import com.google.api.server.spi.config.Api;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

@Api(name = "centroscesac")
public class CentroAtencionCESACEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method.
	 *
	 * @return List of all entities persisted.
	 */
	@SuppressWarnings({ "cast", "unchecked" })
	public List<CentroAtencionCESAC> listCentroAtencionCESAC() {
		PersistenceManager mgr = getPersistenceManager();
		List<CentroAtencionCESAC> result = new ArrayList<CentroAtencionCESAC>();
		try {
			Query query = mgr.newQuery(CentroAtencionCESAC.class);
			for (Object obj : (List<Object>) query.execute()) {
				result.add(((CentroAtencionCESAC) obj));
			}
		} finally {
			mgr.close();
		}
		return result;
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	public CentroAtencionCESAC getCentroAtencionCESAC(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		CentroAtencionCESAC centroatencioncesac = null;
		try {
			centroatencioncesac = mgr.getObjectById(CentroAtencionCESAC.class,
					id);
		} finally {
			mgr.close();
		}
		return centroatencioncesac;
	}

	/**
	 * This inserts the entity into App Engine datastore.
	 * It uses HTTP POST method.
	 *
	 * @param centroatencioncesac the entity to be inserted.
	 * @return The inserted entity.
	 */
	public CentroAtencionCESAC insertCentroAtencionCESAC(
			CentroAtencionCESAC centroatencioncesac) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			mgr.makePersistent(centroatencioncesac);
		} finally {
			mgr.close();
		}
		return centroatencioncesac;
	}

	/**
	 * This method is used for updating a entity.
	 * It uses HTTP PUT method.
	 *
	 * @param centroatencioncesac the entity to be updated.
	 * @return The updated entity.
	 */
	public CentroAtencionCESAC updateCentroAtencionCESAC(
			CentroAtencionCESAC centroatencioncesac) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			mgr.makePersistent(centroatencioncesac);
		} finally {
			mgr.close();
		}
		return centroatencioncesac;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 * @return The deleted entity.
	 */
	public CentroAtencionCESAC removeCentroAtencionCESAC(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		CentroAtencionCESAC centroatencioncesac = null;
		try {
			centroatencioncesac = mgr.getObjectById(CentroAtencionCESAC.class,
					id);
			mgr.deletePersistent(centroatencioncesac);
		} finally {
			mgr.close();
		}
		return centroatencioncesac;
	}

	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}

}
