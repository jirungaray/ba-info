package ar.com.gtug.bainfo.endppoints.locations;

import ar.com.gtug.bainfo.model.PMF;
import ar.com.gtug.bainfo.model.locations.Bicicleteria;

import com.google.api.server.spi.config.Api;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

@Api(name = "bicicleterias")
public class BicicleteriaEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method.
	 *
	 * @return List of all entities persisted.
	 */
	@SuppressWarnings({ "cast", "unchecked" })
	public List<Bicicleteria> listBicicleteria() {
		PersistenceManager mgr = getPersistenceManager();
		List<Bicicleteria> result = new ArrayList<Bicicleteria>();
		try {
			Query query = mgr.newQuery(Bicicleteria.class);
			for (Object obj : (List<Object>) query.execute()) {
				result.add(((Bicicleteria) obj));
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
	public Bicicleteria getBicicleteria(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Bicicleteria bicicleteria = null;
		try {
			bicicleteria = mgr.getObjectById(Bicicleteria.class, id);
		} finally {
			mgr.close();
		}
		return bicicleteria;
	}

	/**
	 * This inserts the entity into App Engine datastore.
	 * It uses HTTP POST method.
	 *
	 * @param bicicleteria the entity to be inserted.
	 * @return The inserted entity.
	 */
	public Bicicleteria insertBicicleteria(Bicicleteria bicicleteria) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			mgr.makePersistent(bicicleteria);
		} finally {
			mgr.close();
		}
		return bicicleteria;
	}

	/**
	 * This method is used for updating a entity.
	 * It uses HTTP PUT method.
	 *
	 * @param bicicleteria the entity to be updated.
	 * @return The updated entity.
	 */
	public Bicicleteria updateBicicleteria(Bicicleteria bicicleteria) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			mgr.makePersistent(bicicleteria);
		} finally {
			mgr.close();
		}
		return bicicleteria;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 * @return The deleted entity.
	 */
	public Bicicleteria removeBicicleteria(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Bicicleteria bicicleteria = null;
		try {
			bicicleteria = mgr.getObjectById(Bicicleteria.class, id);
			mgr.deletePersistent(bicicleteria);
		} finally {
			mgr.close();
		}
		return bicicleteria;
	}

	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}

}
