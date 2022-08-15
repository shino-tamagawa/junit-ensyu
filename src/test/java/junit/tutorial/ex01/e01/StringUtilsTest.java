package junit.tutorial.ex01.e01;



import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class StringUtilsTest {

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
	void testStringUtils() {
		StringUtils str = new StringUtils();
		String actual = str.toSnakeCase("aaa");
		assertEquals("aaa", actual);
		
	}
	
	@Test
	void testStringUtils２() {
		StringUtils str = new StringUtils();
		String actual = str.toSnakeCase("HelloWorld");
		assertEquals("hello_world", actual);
		
	}
	@Test
	void testStringUtils3() {
		StringUtils str = new StringUtils();
		String actual = str.toSnakeCase("practiceJunit");
		assertEquals("practice_junit", actual);
		
	}



}
