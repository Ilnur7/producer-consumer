package ru.iteco.consumer.dto;

import ru.iteco.consumer.domain.Message;

public class MessageDto {

    /**
     * Method for creating entity of message
     * @param message
     * @return
     */
    public static Message toDomain(String message) {
        return new Message(message);
    }
}
