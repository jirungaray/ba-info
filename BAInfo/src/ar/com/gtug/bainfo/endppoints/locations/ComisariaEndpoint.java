package ar.com.gtug.bainfo.endppoints.locations;

import ar.com.gtug.bainfo.model.PMF;
import ar.com.gtug.bainfo.model.locations.Comisaria;

import com.google.api.server.spi.config.Api;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

@Api(name = "comisarias")
public class ComisariaEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method.
	 *
	 * @return List of all entities persisted.
	 */
	@SuppressWarnings({ "cast", "unchecked" })
	public List<Comisaria> listComisaria() {
		PersistenceManager mgr = getPersistenceManager();
		List<Comisaria> result = new ArrayList<Comisaria>();
		try {
			Query query = mgr.newQuery(Comisaria.class);
			for (Object obj : (List<Object>) query.execute()) {
				result.add(((Comisaria) obj));
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
	public Comisaria getComisaria(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Comisaria comisaria = null;
		try {
			comisaria = mgr.getObjectById(Comisaria.class, id);
		} finally {
			mgr.close();
		}
		return comisaria;
	}

	/**
	 * This inserts the entity into App Engine datastore.
	 * It uses HTTP POST method.
	 *
	 * @param comisaria the entity to be inserted.
	 * @return The inserted entity.
	 */
	public Comisaria insertComisaria(Comisaria comisaria) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			mgr.makePersistent(comisaria);
		} finally {
			mgr.close();
		}
		return comisaria;
	}

	/**
	 * This method is used for updating a entity.
	 * It uses HTTP PUT method.
	 *
	 * @param comisaria the entity to be updated.
	 * @return The updated entity.
	 */
	public Comisaria updateComisaria(Comisaria comisaria) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			mgr.makePersistent(comisaria);
		} finally {
			mgr.close();
		}
		return comisaria;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 * @return The deleted entity.
	 */
	public Comisaria removeComisaria(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Comisaria comisaria = null;
		try {
			comisaria = mgr.getObjectById(Comisaria.class, id);
			mgr.deletePersistent(comisaria);
		} finally {
			mgr.close();
		}
		return comisaria;
	}

	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}

}
