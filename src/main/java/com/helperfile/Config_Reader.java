package com.helperfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config_Reader {
	
	public static Properties p;
	
	
	public Config_Reader() throws IOException {
		File f=new File("C:\\Users\\prabu\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\helperfile\\Configuration.properties");
		FileInputStream fis=new FileInputStream(f);
		
		p=new Properties();
		
		p.load(fis);
	}
	
	public String get_Url() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String get_Uname() {
		String uname = p.getProperty("username");
		return uname;
		
	}
	
	public String get_Pass() {
		String pass = p.getProperty("password");
		return pass;
	}
	
	public String get_Ccnum() {
		String ccnum = p.getProperty("ccv");
		return ccnum;
	}
	
	public String get_Cccvv() {
		String cccvvnum = p.getProperty("cccvv");
		return cccvvnum;
	}

}
