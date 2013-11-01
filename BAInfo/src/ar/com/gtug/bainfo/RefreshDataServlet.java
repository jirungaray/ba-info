package ar.com.gtug.bainfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.logging.Logger;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.gtug.bainfo.model.PMF;
import ar.com.gtug.bainfo.model.locations.AgenciaViajes;
import ar.com.gtug.bainfo.model.locations.AlojamientoTursitico;
import ar.com.gtug.bainfo.model.locations.Biblioteca;
import ar.com.gtug.bainfo.model.locations.Bicicleteria;
import ar.com.gtug.bainfo.model.locations.CentroAtencionCESAC;
import ar.com.gtug.bainfo.model.locations.Comisaria;
import ar.com.gtug.bainfo.model.locations.Hospital;
import ar.com.gtug.bainfo.model.locations.Location;


public class RefreshDataServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String tipo = req.getParameter("data");
		Location loc = null;
		URL url = null;
//		switch (tipo) {
//		case "biblioteca": {
//			loc = new Biblioteca();
//			url = new URL(loc.getSourceURL());
//			break;
//		}
//		case "viajes": {
//			loc = new Biblioteca();
//			url = new URL(loc.getSourceURL());
//			break;
//		}
//		case "alojamientos": {
//			loc = new Biblioteca();
//			url = new URL(loc.getSourceURL());
//			break;
//		}
//		case "bicicleteria": {
//			loc = new Biblioteca();
//			url = new URL(loc.getSourceURL());
//			break;
//		}
//		case "cesac": {
//			loc = new Biblioteca();
//			url = new URL(loc.getSourceURL());
//			break;
//		}
//
//		default:
//			break;
//		}
  
	if(tipo.equals("biblioteca")) {
			loc = new Biblioteca();	
		}else if(tipo.equals("viajes")){
			loc = new AgenciaViajes();
		}else if(tipo.equals("alojamientos")){
			loc = new AlojamientoTursitico();
		}else if(tipo.equals("bicicleteria")){	
			loc = new Bicicleteria();
		}else if(tipo.equals("cesac")){
			loc = new CentroAtencionCESAC();
		}else if(tipo.equals("comisaria")){
			loc = new Comisaria();
		}else if(tipo.equals("hospital")){
			loc = new Hospital();
		}
		int count = 0;
		try {
			  PersistenceManager pm = PMF.get().getPersistenceManager();
				
			Query q = pm.newQuery(loc.getClass());
			q.deletePersistentAll();
		    BufferedReader reader = new BufferedReader(new InputStreamReader( new URL(loc.getSourceURL()).openStream()));
		    String line;
		  
		    reader.readLine();
		    while ((line = reader.readLine()) != null) {
		    		pm.makePersistent(loc.parse(line));
		    		count++;
		    	
		    }
		    pm.close();
		    reader.close();

		} catch (Exception e) {
			e.printStackTrace();
		    Logger.getAnonymousLogger().severe(e +" - "+e.getMessage());
		}
		
		
		resp.getWriter().write("200 ok - saved "+count+" entities");
	}

}
