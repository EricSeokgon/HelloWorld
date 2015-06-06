package src;

import static org.junit.Assert.*;

/**
 * Created by hadeslee on 15. 6. 7.
 */
public class HelloWorldTest extends HelloWorld {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testMain() throws Exception {
        int a = 10;
        assertEquals(a,10);
    }
}