package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoSpyBean;

@SpringBootTest
public class DemoMockTest {
    @MockitoSpyBean
    private DemoRepository demoRepository;

    @Test
    void isEmptyTest() {
        Assertions.assertTrue(demoRepository.findAll().isEmpty());
    }
}
