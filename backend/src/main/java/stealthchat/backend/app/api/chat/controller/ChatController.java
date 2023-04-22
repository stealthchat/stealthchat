package stealthchat.backend.app.api.chat.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stealthchat.backend.StealthchatApplication;
import stealthchat.backend.app.api.chat.model.UserGroupRequest;

@RestController(value = StealthchatApplication.API_BASE_URL + "/chats")
public class ChatController {

    @GetMapping
    public ResponseEntity<?> getAllChats(@RequestHeader String Authorization) {

        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }



}
