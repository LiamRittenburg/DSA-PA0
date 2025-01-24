package test;
import main.Building;
import main.Person;
import main.Floor;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentFloorTest {

	@Test
	void testFloorOccupants() {
		Building building1 = new Building(3);
		Person p1 = new Person("Liam", "Rittenburg");
		p1.enterBuilding(building1, 2);
		building1.startElevator();
		assertEquals((building1.getFloor(2)).getOccupants()[0], p1);
	}

	@Test
	void testEnterFloor()
	{
		Building building2 = new Building(3);
		Person p2 = new Person("Pete", "Arbor");
		p2.enterBuilding(building2, 2);
		Floor floorTest = new Floor(2);
		floorTest.enterFloor(p2);
		assertEquals(p2, floorTest.getOccupants()[0]);
	}

	@Test
	void testResize()
	{
		Person p3 = new Person("Oskar", "Wilder");
		Person p4 = new Person("Benny", "Hunter");
		Person p5 = new Person("Peter", "Doolacker");
		Floor floorTest2 = new Floor(3);
		floorTest2.enterFloor(p3);
		int size1 = (floorTest2.getOccupants()).length;
		floorTest2.enterFloor(p5);
		int size2 = (floorTest2.getOccupants()).length;
		assertEquals(2, size1);
		assertEquals(4, size2);

	}
}


