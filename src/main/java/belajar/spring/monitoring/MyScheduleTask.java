package belajar.spring.monitoring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyScheduleTask {
    @Scheduled(fixedDelay = 10000)
    public void hello(){
        log.info("Hello world");
    }
}
