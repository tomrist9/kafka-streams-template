package org.example.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.CooperativeStickyAssignor;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.errors.WakeupException;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

public class ConsumerDemoWithCooperative {
    private static final Logger log = LoggerFactory.getLogger(ConsumerDemoWithCooperative.class.getSimpleName());

    public static void main(String[] args) {
        String groupId = "my-java-application";
        String topic = "demo_java";

        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", "172.22.190.167:9092");

        properties.setProperty("security.protocol", "PLAINTEXT");

        properties.setProperty("key.deserializer", StringDeserializer.class.getName());
        properties.setProperty("value.deserializer", StringDeserializer.class.getName());

        properties.setProperty("group.id", groupId);

        properties.setProperty("auto.offset.reset", "earliest");
        properties.setProperty("partition.assignment.strategy", CooperativeStickyAssignor.class.getName());

        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(properties);
        final Thread mainThread = Thread.currentThread();
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                log.info("Detected a shutdown, let's exit by calling consumer.wakeup() ...");
                consumer.wakeup();
                try {
                    mainThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        consumer.subscribe(Arrays.asList(topic));
        try {
            while (true) {

                ConsumerRecords<String, String> records =
                        consumer.poll(Duration.ofMillis(1000));

                for (ConsumerRecord<String, String> record : records) {
                    log.info("Key: " + record.key() + "| Value: " + record.value());
                    log.info("Partition: " + record.partition() + "| Offset: " + record.offset());
                }
            }
        }catch (WakeupException e){
            log.info("Consumer is starting to shut down");
        }catch (Exception e){
            log.error("Unexpected exception in the consumer", e);
        }finally{
            consumer.close();
            log.info("The consumer is now gracefully shut down");
        }

    }
}