package ovh.abbl.artiststack.model;

import org.springframework.data.annotation.Id;

public class Artist {
    @Id
    private String id;
    private String name;
    private String password;
    private String email;
    private String desc;
}
