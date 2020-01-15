package ru.iteco.consumer.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class MessageServiceImplTest {

    @Autowired
    private MessageServiceImpl messageService;

    @Test
    void sendMessage() {
        String message="message";
        Assert.assertTrue(messageService.saveMessage(message).getText().equals(message));
    }
}