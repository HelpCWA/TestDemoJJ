package com.example.demo;

import javafx.application.Application;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)

@RunWith(Suite.class)
@Suite.SuiteClasses({TestMovie1.class,TestMovie2.class})
public class DemoApplicationTests {


}