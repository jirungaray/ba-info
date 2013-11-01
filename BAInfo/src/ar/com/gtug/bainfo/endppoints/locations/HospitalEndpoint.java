package ar.com.gtug.bainfo.endppoints.locations;

import ar.com.gtug.bainfo.model.PMF;
import ar.com.gtug.bainfo.model.locations.Hospital;

import com.google.api.server.spi.config.Api;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

@Api(name = "hospitales")
public class HospitalEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method.
	 *
	 * @return List of all entities persisted.
	 */
	@SuppressWarnings({ "cast", "unchecked" })
	public List<Hospital> listHospital() {
		PersistenceManager mgr = getPersistenceManager();
		List<Hospital> result = new ArrayList<Hospital>();
		try {
			Query query = mgr.newQuery(Hospital.class);
			for (Object obj : (List<Object>) query.execute()) {
				result.add(((Hospital) obj));
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
	public Hospital getHospital(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Hospital hospital = null;
		try {
			hospital = mgr.getObjectById(Hospital.class, id);
		} finally {
			mgr.close();
		}
		return hospital;
	}

	/**
	 * This inserts the entity into App Engine datastore.
	 * It uses HTTP POST method.
	 *
	 * @param hospital the entity to be inserted.
	 * @return The inserted entity.
	 */
	public Hospital insertHospital(Hospital hospital) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			mgr.makePersistent(hospital);
		} finally {
			mgr.close();
		}
		return hospital;
	}

	/**
	 * This method is used for updating a entity.
	 * It uses HTTP PUT method.
	 *
	 * @param hospital the entity to be updated.
	 * @return The updated entity.
	 */
	public Hospital updateHospital(Hospital hospital) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			mgr.makePersistent(hospital);
		} finally {
			mgr.close();
		}
		return hospital;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 * @return The deleted entity.
	 */
	public Hospital removeHospital(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Hospital hospital = null;
		try {
			hospital = mgr.getObjectById(Hospital.class, id);
			mgr.deletePersistent(hospital);
		} finally {
			mgr.close();
		}
		return hospital;
	}

	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}

}
