package xyz.andrewkboyd.etltemplate.actors;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class PostgresqlNumberActor {
    private static final Logger LOG = LoggerFactory.getLogger(PostgresqlNumberActor.class);

    @KafkaListener(topics = "test.number", groupId = "test.number.pg")
    public void handleModifiedCve(String modifiedCveUpdate)  {
        LOG.debug("Received number update for postgresql");
    }
}
