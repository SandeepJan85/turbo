package com.collector.gazelle.skels;

import com.collector.gazelle.dto.GzEvent;

public interface GzParser {

	public GzEvent parse(GzEvent event);
}
