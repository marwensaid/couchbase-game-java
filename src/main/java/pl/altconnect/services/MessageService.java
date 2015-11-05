package pl.altconnect.services;

import com.couchbase.client.protocol.views.ComplexKey;
import com.couchbase.client.protocol.views.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.altconnect.beans.Message;
import pl.altconnect.repositories.MessageRepository;

@Service
public class MessageService {

    private MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository repository) {
        this.messageRepository = repository;
    }

    public void doWork() {

        Message message = new Message("gamehunters", "altconnect", "Test Spring Server");
        messageRepository.save(message);


        Query query = new Query();
        query.setKey(ComplexKey.of("Jackson"));
    }
}
