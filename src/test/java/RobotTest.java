import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {
    Robot robot1 = new Robot("D2R2");
    Robot robot2 = new Robot("Data");

    @org.junit.jupiter.api.Test
    void fire() {
    }

    @org.junit.jupiter.api.Test
    void isDead() {
    }

    @org.junit.jupiter.api.Test
    void getRobotName() {
        Robot robot = new Robot("D2R2");
        assertEquals("Robot D2R2", robot.getRobotName());
    }
}