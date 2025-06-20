Package com.neenu.chatapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker//direct message to write place(like which chatroom)
public class WebsocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/chat")
                .setAllowedOrigins("http://localhost:8080")//prevent unauthorized access
                .withSockJS();//app more accessible to more users



    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        //set message broker
        registry.enableSimpleBroker("/topic");
        registry.setApplicationDestinationPrefixes("/app");//message processing

    }
}
