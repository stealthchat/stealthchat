package stealthchat.backend.chatting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import stealthchat.backend.chatting.model.Message;

@Controller
public class ChatController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/test")
    @SendTo("/test")
    public Message receivePublicMessage(@Payload Message message) {
        return message;
    }


    @MessageMapping("/group-message")
    public Message receiveGroupMessage(@Payload Message message) {
        // /group/{groupId}
        simpMessagingTemplate.convertAndSend("/group/" + message.getReceiveGroup().getGroupId(), message);

        return message;
    }

    @MessageMapping("/private-message")
    public Message receivePrivateMessage(@Payload Message message) {
        // /user/{userId}/private
        simpMessagingTemplate.convertAndSendToUser(message.getReceiveUser().getIdAsString(), "/private", message);
        return message;
    }

}
