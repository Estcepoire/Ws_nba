package com.clouding.ws.api;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController{
    @GetMapping("/login")
    @ResponseBody
    public String login() {
        return "FFFF";
    }
}