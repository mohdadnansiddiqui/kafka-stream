package com.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.producer.produce.MessageProduce;

@SpringBootApplication
public class KafkaProducerApplication implements CommandLineRunner {
	@Autowired
    MessageProduce messageProduce;
	public static void main(String[] args)  {
		SpringApplication.run(KafkaProducerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		for (int i = 0; i < 100000; i++) {
			messageProduce.produceMsg("my-topic", "msg no"+i);
		}
		
	}

}
