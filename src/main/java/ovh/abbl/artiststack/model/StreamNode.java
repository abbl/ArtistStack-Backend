package ovh.abbl.artiststack.model;

import lombok.Data;

@Data
public class StreamNode {
    private int id;
    private String name;
    private String address;
    private String internalCommunicationPassword;
}
