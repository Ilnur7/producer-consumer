package ru.iteco.sender.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import ru.iteco.sender.domain.Message;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
class MessageServiceImplTest {

    @Autowired
    private MessageServiceImpl messageService;

    @MockBean
    private Message message;

    @Test
    void sendMessage() {
        String messageTest="message";
        when(message.getMessage()).thenReturn(messageTest);
        Assert.assertEquals(messageService.send(message.getMessage()), messageTest);
    }
}