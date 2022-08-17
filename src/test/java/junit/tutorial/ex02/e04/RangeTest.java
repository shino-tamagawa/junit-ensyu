package junit.tutorial.ex02.e04;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RangeTest {

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

//	@Test
//	void testRange1() {
//		Range range = new Range(0.0,10.5);
//		boolean result1 = range.contains(-0.1);
//		assertEquals(false,result1);
//		System.out.println(result1);
//	}
//	@Test
//	void testRange2() {
//		Range range = new Range(0.0,10.5);
//		boolean result2 = range.contains(0.0);
//		assertEquals(true,result2);
//		System.out.println(result2);
//	}
//	@Test
//	void testRange3() {
//		Range range = new Range(0.0,10.5);
//		boolean result3 = range.contains(10.5);
//		assertEquals(true,result3);
//		System.out.println(result3);
//	}
//	@Test
//	void testRange4() {
//		Range range = new Range(0.0,10.5);
//		boolean result4 = range.contains(10.6);
//		assertEquals(false,result4);
//		System.out.println(result4);
//	}
//	@Test
//	void testRange5() {
//		Range range = new Range(-5.1,5.1);
//		boolean result5 = range.contains(-5.2);
//		assertEquals(false,result5);
//		System.out.println(result5);
//	}
//	@Test
//	void testRange6() {
//		Range range = new Range(-5.1,5.1);
//		boolean result6 = range.contains(-5.1);
//		assertEquals(true,result6);
//		System.out.println(result6);
//	}
//	@Test
//	void testRange7() {
//		Range range = new Range(-5.1,5.1);
//		boolean result7 = range.contains(5.1);
//		assertEquals(true,result7);
//		System.out.println(result7);
//	}
//	@Test
//	void testRange8() {
//		Range range = new Range(-5.1,5.1);
//		boolean result8 = range.contains(5.2);
//		assertEquals(false,result8);
//		System.out.println(result8);
//	}
	@Nested
	class Range1 {

		@ParameterizedTest
		@ValueSource(doubles = { 0.0, 10.5 })
		void testContains1(double t) {
			Range range = new Range(0.0, 10.5);
			boolean result = range.contains(t);
			assertTrue(result);
		}
		@ParameterizedTest
		@ValueSource(doubles = { -0.1, 10.6 })
		void testContains2(double f) {
			Range range = new Range(0.0, 10.5);
			boolean result2 = range.contains(f);
			assertFalse(result2);
		}
		
	}
	@DisplayName("境界値のテスト")
	@Nested
	class Range2 {
		
		@ParameterizedTest
		@ValueSource(doubles = {-5.1,5.1})
		void testContains3(double t) {
			Range range = new Range(-5.1,5.1);
			boolean result3 = range.contains(t);
			assertTrue(result3);
		}
		@ParameterizedTest
		@ValueSource(doubles = {-5.2,5.2})
		void testContains4(double f) {
			Range range = new Range(-5.1,5.1);
			boolean result4 = range.contains(f);
			assertFalse(result4);
		}
	}
	
}
