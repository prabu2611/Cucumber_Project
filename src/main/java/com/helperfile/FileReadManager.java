package com.helperfile;

import java.io.IOException;

public class FileReadManager {
	
	private FileReadManager() {
		
	}

	public static FileReadManager getInstance_FRM() {
		FileReadManager frm=new FileReadManager();
		return frm;
	}
	
	
	public Config_Reader getInstance_CR() throws IOException {
		Config_Reader reader=new Config_Reader();
		return reader;
	}

}
