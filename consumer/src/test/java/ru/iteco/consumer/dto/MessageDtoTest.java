package ru.iteco.consumer.dto;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import ru.iteco.consumer.domain.Message;

class MessageDtoTest {

    @Test
    void toDomain() {
        String messageDto="message";
        Message message = MessageDto.toDomain(messageDto);
        Assert.assertEquals(messageDto, message.getText());
    }
}