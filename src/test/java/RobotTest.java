import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {
    Robot robot1 = new Robot("D2R2");
    Robot robot2 = new Robot("Data");

    @org.junit.jupiter.api.Test
    void fire() {
        robot1.fire(robot2);
        assertEquals(8, robot2.getLifePoints());
    }
 //test sur la mort du robot
    @org.junit.jupiter.api.Test
    void TestIsDead() {
        robot1.fire(robot2);
        robot1.fire(robot2);
        robot1.fire(robot2);
        robot1.fire(robot2);
        robot1.fire(robot2);
        
        assertFalse(robot1.TestIsDead());
        assertTrue(robot2.TestIsDead());
    }

    @org.junit.jupiter.api.Test
    void getRobotName() {
        Robot robot = new Robot("D2R2");
        assertEquals("Robot D2R2", robot.getRobotName());
    }
}