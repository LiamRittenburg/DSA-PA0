package test;

import main.Job;
import main.Person;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentJobTest {

	Person lr = new Person("Liam", "Rittenburg");
	Job j1 = new Job(lr, 3);

	@Test
	void testFloor() {
		assertEquals(3, j1.getJobFloor());
	}

	@Test
	void testToString()
	{
		assertEquals("Liam Rittenburg requests floor 3", j1.toString());
	}

}
