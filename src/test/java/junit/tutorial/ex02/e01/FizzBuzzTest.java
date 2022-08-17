package junit.tutorial.ex02.e01;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

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
	
	@DisplayName("リストのアサーション")
	@Test
	void testFizzBuzz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		List<String> resultList = fizzBuzz.createFizzBuzzList(16);
		
		String str = "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16";		
		List<String> expectedList = new ArrayList<>();
		expectedList.add("1");
		expectedList.add("2");
		expectedList.add("Fizz");
		expectedList.add("4");
		expectedList.add("Buzz");
		expectedList.add("Fizz");
		expectedList.add("7");
		expectedList.add("8");
		expectedList.add("Fizz");
		expectedList.add("Buzz");
		expectedList.add("11");
		expectedList.add("Fizz");
		expectedList.add("13");
		expectedList.add("14");
		expectedList.add("FizzBuzz");
		expectedList.add("16");
		
		assertIterableEquals(expectedList,resultList);
		System.out.println(resultList);
		
//		assertEquals("1", result.get(0));
//		assertEquals("2", result.get(1));
//		assertEquals("Fizz", result.get(2));
//		assertEquals("4", result.get(3));
//		assertEquals("Buzz", result.get(0));
//		assertEquals("1", result.get(0));
//		assertEquals("1", result.get(0));
//		assertEquals("1", result.get(0));
//		assertEquals("1", result.get(0));
//		assertEquals("1", result.get(0));
//		assertEquals("1", result.get(0));
		
		
			}
}