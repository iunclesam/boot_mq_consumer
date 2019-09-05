package com.atguigu.boot.activemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Component
public class Queue_Consumer {


    @JmsListener(destination = "${queue-name}")
    public void receive(TextMessage message) {
        try {
            System.out.println("消费者收到的消息：" + message.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
