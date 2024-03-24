package com.consumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
@Component
public class MessageConsumer {
	@KafkaListener(topics = "my-topic", groupId = "my-group-id")
	public void consume(String msg) {
		System.out.println(msg);
	}

}
