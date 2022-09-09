package com.altiusdigital.devopssep22;

import com.altiusdigital.devopssep22.controller.Devopssep22Controller;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@EnableAutoConfiguration
@ComponentScan("com.altiusdigital.devopssep22.*")
@ExtendWith (MockitoExtension.class)
@RunWith(JUnit4.class)
public class Devopssep22ApplicationTests {
    @Autowired
    ApplicationContext context;
    @InjectMocks
    Devopssep22Controller ctrller;


    @Test
    void contextLoads() {
    }
   @Test
    public void testGreeting(){
        String greet = ctrller.greet ( );
        assertEquals(greet,"Hello Java");
        
   }
}
