package com.study.socket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.*;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    /**
     *
     * addEndpoint() : 소켓의 Endpoint(메세지 도착 지점) 정의
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/websocket").withSockJS();
    }

    /**
     *
     * setApplicationDestinationPrefixes() : 서버로 메세지 송신 시 붙여줄 prefix 정의
     * enableSimpleBroker() : 클라이언트에게 메세지 송신 시 붙여줄 prefix 정의
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.setApplicationDestinationPrefixes("/app");
        registry.enableSimpleBroker("/topic");
    }
}
