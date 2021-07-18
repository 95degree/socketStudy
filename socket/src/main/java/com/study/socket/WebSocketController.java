package com.study.socket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;


@MessageMapping("/time")
@Controller
public class WebSocketController {

    @SendTo("/topic/test")
    public Time sendTime(Time userTime){
        return userTime;
    }
}
