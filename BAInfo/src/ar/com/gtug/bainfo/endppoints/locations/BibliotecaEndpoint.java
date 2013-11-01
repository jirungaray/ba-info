package ar.com.gtug.bainfo.endppoints.locations;

import ar.com.gtug.bainfo.model.PMF;
import ar.com.gtug.bainfo.model.locations.Biblioteca;

import com.google.api.server.spi.config.Api;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

@Api(name = "bibliotecas")
public class BibliotecaEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method.
	 *
	 * @return List of all entities persisted.
	 */
	@SuppressWarnings({ "cast", "unchecked" })
	public List<Biblioteca> listBiblioteca() {
		PersistenceManager mgr = getPersistenceManager();
		List<Biblioteca> result = new ArrayList<Biblioteca>();
		try {
			Query query = mgr.newQuery(Biblioteca.class);
			for (Object obj : (List<Object>) query.execute()) {
				result.add(((Biblioteca) obj));
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
	public Biblioteca getBiblioteca(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Biblioteca biblioteca = null;
		try {
			biblioteca = mgr.getObjectById(Biblioteca.class, id);
		} finally {
			mgr.close();
		}
		return biblioteca;
	}

	/**
	 * This inserts the entity into App Engine datastore.
	 * It uses HTTP POST method.
	 *
	 * @param biblioteca the entity to be inserted.
	 * @return The inserted entity.
	 */
	public Biblioteca insertBiblioteca(Biblioteca biblioteca) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			mgr.makePersistent(biblioteca);
		} finally {
			mgr.close();
		}
		return biblioteca;
	}

	/**
	 * This method is used for updating a entity.
	 * It uses HTTP PUT method.
	 *
	 * @param biblioteca the entity to be updated.
	 * @return The updated entity.
	 */
	public Biblioteca updateBiblioteca(Biblioteca biblioteca) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			mgr.makePersistent(biblioteca);
		} finally {
			mgr.close();
		}
		return biblioteca;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 * @return The deleted entity.
	 */
	public Biblioteca removeBiblioteca(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Biblioteca biblioteca = null;
		try {
			biblioteca = mgr.getObjectById(Biblioteca.class, id);
			mgr.deletePersistent(biblioteca);
		} finally {
			mgr.close();
		}
		return biblioteca;
	}

	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}

}
