# Kafka Streams Template with Spring Boot

A professional Kafka Streams Template to build event-driven microservices and streaming pipelines.

## Features

✅ Kafka Streams App with plug-and-play processors  
✅ Field-based windowed counting (per field value)  
✅ Generic counting processor  
✅ Event counting per time window  
✅ Clean folder structure & modular design  
✅ Easy to extend and customize  
✅ Ready to use in production microservices

## Included Processors

| Processor Class              | Description                                                  |
|-----------------------------|--------------------------------------------------------------|
| KafkaStreamsApp             | Main application — builds and runs the Kafka Streams topology |
| GenericCountStreamBuilder   | Generic counting of value types                              |
| FieldCountTimeseriesBuilder | Field-based windowed counting (e.g. `server_name`)           |
| EventCountTimeseriesBuilder | Event counting per time window and group key                |

## Tech Stack

- Java 17  
- Apache Kafka  
- Kafka Streams API  
- Gradle  
- Docker Compose (Kafka stack)

## How to Use
1. Clone repo
2. Start Kafka with Docker or local install
3. `mvn clean package`
4. Run:
   ```bash
   java -cp target/demo.jar com.example.ProducerApp
   java -cp target/demo.jar com.example.ConsumerApp

## 📸 Demo

Kafka Streams application in action:

### 🔁 Real-Time Stream Processing  
Displays how messages flow through your Kafka Streams topology.  
![Stream Processing](screenshots/kafka_streams.jpg)
