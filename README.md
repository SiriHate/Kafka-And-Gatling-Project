# KafkaAndGatlingProject
KafkaAndGatlingProject is a project consisting of three services: ProducerServices, ConsumerService, and LoadTest.
Producer Services and Consumer Service utility Spring to interact with the Apache Kafka message broker, while LoadTest employs Gatling for performance testing.
The project includes a Docker Compose configuration for easy setup and a set of useful commands for working with Apache Kafka.

## About Services

### ProducerService
Spring REST service responsible for receiving REST requests and sending them to the Apache Kafka message broker.

### ConsumerService
Spring service designed for receiving messages from the Apache Kafka broker.

### LoadTest
Application dedicated to load testing systems using Gatling.

### Docker-Compose
The project includes a `docker-compose.yaml` file for configuring the Apache Kafka message broker.

## How To Use?

1. Run docker-compose with command ```docker-compose up -d```.
2. Create a new topic using this command in a running docker container with Apache Kafka:
```
/opt/bitnami/kafka/bin/kafka-topics.sh \
--create \
--topic main_topic \
--partitions 1 \
--replication-factor 1 \
--bootstrap-server localhost:9092
```
4. Launch the ProducerService project using the ProducerServiceApplication class.
5. Launch the ConsumerService project using the ConsumerServiceApplication class.
6. Open the LoadTest project -> Maven button -> Project plugins -> gatling -> run gatling:test (for IntelliJ IDEA).

## Request Example
```
POST /api/message HTTP/1.1
Host: localhost:8081
Content-Type: application/json
Content-Length: 35

{
    "message": "Hello world!"
}
```

## Useful commands for working with Apache Kafka

Output a list of all topics:

```
/opt/bitnami/kafka/bin/kafka-topics.sh --list --bootstrap-server localhost:9092
```

Create new topic:

```
/opt/bitnami/kafka/bin/kafka-topics.sh \
--create \
--topic <your_topic_name> \
--partitions <number_of_partitions> \
--replication-factor <replication_factor> \
--bootstrap-server localhost:9092
```

Get last message from topic:

```
/opt/bitnami/kafka/bin/kafka-console-consumer.sh \
--topic <your_topic_name> \
--from-beginning \
--max-messages 1 \
--bootstrap-server localhost:9092
```
