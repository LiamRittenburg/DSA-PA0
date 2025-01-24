package test;
import main.Building;
import main.Person;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentPersonTest {

	Building b1 = new Building(5);
	Person p1 = new Person("Liam", "Rittenburg");
	Person p2 = new Person("Bad", "Floor");
	boolean r = p1.enterBuilding(b1, 3);

	@Test
	void testEnterBuilding() {
		assertTrue(r);
		assertFalse(p2.enterBuilding(b1, 10));
	}

	@Test
	void testGetLocation()
	{
		assertEquals("In Lobby", p2.getLocation());
		assertEquals("Waiting to be serviced", p1.getLocation());
		b1.startElevator();
		assertEquals("In Floor 3", p1.getLocation());
	}

	@Test
	void testToString()
	{
		assertEquals("Liam Rittenburg", p1.toString());
	}
}
