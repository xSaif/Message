package org.almaktabah.messages.controller;

import org.almaktabah.messages.entity.Message;
import org.almaktabah.messages.service.MessageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Message saveMessage(@RequestBody Message message){
        return messageService.saveMessage(message);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Message findMessageById(@PathVariable("id") Long messageId){
        return messageService.findMessageById(messageId);
    }
}
