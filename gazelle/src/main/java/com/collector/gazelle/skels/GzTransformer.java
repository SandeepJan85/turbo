package com.collector.gazelle.skels;

import com.collector.gazelle.dto.GzEvent;
import com.collector.gazelle.dto.GzXObject;

public interface GzTransformer {

	public GzEvent transform(GzEvent event); 
}
