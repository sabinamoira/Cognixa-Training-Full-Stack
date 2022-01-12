package com.d01.basic;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

public class D05TimeoutTest {
	
	@Test
    void test_timeout_fail() {
        // assertTimeout(Duration.ofSeconds(5), () -> delaySecond(10)); // this will fail

        assertTimeout(Duration.ofSeconds(5), () -> delaySecond(1)); // pass
    }

    void delaySecond(int second) {
        try {
            TimeUnit.SECONDS.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}