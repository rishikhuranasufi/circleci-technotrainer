package com.technotrainer.training.tdd.service;
//import main.src.com.technotrainer.training.CalculatorExample;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class CalculatorApplicationTests {

    //@Test
    void contextLoads() {
    }
    
    @Test
    public void testArea() throws Exception{
    	CalculatorExample calculatorExample = new CalculatorExample();
    	Assert.assertEquals(198, calculatorExample.additionOfTwoNumber("99", "99"));
    }

}
