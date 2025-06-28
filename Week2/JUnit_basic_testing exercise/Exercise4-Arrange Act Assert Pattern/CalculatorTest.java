import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        
        calculator = new Calculator();
        System.out.println("Setup Completed");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown Completed");
    }

    @Test
    public void testAdd() {
        
        int a = 5;
        int b = 3;
        int result = calculator.add(a, b);
        assertEquals(8, result);
    }

    @Test
    public void testMultiply() {
        
        int a = 4;
        int b = 2;

        int result = calculator.multiply(a, b);
	assertEquals(8, result);
    }
}
