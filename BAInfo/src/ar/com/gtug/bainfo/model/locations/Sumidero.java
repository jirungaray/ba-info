package ar.com.gtug.bainfo.model.locations;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Sumidero extends Location<Sumidero>{

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private long id;

	@Override
	public String getSourceURL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Sumidero fillValues(String[] values) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSeparatorChar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
