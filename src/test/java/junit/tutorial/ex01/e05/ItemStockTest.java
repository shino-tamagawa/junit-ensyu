package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemStockTest {

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
	void testItemStock() {
		Item item = new Item(null, 0);
		ItemStock itemStock = new ItemStock();
		Integer actual = itemStock.getNum(item);
		assertEquals(0, actual);

	}

	@Test
	void testItemStock2() {
		Item item = new Item(null, 0);
		ItemStock itemStock = new ItemStock();
		itemStock.add(item);

		assertEquals(1, itemStock.getNum(item));
		System.out.println(itemStock.getNum(item));
	}

	@Test
	void testItemStock3() {
		Item item = new Item("book", 400);
		ItemStock itemStock = new ItemStock();
		itemStock.add(item);

		assertEquals(1, itemStock.getNum(item));
		System.out.println(itemStock.getNum(item));
	}

	@Test
	void testItemStock4() {
		Item item = new Item("book", 400);
		ItemStock itemStock = new ItemStock();
		itemStock.add(item);
		itemStock.add(item);
		
		assertEquals(2, itemStock.getNum(item));
		System.out.println(itemStock.getNum(item));

	}
	@Test
	void testItemStock5() {
		Item item = new Item("book", 400);
		ItemStock itemStock = new ItemStock();
		itemStock.add(item);
		
		Item item2 = new Item("pen", 300);
		itemStock.add(item2);
		
		assertEquals(1, itemStock.getNum(item));
		System.out.println(itemStock.getNum(item));

	}


}
