package ru.iteco.sender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.iteco.sender.domain.Message;
import ru.iteco.sender.service.MessageServiceImpl;

@RestController
@RequestMapping("api/message")
public class MessageController {

    private MessageServiceImpl messageService;

    @Autowired
    public MessageController(MessageServiceImpl messageService) {
        this.messageService = messageService;
    }

    /**
     * Method for sending message
     * @param message
     * @return
     */
    @CrossOrigin
    @PostMapping
    public ResponseEntity<Message> sendMessage(@RequestBody Message message){
        if (message.getMessage().trim().isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        messageService.send(message.getMessage());
        return new ResponseEntity<Message>(message, HttpStatus.OK);
    }
}