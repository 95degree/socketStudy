package com.study.socket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
@ServerEndpoint("/websocket")
public class WebSocket{

    private List<Session> sessionList = new ArrayList<>();

    @OnOpen
    public void handleOpen(Session session){
        if(session != null){
            String sessionId = session.getId();
            sessionList.add(session);
            log.info(sessionId);
        }
    }

    @OnMessage
    public void handleMessage(String string, Session session) throws IOException {
        session.getBasicRemote().sendText(string+"안녕하세요");
    }
}
