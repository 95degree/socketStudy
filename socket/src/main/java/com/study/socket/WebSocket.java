package com.study.socket;

import org.springframework.stereotype.Component;

import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.util.ArrayList;
import java.util.List;

@Component
@ServerEndpoint("/websocket")
public class WebSocket{

    private List<Session> sessionList = new ArrayList<>();

    @OnOpen
    public void handleOpen(Session session){
        if(session != null){
            String sessionId = session.getId();
            sessionList.add(session);
        }
    }
}
