package stormchat.backend.groups.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stormchat.backend.StealthchatApplication;
import stormchat.backend.groups.model.UserGroupRequest;

@RestController(value = StealthchatApplication.API_BASE_URL + "/groups")
public class GroupController {

    @PostMapping(value = "/join/{groupId}")
    public ResponseEntity<?> joinGroup(@RequestHeader String Authorization, @RequestBody UserGroupRequest request) {

        return ResponseEntity.ok(200);
    }

    @GetMapping(value = "")
    public ResponseEntity<?> getGroups(@RequestHeader String Authorization) {


        return ResponseEntity.ok(200);
    }





}
