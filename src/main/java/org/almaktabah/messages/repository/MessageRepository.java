package org.almaktabah.messages.repository;

import org.almaktabah.messages.entity.Message;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    Message findMessageById(Long messageId);
}
