public class Robot {

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    int x;
    int y;
    Direction d;

    Robot () {
        this(0,0);
    }

    Robot (int x, int y) {
        this(x,y, Direction.UP);
    }

    Robot (int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.d = direction;
    }


    public Direction getDirection() {
        return this.d;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void turnLeft() {
        switch (this.d) {
            case UP:
                this.d = Direction.LEFT;
                break;
            case LEFT:
                this.d = Direction.DOWN;
                break;
            case DOWN:
                this.d = Direction.RIGHT;
                break;
            case RIGHT:
                this.d = Direction.UP;
                break;
        }
    }

    public void turnRight() {
        switch (this.d) {
            case UP:
                this.d = Direction.RIGHT;
                break;
            case RIGHT:
                this.d = Direction.DOWN;
                break;
            case DOWN:
                this.d = Direction.LEFT;
                break;
            case LEFT:
                this.d = Direction.UP;
                break;
        }
    }

    public void stepForward() {
        switch (this.d) {
            case UP:
                this.y++;
                break;
            case LEFT:
                this.x--;
                break;
            case DOWN:
                this.y--;
                break;
            case RIGHT:
                this.x++;
                break;
        }
    }
}