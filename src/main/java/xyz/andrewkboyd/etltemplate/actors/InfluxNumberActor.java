package xyz.andrewkboyd.etltemplate.actors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class InfluxNumberActor {
    private static final Logger LOG = LoggerFactory.getLogger(InfluxNumberActor.class);

    @KafkaListener(topics = "test.number", groupId = "test.number.influx")
    public void handleModifiedCve(String modifiedCveUpdate)  {
        LOG.debug("Received number update for influxdb");
    }
}
