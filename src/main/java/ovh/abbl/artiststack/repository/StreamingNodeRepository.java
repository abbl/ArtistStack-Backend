package ovh.abbl.artiststack.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ovh.abbl.artiststack.model.StreamNode;

public interface StreamingNodeRepository extends MongoRepository<StreamNode, String> {
}
