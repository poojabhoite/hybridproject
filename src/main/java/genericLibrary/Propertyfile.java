/*package genericLibrary;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile {
	
	
	public String getPropertydata(String key) throws IOException {
		Properties p =new Properties();
		FileInputStream fis= new FileInputStream(AutoConstant.propertyfilepath);
		p.load(fis);
		p.getProperty(key);
		return  p.getProperty(key);
		 
	}

}
*/

package genericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile {
	
	
	public String gerPropertydata(String key) throws IOException 
	{
		
	Properties p=new Properties();
	FileInputStream fis=new FileInputStream(AutoConstant.propertyfilepath);
	p.load(fis);
	return p.getProperty(key);
	
		
	}

}