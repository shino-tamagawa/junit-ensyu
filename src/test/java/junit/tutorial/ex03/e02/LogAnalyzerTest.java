package junit.tutorial.ex03.e02;

import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.doThrow;

import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
class LogAnalyzerTest {
	@InjectMocks
	private LogAnalyzer la;
//	LogAnalyzer la = new LogAnalyzer();
	
	@Mock
	LogLoader mockLogLoader;

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
	void testAnalyze() throws Exception{
		doThrow(new IOException()).when(mockLogLoader).load("file");
		
		assertThrows(AnalyzeException.class,() -> la.analyze("file"));
		
		

//	・LogLoader の load メソッドが呼び出されたときに IOException を送出したならば、 AnalyzeExeption が送出される

	}

}
