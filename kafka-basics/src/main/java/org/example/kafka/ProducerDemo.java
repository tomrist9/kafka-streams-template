package org.example.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.protocol.types.Field;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public class ProducerDemo {
    private static final Logger log = LoggerFactory.getLogger(ProducerDemo.class.getSimpleName());
    public static void main(String[] args) {

        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", "172.22.190.167:9092");


//        properties.setProperty("bootstrap.servers", "cluster.playground.cdkt.io:9092");
        properties.setProperty("security.protocol", "PLAINTEXT");
//        properties.setProperty("sasl.jaas.config", "org.apache.kafka.common.security.plain.PlainLoginModule required username=\"3ZP2D3315Fr7rb1t6HLWHB\" password=\"79fa840d-e735-4d48-8131f2a322fed3c8\";");
//        properties.setProperty("sasl.mechanism", "PLAIN");

        properties.setProperty("key.serializer", StringSerializer.class.getName());
        properties.setProperty("value.serializer", StringSerializer.class.getName());

        KafkaProducer<String, String> producer = new KafkaProducer<>(properties);

        ProducerRecord<String, String> producerRecord =
                new ProducerRecord<>("demo_java", "Kafka java producer consumer demo!");

        producer.send(producerRecord);

        producer.flush();
        producer.close();

    }
}
