package ar.com.gtug.bainfo.endppoints.locations;

import ar.com.gtug.bainfo.model.PMF;
import ar.com.gtug.bainfo.model.locations.AlojamientoTursitico;

import com.google.api.server.spi.config.Api;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

@Api(name = "alojamientostursiticos")
public class AlojamientoTursiticoEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method.
	 *
	 * @return List of all entities persisted.
	 */
	@SuppressWarnings({ "cast", "unchecked" })
	public List<AlojamientoTursitico> listAlojamientoTursitico() {
		PersistenceManager mgr = getPersistenceManager();
		List<AlojamientoTursitico> result = new ArrayList<AlojamientoTursitico>();
		try {
			Query query = mgr.newQuery(AlojamientoTursitico.class);
			for (Object obj : (List<Object>) query.execute()) {
				result.add(((AlojamientoTursitico) obj));
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
	public AlojamientoTursitico getAlojamientoTursitico(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		AlojamientoTursitico alojamientotursitico = null;
		try {
			alojamientotursitico = mgr.getObjectById(
					AlojamientoTursitico.class, id);
		} finally {
			mgr.close();
		}
		return alojamientotursitico;
	}

	/**
	 * This inserts the entity into App Engine datastore.
	 * It uses HTTP POST method.
	 *
	 * @param alojamientotursitico the entity to be inserted.
	 * @return The inserted entity.
	 */
	public AlojamientoTursitico insertAlojamientoTursitico(
			AlojamientoTursitico alojamientotursitico) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			mgr.makePersistent(alojamientotursitico);
		} finally {
			mgr.close();
		}
		return alojamientotursitico;
	}

	/**
	 * This method is used for updating a entity.
	 * It uses HTTP PUT method.
	 *
	 * @param alojamientotursitico the entity to be updated.
	 * @return The updated entity.
	 */
	public AlojamientoTursitico updateAlojamientoTursitico(
			AlojamientoTursitico alojamientotursitico) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			mgr.makePersistent(alojamientotursitico);
		} finally {
			mgr.close();
		}
		return alojamientotursitico;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 * @return The deleted entity.
	 */
	public AlojamientoTursitico removeAlojamientoTursitico(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		AlojamientoTursitico alojamientotursitico = null;
		try {
			alojamientotursitico = mgr.getObjectById(
					AlojamientoTursitico.class, id);
			mgr.deletePersistent(alojamientotursitico);
		} finally {
			mgr.close();
		}
		return alojamientotursitico;
	}

	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}

}
