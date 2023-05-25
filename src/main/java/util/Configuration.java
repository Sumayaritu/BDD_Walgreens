package util;

import java.io.IOException;

import java.io.InputStream;
import java.util.Properties;


public class Configuration {
	Properties properties;
	
	public Configuration() {
		loadProperties();
	}
	private void loadProperties() {
		properties=new Properties();
		InputStream iStream=getClass().getClassLoader().getResourceAsStream("configuration.properties");
		try {
			properties.load(iStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String getValue(String key) {
		return properties.getProperty(key);
		
	}
	public int readValueNum(String key) {
		return Integer.parseInt(getValue(key));
	}
	

}
