package ar.com.gtug.bainfo.model.locations;

import java.util.Arrays;
import java.util.logging.Logger;

public abstract class Location<T> {

	public T parse(String line){
		Logger.getAnonymousLogger().info("Constructor:"+line);
		String[] values = line.split(getSeparatorChar());
		String[] result = new String[values.length];
		int i=0;
		int resultIndex=0;
		boolean looping=false;
		StringBuilder builder = new StringBuilder();
		
		for (String value : values) {
			if(looping){
				builder.append(value);
				if(value.endsWith("\"")){
					looping = false;
					result[resultIndex++] = builder.toString();
				}
				i++;
			}else if(value.startsWith("\"")){
				looping = true;
				i++;
				builder = new StringBuilder();
				builder.append(value);
				
			}else{
				result[resultIndex++] = values[i++] ;
			}
		}
		Logger.getAnonymousLogger().info("Build:"+Arrays.toString(result));
		return fillValues(result);
		
	}
	public abstract String getSourceURL();
	
	protected abstract T fillValues(String[] values);
	
	public abstract String getSeparatorChar();
	
}
