package com.wb773.nestedexception.scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * WeeklyCron
 */
@Component
@Slf4j
public class WeeklyCron {

    @Scheduled(fixedRate = 1000)
    public void execute() {
        log.info("hello WeeklyCron");
    }

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));
    }
}