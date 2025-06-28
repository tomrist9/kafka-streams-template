# Kafka Streams Template with Spring Boot

[![Java](https://img.shields.io/badge/Java-17-blue)](https://openjdk.org/projects/jdk/17/)
[![Kafka](https://img.shields.io/badge/Kafka-Streams-brightgreen)](https://kafka.apache.org/documentation/streams/)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

A professional Kafka Streams template to build event-driven microservices and real-time data pipelines.

---

## ✨ Features

✅ Kafka Streams app with plug-and-play processors  
✅ Field-based windowed counting (per field value)  
✅ Generic counting processor  
✅ Event counting per time window  
✅ Clean folder structure & modular design  
✅ Easy to extend and customize  
✅ Ready to use in production microservices  

---

## 🧠 Included Processors

| Processor Class              | Description                                                  |
|-----------------------------|--------------------------------------------------------------|
| `KafkaStreamsApp`             | Main class — builds and runs the Kafka Streams topology       |
| `GenericCountStreamBuilder`   | Generic counting of value types                              |
| `FieldCountTimeseriesBuilder` | Field-based windowed counting (e.g. `server_name`)           |
| `EventCountTimeseriesBuilder` | Event counting per time window and group key                |

---

## 🧰 Tech Stack

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

### 🔁 Real-Time Stream Processing  
Displays how messages flow through your Kafka Streams topology.  
![Stream Processing](screenshots/kafka_streams.jpg)

## 📄 License

MIT License

Copyright (c) 2025 Tomris Teymurlu

Permission is hereby granted, free of charge, to any person obtaining a copy  
of this software and associated documentation files (the "Software"), to deal  
in the Software without restriction, including without limitation the rights  
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell  
copies of the Software, and to permit persons to whom the Software is  
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all  
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR  
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,  
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE  
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER  
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT

