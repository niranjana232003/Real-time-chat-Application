package com.neenu.chatapp.controller;

import com.neenu.chatapp.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {//handle messages from the clients and broadcast it
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage (ChatMessage message){
        return message;
    }
    @GetMapping()
    public String chat(){
        return "chat";//name of  a time leaf template
    }
}
