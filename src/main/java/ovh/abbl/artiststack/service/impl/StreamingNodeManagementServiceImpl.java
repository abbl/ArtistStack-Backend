package ovh.abbl.artiststack.service.impl;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.client.WebSocketConnectionManager;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;
import org.springframework.web.socket.sockjs.client.RestTemplateXhrTransport;
import org.springframework.web.socket.sockjs.client.SockJsClient;
import org.springframework.web.socket.sockjs.client.Transport;
import org.springframework.web.socket.sockjs.client.WebSocketTransport;
import ovh.abbl.artiststack.model.StreamNode;
import ovh.abbl.artiststack.service.StreamingNodeManagementService;
import ovh.abbl.artiststack.websocket.handler.StreamingNodeWebSocketHandler;

import java.util.ArrayList;

@Service
public class StreamingNodeManagementServiceImpl implements StreamingNodeManagementService {
    private ArrayList<WebSocketConnectionManager> connectedNodes;

    @EventListener
    public void testConnection(ApplicationReadyEvent applicationReadyEvent){
        StreamNode streamNode = new StreamNode();
        streamNode.setAddress("http://localhost:8081/internalCommunication");

        connect(streamNode);
    }

    @Override
    public void addNode(StreamNode streamNode) {

    }

    @Override
    public void removeNode(StreamNode streamNode) {

    }

    @Override
    public void connectAndSave(StreamNode streamNode) {
        connect(streamNode);
    }

    @Override
    public void connectAll() {
    }

    @Override
    public void connect(StreamNode streamNode){
    }
}
