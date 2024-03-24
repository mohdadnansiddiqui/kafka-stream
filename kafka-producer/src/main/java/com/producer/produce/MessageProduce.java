package com.producer.produce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
@Component
public class MessageProduce {
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	public void produceMsg(String topic, String msg) {
		kafkaTemplate.send(topic, msg);
	}
}
