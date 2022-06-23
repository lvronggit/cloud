package com.lvrong.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class KafkaClient {

    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("bootstrap.servers", "115.159.127.155:9092");
        props.put("acks", "all");
        props.put("retries", 0);
        props.put("linger.ms", 1);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        Producer<String, String> producer = new KafkaProducer(props);
        for (int i = 0; i < 100; i++)
            producer.send(new ProducerRecord<String, String>("quickstart-events", Integer.toString(i), Integer.toString(i)));

        producer.close();
    }
}
