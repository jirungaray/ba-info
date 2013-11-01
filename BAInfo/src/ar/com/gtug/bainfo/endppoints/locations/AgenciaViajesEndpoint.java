package ar.com.gtug.bainfo.endppoints.locations;

import ar.com.gtug.bainfo.model.PMF;
import ar.com.gtug.bainfo.model.locations.AgenciaViajes;

import com.google.api.server.spi.config.Api;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

@Api(name = "agenciasviajes")
public class AgenciaViajesEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method.
	 *
	 * @return List of all entities persisted.
	 */
	@SuppressWarnings({ "cast", "unchecked" })
	public List<AgenciaViajes> listAgenciaViajes() {
		PersistenceManager mgr = getPersistenceManager();
		List<AgenciaViajes> result = new ArrayList<AgenciaViajes>();
		try {
			Query query = mgr.newQuery(AgenciaViajes.class);
			for (Object obj : (List<Object>) query.execute()) {
				result.add(((AgenciaViajes) obj));
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
	public AgenciaViajes getAgenciaViajes(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		AgenciaViajes agenciaviajes = null;
		try {
			agenciaviajes = mgr.getObjectById(AgenciaViajes.class, id);
		} finally {
			mgr.close();
		}
		return agenciaviajes;
	}

	/**
	 * This inserts the entity into App Engine datastore.
	 * It uses HTTP POST method.
	 *
	 * @param agenciaviajes the entity to be inserted.
	 * @return The inserted entity.
	 */
	public AgenciaViajes insertAgenciaViajes(AgenciaViajes agenciaviajes) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			mgr.makePersistent(agenciaviajes);
		} finally {
			mgr.close();
		}
		return agenciaviajes;
	}

	/**
	 * This method is used for updating a entity.
	 * It uses HTTP PUT method.
	 *
	 * @param agenciaviajes the entity to be updated.
	 * @return The updated entity.
	 */
	public AgenciaViajes updateAgenciaViajes(AgenciaViajes agenciaviajes) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			mgr.makePersistent(agenciaviajes);
		} finally {
			mgr.close();
		}
		return agenciaviajes;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 * @return The deleted entity.
	 */
	public AgenciaViajes removeAgenciaViajes(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		AgenciaViajes agenciaviajes = null;
		try {
			agenciaviajes = mgr.getObjectById(AgenciaViajes.class, id);
			mgr.deletePersistent(agenciaviajes);
		} finally {
			mgr.close();
		}
		return agenciaviajes;
	}

	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}

}
