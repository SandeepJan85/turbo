package com.collector.gazelle;

import com.collector.gazelle.config.GzConfig;

public class TestMain {

	public static void main(String[] args) throws Exception{
		GzMain main = new GzMain();
		
		GzConfig gzConfig = main.getGzConfig();
		
		main.start(args);
		
		
	}
	
}
