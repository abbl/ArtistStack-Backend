package ovh.abbl.artiststack.service;

import ovh.abbl.artiststack.model.StreamNode;

public interface StreamingNodeManagementService {
    void addNode(StreamNode streamNode);
    void removeNode(StreamNode streamNode);
    void connectAndSave(StreamNode streamNode);
    void connect(StreamNode streamNode);
    void connectAll();
}
