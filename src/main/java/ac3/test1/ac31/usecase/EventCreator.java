package ac3.test1.ac31.usecase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class EventCreator {
    private static final Logger LOG = LoggerFactory.getLogger(EventCreator.class);

    @Scheduled(fixedRate = 1000)
    public void create() {
        final LocalDateTime start = LocalDateTime.now();
        LOG.debug("Event created!" + start);
    }
}