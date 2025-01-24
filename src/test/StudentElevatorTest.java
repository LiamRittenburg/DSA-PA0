package test;
import main.Elevator;
import main.Floor;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentElevatorTest {

	@Test
	void testElevatorConstructor() {
		Floor[] floors = new Floor[4];
		Elevator test1 = new Elevator(4, floors);
		assertEquals(0, test1.getCurrentFloor());
	}
}
