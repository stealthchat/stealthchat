package stealthchat.backend.app.api.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import stealthchat.backend.StealthchatApplication;

@RestController
@RequestMapping(value = StealthchatApplication.API_BASE_URL + "/user")
public class UserController {
}
