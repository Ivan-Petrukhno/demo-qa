package junit;

import org.junit.jupiter.api.*;

public class JunitTest1 {

    @BeforeEach
    void beforEach(){
        System.out.println("it`s a 1 method");

    }

    @AfterEach
    void afterEach(){
        System.out.println("it`s a 2 method");
    }

    @Test
    void junitTest1() {
        System.out.println("it`s a 3 Test");
        Assertions.assertTrue(3 > 2);




    }



}
