package one;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CheckTwo {
	
	static Utility utility;

//	@BeforeEach
//	void setUp() throws Exception {
//		utility = new Utility();
//	}
	
	@BeforeAll
	static void setUp () throws Exception {
		utility = new Utility();
	}

//	@AfterEach
//	void tearDown() throws Exception {
//		utility = null;
//	}
	
	@AfterAll
	static void tearDown() throws Exception {
		utility = null;
	}

	@Disabled
	@Test
	void oneTest() {
		int[] arr = {10,20,30,40,50};
		assertEquals(true,Utility.findElement(arr, 20));
	}
	
	// comma separated value
	
	@ParameterizedTest
	@CsvSource(value = {"false,121","false,11","true,10","true,20"})
	void twoTest(boolean expVal , int actVal) {
		assertEquals(expVal,utility.isEven(actVal));
	}

}
