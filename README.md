# Kafka Streams Template with Spring Boot

[![Java](https://img.shields.io/badge/Java-17-blue)](https://openjdk.org/projects/jdk/17/)
[![Kafka](https://img.shields.io/badge/Kafka-Streams-brightgreen)](https://kafka.apache.org/documentation/streams/)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

A professional Kafka Streams template to build event-driven microservices and real-time data pipelines.

---

##  Features

✅ Kafka Streams app with plug-and-play processors  
✅ Field-based windowed counting (per field value)  
✅ Generic counting processor  
✅ Event counting per time window  
✅ Clean folder structure & modular design  
✅ Easy to extend and customize  
✅ Ready to use in production microservices  

---

##  Included Processors

| Processor Class              | Description                                                  |
|-----------------------------|--------------------------------------------------------------|
| `KafkaStreamsApp`             | Main class — builds and runs the Kafka Streams topology       |
| `GenericCountStreamBuilder`   | Generic counting of value types                              |
| `FieldCountTimeseriesBuilder` | Field-based windowed counting (e.g. `server_name`)           |
| `EventCountTimeseriesBuilder` | Event counting per time window and group key                |

---

##  Tech Stack

- Java 17  
- Apache Kafka  
- Kafka Streams API  
- Gradle  
- Docker Compose  

---

## How to Use
1. Clone repo
git clone https://github.com/tomrist9/kafka-streams-template.git

 cd kafka-streams-template

## 📸 Demo

Kafka Streams application in action:

###  Real-Time Stream Processing  
Displays how messages flow through your Kafka Streams topology.  
![Stream Processing](screenshots/kafka_streams.jpg)


This software is provided "as is", without warranty of any kind.
