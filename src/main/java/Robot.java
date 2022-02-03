public class Robot {
    private String robotName;
    private int lifePoints;

    public Robot(String robotName) {
        this.robotName = "Robot "+ robotName;
        this.lifePoints = 10;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public String getRobotName() {
        return robotName;
    }

    public void setRobotName(String robotName) {
        this.robotName = robotName;
    }

    public void fire(Robot robot) {
    }
}
