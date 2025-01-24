package test;
import main.Building;
import main.Person;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentBuildingTest {

	@Test
	void testNumFloors() {
		Building test1 = new Building(5);
		assertEquals(6, test1.getNumFloors());
	}

	@Test
	void testRequest()
	{
		Building test2 = new Building(3);
		Person p1 = new Person("Liam", "Rittenburg");
		Person p2 = new Person("Richard", "Ell");
		assertEquals(false, test2.enterElevatorRequest(p1, 4));
		assertEquals(true, test2.enterElevatorRequest(p2, 3));
	}

	
}
