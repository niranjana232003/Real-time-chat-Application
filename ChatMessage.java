package com.neenu.chatapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessage {//class that represent the message
    private Long id;
    private String sender;
    private String content;
}
