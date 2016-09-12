package com.mt.kafka;

import java.util.Date;
import java.util.Properties;
import java.util.Random;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

public class Test1 {

    public static void main(String[] args) {
        String s = 1 + 1 + '1' + 1 + 1 + 1 + 1 + "1";
        System.out.println(s);
        Random rnd = new Random();
        Properties props = new Properties();

        props.put("metadata.broker.list", "120.25.204.152:9092");
        props.put("serializer.class", "kafka.serializer.StringEncoder");
        props.put("partitioner.class", "com.mt.kafka.SimplePartitioner");
        props.put("request.required.acks", "1");
        ProducerConfig config = new ProducerConfig(props);

        Producer<String, String> producer = new Producer<String, String>(config);

        for (long nEvents = 0; nEvents < 4; nEvents++) {
            long runtime = new Date().getTime();
            String ip = "192.168.2." + rnd.nextInt(255);
            String msg = runtime + ",www.example.com," + ip;
            KeyedMessage<String, String> data = new KeyedMessage<String, String>("page_visits", ip, msg);
            producer.send(data);
        }
        producer.close();// FailoverCluster
        // RegistryProtocol
        // Invoker<T>
    }

}
