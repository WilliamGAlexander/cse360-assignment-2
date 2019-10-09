package cse360assign2;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class AddingMachineTest {
	
	public static AddingMachine testMachine;
	
	@BeforeEach
	public void setup() {
		testMachine = new AddingMachine();
	}
	
	@Test
	public void test1() {
		assertEquals("0", testMachine.toString());
		assertEquals(0, testMachine.getTotal());
	}
	
	@Test
	public void test2() {
		testMachine.add(5);
		assertEquals("0 + 5", testMachine.toString());
		assertEquals(5, testMachine.getTotal());
	}
	
	@Test
	public void test3() {
		testMachine.subtract(5);
		assertEquals("0 - 5", testMachine.toString());
		assertEquals(-5, testMachine.getTotal());
		
	}
	
	@Test
	public void test4() {
		testMachine.add(3);
		testMachine.add(7);
		testMachine.subtract(6);
		assertEquals("0 + 3 + 7 - 6", testMachine.toString());
		assertEquals(4, testMachine.getTotal());
		
	}
	
	@Test
	public void test5() {
		testMachine.add(3);
		testMachine.add(7);
		testMachine.subtract(6);
		assertEquals("0 + 3 + 7 - 6", testMachine.toString());
		assertEquals(4, testMachine.getTotal());
		testMachine.clear();
		assertEquals("0", testMachine.toString());
		assertEquals(0, testMachine.getTotal());	
	}
}
