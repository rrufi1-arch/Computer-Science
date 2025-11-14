public class Robot {

    private int[] hallway;
    private int position; // the first spot == 0
    private boolean isFacingRight;

    public Robot(int[] hallwayToClean, int startingPosition) {
        this.hallway = hallwayToClean;
        this.position = startingPosition;
        this.isFacingRight = true;
    }

    public int[] getHallway() {
        return hallway;
    }

    public void setHallway(int[] hallway) {
        this.hallway = hallway;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isFacingRight() {
        return isFacingRight;
    }

    public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }

    public boolean isRobotBlockedByWall() {
        if (isFacingRight && position == hallway.length - 1 ||
            isFacingRight == false && position == 0) {
            return true;
        }
        return false;
    }

    public void move() {
        if (hallway[position] > 0) {
            hallway[position] -= 1;
            if (hallway[position] == 0) {
                if (!isRobotBlockedByWall()) {
                    if (isFacingRight) {
                        position += 1;
                    } else {
                        position -= 1;
                    }
                } else {
                    if (isFacingRight) {
                        isFacingRight = false;
                    } else {
                        isFacingRight = true;
                    }
                }
            }
        } else {
            if (!isRobotBlockedByWall()) {
                if (isFacingRight) {
                    position += 1;
                } else {
                    position -= 1;
                }
            } else {
                if (isFacingRight) {
                    isFacingRight = false;
                } else {
                    isFacingRight = true;
                }
            }
        }
    }

    public int clearHall() {
        int count = 0;
        while (!hallIsClear()) {
            move();
            displayState();
            count += 1;
        }
        return count;
    }

    public boolean hallIsClear() {
        boolean allZero = true;
        for (int i = 0; i < hallway.length - 1; i++) {
            if (hallway[i] != 0) {
                allZero = false;
            }
        }
        return allZero;
    }

    public void displayState() {
        String hallwayValues = "";
        String location = "";
        for (int i = 0; i < hallway.length; i++) {
            hallwayValues += String.valueOf(hallway[i]);
            if (i != hallway.length - 1) { // so there is no space after the last number
                hallwayValues += " ";
            }
            if (i == position) {
                for (int j = 0; j < i * 2; j++) {
                    location += " ";
                }
                if (isFacingRight) {
                    location += ">";
                } else {
                    location += "<";
                }
            }
        }
        System.out.println(hallwayValues);
        System.out.println(location);
    }
}
