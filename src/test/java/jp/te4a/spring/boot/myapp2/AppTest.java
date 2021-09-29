package jp.te4a.spring.boot.myapp2;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 * aaaaaaaaaa
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
	public void test() {
    	Controller controller = new Controller();
		String expected = "Taro desu!";
		String actual = controller.taro();
		
		assertEquals(expected,actual);
	}
    
}
