package Facebookscript_Class;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
	
	
	String path;
	FileInputStream fis;
	Properties prop;
	
	public BaseClass() throws IOException {
		
		path = System.getProperty("user.dir")+"//config.properties";
		fis = new FileInputStream(path);
		prop = new Properties();
		prop.load(fis);

}
}