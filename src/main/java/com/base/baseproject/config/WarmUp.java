package com.base.baseproject.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class WarmUp {

    @EventListener(ApplicationReadyEvent.class)
    public void warmUpExercise(){
        log.info("║▌│█║▌│ █║▌│█│║▌║\n" +
                "\uD835\uDE68\uD835\uDE58\uD835\uDE56\uD835\uDE63\uD835\uDE63\uD835\uDE5E\uD835\uDE63\uD835\uDE5C \uD835\uDE58\uD835\uDE64\uD835\uDE59\uD835\uDE5A...\n");
    }
}
