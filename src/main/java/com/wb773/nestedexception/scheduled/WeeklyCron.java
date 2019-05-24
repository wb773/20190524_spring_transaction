package com.wb773.nestedexception.scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.wb773.nestedexception.service.BookingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * WeeklyCron
 */
@Component
@Slf4j
public class WeeklyCron {

    @Autowired
    BookingService bookingService;

    @Scheduled(fixedRate = 10000)
    public void execute() {
        log.info("hello WeeklyCron");
        bookingService.book("persons");
    }

    @Scheduled(fixedRate = 50000)
    public void executeList() {

        log.info(String.join(",", bookingService.findAllBookings()));
        ;
    }

}