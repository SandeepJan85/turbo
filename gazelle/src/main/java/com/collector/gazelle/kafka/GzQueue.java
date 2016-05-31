package com.collector.gazelle.kafka;

import java.util.concurrent.ExecutionException;

import com.collector.gazelle.dto.GzEvent;

public interface GzQueue {

	public void put(GzEvent msg, boolean sync) throws InterruptedException, ExecutionException;
	
	public Object get();
	
}
