import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// Lớp Car đại diện cho xe trong trò chơi
class Car {
    private int x;
    private int y;
    private int speed;

    public Car(int x, int y) {
        this.x = x;
        this.y = y;
        this.speed = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void move() {
        y -= speed;
    }
}

// Lớp GamePanel đại diện cho bảng trò chơi
class GamePanel extends JPanel implements KeyListener {
    private Car playerCar;
    private Car[] aiCars;
    private int distance;
    private Timer timer;
    private boolean gameFinished;

    public GamePanel(int numAICars, int distance) {
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);

        playerCar = new Car(400, 500);
        aiCars = new Car[numAICars];
        for (int i = 0; i < numAICars; i++) {
            aiCars[i] = new Car(200 + i * 100, 0);
        }

        this.distance = distance;
        this.gameFinished = false;

        timer = new Timer(10, e -> {
            movePlayerCar();
            moveAICars();
            checkCollision();
            checkWin();
            repaint();
        });
        timer.start();
    }

    private void movePlayerCar() {
        playerCar.move();
    }

    private void moveAICars() {
        for (Car car : aiCars) {
            car.move();
        }
    }

    private void checkCollision() {
        Rectangle playerCarBounds = new Rectangle(playerCar.getX(), playerCar.getY(), 50, 100);
        for (Car car : aiCars) {
            Rectangle aiCarBounds = new Rectangle(car.getX(), car.getY(), 50, 100);
            if (playerCarBounds.intersects(aiCarBounds)) {
                gameFinished = true;
                timer.stop();
                JOptionPane.showMessageDialog(this, "Game Over! You crashed into an AI car.");
                System.exit(0);
            }
        }
    }

    private void checkWin() {
        if (playerCar.getY() <= distance && !gameFinished) {
            gameFinished = true;
            timer.stop();
            JOptionPane.showMessageDialog(this, "Congratulations! You won the race!");
            System.exit(0);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.WHITE);
        g.fillRect(playerCar.getX(), playerCar.getY(), 50, 100);

        g.setColor(Color.RED);
        for (Car car : aiCars) {
            g.fillRect(car.getX(), car.getY(), 50, 100);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_UP) {
            playerCar.setSpeed(playerCar.getSpeed() + 1);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}

// Lớp GameWindow đại diện cho cửa sổ trò chơi
class GameWindow extends JFrame {
    public GameWindow() {
        setTitle("Car Racing Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        GamePanel gamePanel = new GamePanel(3, 5000);
        add(gamePanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

// Ví dụ sử dụng trò chơi Car Racing
public class CarRacingGame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(GameWindow::new);
    }
}