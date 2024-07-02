package testsForMultiPurposeList;

import multiPurposeList.MultiPurposeList;
import multiPurposeList.Node;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

public class CustomTests {

	private static MultiPurposeList<String> strings = new MultiPurposeList();

	@BeforeEach
	public void init(){
		String firstS = "first String";
		String secondS = "second String";
		String thirdS = "third String";
		String fourthS = "fourth String";
		String fifthS = "fifth String";
		String sixthS = "sixth String";
		String seventhS = "seventh String";

		strings.putNo(0, firstS);
		strings.putNo(1, secondS);
		strings.putNo(2, thirdS);
		strings.putNo(3, fourthS);
		strings.putNo(4, fifthS);
		strings.putNo(5, sixthS);
		strings.putNo(6, seventhS);
	}



	@Test
	public void remove() {
		strings.remove("fourth String");
		for (int i = 0; i < strings.getSize(); i++) {
			assertNotEquals("fourth String", strings.getNo(i));
		}
	}

	@Test
	public void contains() {
		strings.remove("fourth String");
		assertFalse(strings.contains("fourth String"));
		assertTrue(strings.contains("fifth String"));
	}

	@Test
	public void removeNo() {
		strings.removeNo(6);
		assertFalse(strings.contains("seventh String"));
	}

	@Test
	public void putNo() {		
		strings.remove("fourth String");
		strings.putNo(3, "new fourth String");
		strings.setNo(0, "new first String");
		strings.putNo(7, "eighth String");
		
		assertEquals(strings.getNo(0), "new first String");
		assertEquals(strings.getNo(3), "new fourth String");
		assertEquals(strings.getNo(4), "fifth String");
		assertEquals(strings.getNo(5), "sixth String");
		assertEquals(strings.getNo(6), "seventh String");
		assertEquals(strings.getNo(7), "eighth String");
	}
	
	@Test
	public void extractNo() {
		assertEquals(strings.extractNo(0), "first String");
		assertEquals(strings.extractNo(4), "sixth String");
		assertFalse(strings.contains("first String"));
		
		assertEquals(strings.getNo(0), "second String");
		assertEquals(strings.getNo(1), "third String");
		assertEquals(strings.getNo(2), "fourth String");
		assertEquals(strings.getNo(3), "fifth String");
		
		assertNotEquals(strings.getNo(4), "sixth String");
		
		assertEquals(strings.getNo(4), "seventh String");
	}
	
	@AfterEach
	public void clear() {
		strings.clear();
	}
}