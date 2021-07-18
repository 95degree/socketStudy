package com.study.socket;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSocketController {
    public Time sendTime(@RequestBody Time userTime){
        return userTime;
    }
}
