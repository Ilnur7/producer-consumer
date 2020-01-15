package ru.iteco.consumer.service;

import ru.iteco.consumer.domain.Message;

public interface MessageService {
    Message saveMessage(String message);
}
