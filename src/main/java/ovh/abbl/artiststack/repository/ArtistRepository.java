package ovh.abbl.artiststack.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ovh.abbl.artiststack.model.Artist;

public interface ArtistRepository extends MongoRepository<Artist, String> {

}
