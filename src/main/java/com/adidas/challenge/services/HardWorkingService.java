package com.adidas.challenge.services;

import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class HardWorkingService {

    private final static Logger logger = LoggerFactory.getLogger(HardWorkingService.class);

    private final AtomicLong counter = new AtomicLong();

    public void DoSomeIncreasinglyHardWork(){
        try {
            Thread.sleep(counter.incrementAndGet());
        } catch (InterruptedException e) {
            logger.error("Someone dared to interrupt a sleeping thread!");
        }
    }

}
