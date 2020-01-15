package ru.iteco.consumer.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.iteco.consumer.service.MessageServiceImpl;

@Slf4j
@Component
public class MessageListener {

    private MessageServiceImpl messageService;

    @Autowired
    public MessageListener(MessageServiceImpl messageService){
        this.messageService = messageService;
    }

    /**
     * Method for receiving message from queue
     * @param messageReceived
     */
    @RabbitListener(queues = "${rabbitmq.queue}")
    public void consume(String messageReceived) {
        log.info("Received: " + messageReceived);
        messageService.saveMessage(messageReceived);
    }
}
