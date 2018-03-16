package calc;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CaculatorTest {
	private static CalculatorMain calc;
	
	@BeforeClass
	public static void setup(){
		calc = new CalculatorMain();
	}
	//All the test cases are developed for integer values and won't work for decimal number inputs and answers won't be accurate. 
	@Test
	public void testAdd() {
		assertEquals(5, calc.add(3,2));
	}
	@Test
	public void testSub() {
		assertEquals(1, calc.sub(3,2));
	}
	@Test
	public void testMul() {
		assertEquals(6, calc.mul(3,2));
	}
	@Test
	public void testDiv() {
		assertEquals(1, calc.div(2,2));
	}
	@Test
	public void testDivByZero() {
		assertEquals(0, calc.div(3,0));
	}
	@Test
	public void testPresedence() {
		assertEquals(30, calc.add(calc.mul(5, 5), calc.div(10, 2)));
	}
	//additional unit test for calculator program
	@Test
	public void pwr() {
		assertEquals(9, calc.pwr(3,2));
	}
	//integration testing, additional test for average
	@Test
	public void avrg() {
		assertEquals(20, calc.div(calc.add(30, 10),2));
	}
	@Test
	//integration testing for average formula
	public void prcnt() {
		assertEquals(90, calc.div(calc.mul(540,100),600));
	}
	
}
