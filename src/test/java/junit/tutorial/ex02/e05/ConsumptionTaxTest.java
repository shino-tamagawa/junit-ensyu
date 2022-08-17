package junit.tutorial.ex02.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConsumptionTaxTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testConsumptionTax1() {
		ConsumptionTax conTax = new ConsumptionTax(5);
		int result1 = conTax.apply(100);
		assertEquals(105,result1);
		System.out.println(result1);
		
	}
	@Test
	void testConsumptionTax2() {
		ConsumptionTax conTax = new ConsumptionTax(5);
		int result2 = conTax.apply(3000);
		assertEquals(3150,result2);
		System.out.println(result2);
		
	}
	@Test
	void testConsumptionTax3() {
		ConsumptionTax conTax = new ConsumptionTax(10);
		int result3 = conTax.apply(50);
		assertEquals(55,result3);
		System.out.println(result3);
		
	}
	@Test
	void testConsumptionTax4() {
		ConsumptionTax conTax = new ConsumptionTax(5);
		int result4 = conTax.apply(50);
		assertEquals(52,result4);
		System.out.println(result4);
		
	}
	@Test
	void testConsumptionTax5() {
		ConsumptionTax conTax = new ConsumptionTax(3);
		int result5 = conTax.apply(50);
		assertEquals(51,result5);
		System.out.println(result5);
		
	}

}
