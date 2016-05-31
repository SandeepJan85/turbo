package com.collector.gazelle.kafka;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import com.collector.gazelle.dto.GzEvent;

public class GzQueueKafkaImpl implements GzQueue{

	Properties props = new Properties();
	KafkaProducer<String,String> producer = null; 
			
	public GzQueueKafkaImpl(){
		props = new Properties();
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,StringSerializer.class.getName());
		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,StringSerializer.class.getName());
		producer = new KafkaProducer<String,String>(props);
	}
	
	public void put(GzEvent msg, boolean sync) throws InterruptedException, ExecutionException {
		ProducerRecord<String,String> producerRecord = new ProducerRecord<String,String>(msg.getRoutingInfo().getTopicName(), null, msg.toString());
		if (sync) {
			producer.send(producerRecord).get();
		} else {
			producer.send(producerRecord);
		}
	}

	public Object get() {
		return null;
	}

	
	

}
