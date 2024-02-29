package junit;

import org.junit.jupiter.api.*;

public class JunitTest1 {

    @BeforeEach
    void beforEach(){
        System.out.println("it`s a method");

    }

    @AfterEach
    void afterEach(){
        System.out.println("it`s a method");
    }

    @Test
    void junitTest1() {
        System.out.println("it`s a Test");
        Assertions.assertTrue(3 > 2);




    }



}
