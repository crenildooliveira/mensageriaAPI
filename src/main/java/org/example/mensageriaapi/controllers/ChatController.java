package org.example.mensageriaapi.controllers;

import org.example.mensageriaapi.entities.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage") // Endpoint para receber mensagens
    @SendTo("/topic/messages") // Envia as mensagens para todos os inscritos nesse tópico
    public ChatMessage sendMessage(ChatMessage chatMessage) {
        // Aqui você pode adicionar lógica adicional, como persistir a mensagem no banco de dados

        System.out.println("Mensagem recebida de " + chatMessage.getSender() + " :" + chatMessage.getContent());

        // Adicionando o timestamp atual à mensagem
        chatMessage.setTimestamp(String.valueOf(System.currentTimeMillis())); // ou use um formato mais legível

        return chatMessage; // Retorna a mensagem recebida para todos os inscritos
    }
}
