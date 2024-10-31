public class Dragon21 {
    int x, y, width, height;

    public Dragon21 (int x, int y, int wid, int hei) {
        this.x = x;
        this.y = y;
        width = wid;
        height = hei;
    }

    void moveLeft() {
        x -= 1;
        if (x<0 || x>width) {
            detectCollision(x, y);
        }
    }
    void moveRight() {
        x += 1;
        if (x<0 || x>width) {
            detectCollision(x, y);
        }
    }

    void moveUp() {
        y -= 1;
        if (x<0 || x>width) {
            detectCollision(x, y);
        }
    }

    void moveDown() {
        y += 1;
        if (x<0 || x>width) {
            detectCollision(x, y);
        }
    }

    void printPosition() {
        System.out.printf("Anda berada di x: " + x, "y: " + y);
    }

    void detectCollision(int x, int y) {
        System.out.println("Game Over");
    }
}
