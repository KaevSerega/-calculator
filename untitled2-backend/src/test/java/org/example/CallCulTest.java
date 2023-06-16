package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CallCulTest {
    @Test
    void sum(){
        CallCulytor callCulytor = new CallCulytor();
        double result = callCulytor.sum(5,6);
        Assertions.assertEquals(11,result);
    }
    @Test
    void division(){
        CallCulytor callCulytor = new CallCulytor();
        double result = callCulytor.div(6,2);
        Assertions.assertEquals(3,result);
    }
    @Test
    void pow(){
        CallCulytor callCulytor = new CallCulytor();
        double result = callCulytor.pow(2,4);
        Assertions.assertEquals(16,result);
    }
    @Test
    void sub(){
        CallCulytor callCulytor = new CallCulytor();
        double result = callCulytor.sub(10,4);
        double result2 =callCulytor.sub(0,10);
        Assertions.assertEquals(6,result);
        Assertions.assertEquals(-10,result2);
    }
    @Test
    void mult(){
        CallCulytor callCulytor = new CallCulytor();
        double result = callCulytor.mult(2,4);
        double result2 =callCulytor.mult(5,10);
        Assertions.assertEquals(8,result);
        Assertions.assertEquals(50,result2);
    }
    @Test
    void divRem(){
        CallCulytor callCulytor = new CallCulytor();
        double result = callCulytor.divRem(7,7);
        double result2 =callCulytor.divRem(7,2);
        Assertions.assertEquals(0,result);
        Assertions.assertEquals(1,result2);
    }
}
