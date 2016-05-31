package com.collector.gazelle.config;

import java.util.HashMap;
import java.util.Map;

import com.collector.gazelle.skels.DefaultGzParser;
import com.collector.gazelle.skels.DefaultGzTransformer;
import com.collector.gazelle.skels.GzParser;
import com.collector.gazelle.skels.GzTransformer;

public class GzConfig {
	private Map<String, GzTransformer> xformMap = new HashMap<String, GzTransformer>();
	private Map<String, GzParser> parserMap = new HashMap<String, GzParser>();
	private GzParser defaultParser = new DefaultGzParser();
	private GzTransformer defaultTransformer = new DefaultGzTransformer();

	public GzConfig() {
		parserMap.put("DEFAULT", defaultParser);
		xformMap.put("DEFAULT", defaultTransformer);

	}

	public GzParser getParser(String eventType) {
		if (parserMap.get(eventType) != null) {
			return parserMap.get(eventType);
		} else {
			return parserMap.get("DEFAULT");
		}
	}

	public GzTransformer getTransformer(String eventType) {
		if (xformMap.get(eventType) != null) {
			return xformMap.get(eventType);
		} else {
			return xformMap.get("DEFAULT");
		}
	}

	public void registerParser(String eventType, GzParser parser) {
		parserMap.put(eventType, parser);
	}

	public void registerTransformer(String eventType, GzTransformer xformer) {
		xformMap.put(eventType, xformer);
	}

}
