package org.example.mensageriaapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChatMessage {
    private String content;
    private String sender;
    private String timestamp;
    private String senderId;

    // Construtor padrão
    public ChatMessage() {}

    // Construtor com parâmetros
    public ChatMessage(String content, String sender, String senderId) {
        this.content = content;
        this.sender = sender;
        this.senderId = senderId;
        this.timestamp = String.valueOf(System.currentTimeMillis()); // Inicializa com timestamp atual
    }

    // Getters e Setters
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }
}
