package ru.iteco.consumer.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ru.iteco.consumer.domain.Message;
import ru.iteco.consumer.dto.MessageDto;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class MessageRepositoryTest {

    @Autowired
    private MessageRepository messageRepository;

    @Test
    public void save() {
        String messageStr="message";
        Message message = MessageDto.toDomain(messageStr);
        messageRepository.save(message);
        Iterable<Message> messages = messageRepository.findAll();
        Assert.assertEquals(messages.iterator().next(), message);
        messageRepository.delete(message);
    }

}