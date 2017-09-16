package student_reg;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {
	
	public Student classToTest = new Student("John", "02/11/1995", "100A", 21);
	private static final String expected = "John21";
	
	@Test
	public void testGetUsername() {
		String username = classToTest.getUsername();
		assertEquals(username, expected);
	}
}
