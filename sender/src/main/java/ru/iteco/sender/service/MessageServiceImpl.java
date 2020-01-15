package ru.iteco.sender.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Class for managing message
 */
@Slf4j
@Service
public class MessageServiceImpl implements MessageService{

    private RabbitTemplate rabbitTemplate;

    @Value("${rabbitmq.queue}")
    private String queue;

    @Autowired
    public MessageServiceImpl(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    /**
     * Method for sending message in queue
     * @param message
     * @return
     */
    public String send(String message) {
        this.rabbitTemplate.convertAndSend(queue, message);
        log.info(" [x] Sent " + message);
        return message;
    }
}
