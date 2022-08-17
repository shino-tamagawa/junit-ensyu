package junit.tutorial.ex03.e01;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MonthlyCalendarTest {

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
	void testGetRemainingDays1() {
		LocalDate date1 = LocalDate.of(2012, 1, 31);
		MonthlyCalendar manthCalendar = new MonthlyCalendar(date1);
		int result1 = manthCalendar.getRemainingDays();
		System.out.println(result1);
	}
	@Test
	void testGetRemainingDays2() {
		LocalDate date2 = LocalDate.of(2012, 1, 30);
		MonthlyCalendar manthCalendar = new MonthlyCalendar(date2);
		int result2 = manthCalendar.getRemainingDays();
		System.out.println(result2);
	}
	@Test
	void testGetRemainingDays3() {
		LocalDate date3 = LocalDate.of(2012, 2, 1);
		MonthlyCalendar manthCalendar = new MonthlyCalendar(date3);
		int result3 = manthCalendar.getRemainingDays();
		System.out.println(result3);
	}


}
