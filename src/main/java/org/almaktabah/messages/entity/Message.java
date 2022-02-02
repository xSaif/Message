package org.almaktabah.messages.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="messages")
public class Message {

    public Message(){}

    public Message(Long id, Long fromId, Long toId, String title, String content, boolean isRead, LocalDateTime sendingTime) {
        this.id = id;
        this.fromId = fromId;
        this.toId = toId;
        this.title = title;
        this.content = content;
        this.isRead = isRead;
        this.sendingTime = sendingTime;
    }

    public Message(Long id, Long fromId, Long toId, String title, String content, boolean isRead, LocalDateTime sendingTime, Long updatedBy, LocalDateTime updatedAt) {
        this.id = id;
        this.fromId = fromId;
        this.toId = toId;
        this.title = title;
        this.content = content;
        this.isRead = isRead;
        this.sendingTime = sendingTime;
        this.updatedBy = updatedBy;
        this.updatedAt = updatedAt;
    }

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="from_id", nullable = false)
    private Long fromId;

    @Column(name="to_id", nullable = false)
    private Long toId;

    @Column(name="title")
    private String title;

    @Column(name="content", nullable = false)
    private String content;

    @Column(name="is_read", nullable = false)
    private boolean isRead = false;

    @Column(name="sending_time", nullable = false)
    private LocalDateTime sendingTime = LocalDateTime.now();

    @Column(name="updated_by")
    private Long updatedBy;

    @Column(name="updated_at")
    private LocalDateTime updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFromId() {
        return fromId;
    }

    public void setFromId(Long fromId) {
        this.fromId = fromId;
    }

    public Long getToId() {
        return toId;
    }

    public void setToId(Long toId) {
        this.toId = toId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public LocalDateTime getSendingTime() {
        return sendingTime;
    }

    public void setSendingTime(LocalDateTime sendingTime) {
        this.sendingTime = sendingTime;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
