package org.example.mensageriaapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        // Configura o broker de mensagens para enviar mensagens a partir de /topic
        config.enableSimpleBroker("/topic");
        // Define o prefixo para destinos de aplicação
        config.setApplicationDestinationPrefixes("/app");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // Permite todas as origens para fins de desenvolvimento (ajuste conforme necessário)
        registry.addEndpoint("/chat")
                .setAllowedOriginPatterns("*") // Permite todas as origens
                .withSockJS(); // Habilita o SockJS para suporte em navegadores
    }
}
