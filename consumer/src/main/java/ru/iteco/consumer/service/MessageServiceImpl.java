package ru.iteco.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.iteco.consumer.domain.Message;
import ru.iteco.consumer.dto.MessageDto;
import ru.iteco.consumer.repository.MessageRepository;

@Service
public class MessageServiceImpl implements MessageService {

    private MessageRepository messageRepository;

    @Autowired
    public MessageServiceImpl(MessageRepository messageRepository){
        this.messageRepository=messageRepository;
    }

    /**
     * Method for saving message in database
     * @param messageReceived
     * @return
     */
    @Override
    public Message saveMessage(String messageReceived) {
        Message message = messageRepository.save(MessageDto.toDomain(messageReceived));
        return message;
    }
}
