package com.seleniumsimplified.junit;


import org.junit.*;

import static org.apache.xalan.xsltc.compiler.util.Type.Int;
import static org.junit.Assert.*;

public class JUnitBeforeAndAfterTest {

    private static int sum = 2+2;
    private static int int1 = 4;
    private static int int2 = 6;


    @BeforeClass
    public static void beforeClass(){

        int1 = 1;
        int2 = 5;

        assertTrue(int2 > int1);

        System.out.println("Before Class!");
    }

    @Before
    public void beforeTest(){

        sum  = 4;

        System.out.println("Before tests!");
    }

    @Test
    public void this1Test(){

        assertEquals("2+2=4",4,sum);

        System.out.println("This is 1 test!");
    }

    @Test
    public void this2Test(){

        assertFalse(int2<int1);

        System.out.println(int2);
    }

    @Test
    public void this3Test(){

        System.out.println("This is 3 test!");
    }

    @After
    public void afterTest(){
        System.out.println("After tests!");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After Class!");
    }


}
