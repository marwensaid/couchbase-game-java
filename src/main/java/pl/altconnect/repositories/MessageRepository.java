package pl.altconnect.repositories;

import com.couchbase.client.protocol.views.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.altconnect.beans.Message;

import java.util.List;

@Repository
public interface MessageRepository extends CrudRepository<Message, String> {

    List<Message> findByGame(Query query);
}
