public class DragonMain02 {
    int x, y, width, height;

    public DragonMain02(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void moveLeft() {
        x--;
        checkCollision();
    }

    public void moveRight() {
        x++;
        checkCollision();
    }

    public void moveUp() {
        y--;
        checkCollision();
    }

    public void moveDown() {
        y++;
        checkCollision();
    }

    public void printPosition() {
        System.out.println("Dragon Position: (" + x + ", " + y + ")");
    }

    public void detectCollision(int newX, int newY) {
        if (newX < 0 || newX > width || newY < 0 || newY > height) {
            System.out.println("Game Over");
        }
    }

    private void checkCollision() {
        detectCollision(x, y);
    }
    public static void main(String[] args) {
        DragonMain02 dragon = new DragonMain02(0,0,10,10);
        dragon.moveRight();
        dragon.printPosition();
        dragon.moveDown();
        dragon.printPosition();
        dragon.moveRight();
        dragon.printPosition();
        dragon.moveUp();
        dragon.printPosition();
    }
}