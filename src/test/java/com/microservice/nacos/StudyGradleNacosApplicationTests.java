package com.microservice.nacos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudyGradleNacosApplicationTests {

    @Value("${pawn}")
    private String pawn;

    @Test
    void contextLoads() {
        System.err.println(pawn);
    }

}
