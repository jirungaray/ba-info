package ar.com.gtug.bainfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.gtug.bainfo.model.PMF;
import ar.com.gtug.bainfo.model.locations.AgenciaViajes;

@SuppressWarnings("serial")
public class BAInfoServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
//		try {
//		    URL url = new URL("https://docs.google.com/file/d/0B8omnpOJJblHZzBoUllMLTdYQW8/edit?usp=sharing");
//		  //  URL url = new URL();
//		   
//		    BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
//		    String line;
//		    resp.getWriter().println("init");
//		    resp.getWriter().println("lelelelel");
//
//		    PersistenceManager pm = PMF.get().getPersistenceManager();
//		    while ((line = reader.readLine()) != null) {
//		    	if(!line.startsWith("NOMBRE")){
//		    		pm.makePersistent(new AgenciaViajes(line));
//		    		resp.getWriter().println("*******"+line);
//		    		
//		    	}
//		    }
//		    resp.getWriter().println("end");
//		    pm.close();
//		    reader.close();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		    Logger.getAnonymousLogger().severe(e +" - "+e.getMessage());
//		}
//		
//		resp.setContentType("text/plain");
//		resp.getWriter().println("Hello, world");
	}
}
