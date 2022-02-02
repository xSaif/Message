package org.almaktabah.messages.service;

import org.almaktabah.messages.entity.Message;
import org.almaktabah.messages.repository.MessageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public Message saveMessage(Message message){
        return messageRepository.save(message);
    }

    public Message findMessageById(Long messageId){
        return messageRepository.findMessageById(messageId);
    }
}
