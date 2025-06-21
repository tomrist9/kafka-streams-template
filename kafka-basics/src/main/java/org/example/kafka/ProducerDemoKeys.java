package org.example.kafka;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public class ProducerDemoKeys {
    private static final Logger log = LoggerFactory.getLogger(ProducerDemoKeys.class.getSimpleName());

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
        for (int j = 0; j < 2; j++) {


            for (int i = 0; i < 10; i++) {
                String topic = "demo_java_";
                String key = "id_" + i;
                String value = "Kafka java producer consumer demo!" + i;

                ProducerRecord<String, String> producerRecord =
                        new ProducerRecord<>(topic, key, value);

                producer.send(producerRecord, new Callback() {
                    @Override
                    public void onCompletion(RecordMetadata metadata, Exception exception) {
                        if (exception == null) {
                            log.info("Key: " + key + "| Partition: " + metadata.partition());
                        } else {
                            log.error("Error while producing", exception);
                        }
                    }
                });
            }
        }

        producer.flush();
        producer.close();

    }
}
