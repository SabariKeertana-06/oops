package javaapplication37;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SnowmanMover extends JFrame {
    private JPanel snowmanPanel;
    private int snowmanX = 200;  // Initial X position
    private int snowmanY = 200;  // Initial Y position

    public SnowmanMover() {
        setTitle("Snowman Mover");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the snowman panel
        snowmanPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawSnowman(g);
            }
        };
        add(snowmanPanel, BorderLayout.CENTER);

        // Create buttons for movement
        JButton leftButton = new JButton("Left");
        JButton rightButton = new JButton("Right");
        JButton upButton = new JButton("Up");
        JButton downButton = new JButton("Down");

        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                snowmanX -= 10;
                snowmanPanel.repaint();
            }
        });

        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                snowmanX += 10;
                snowmanPanel.repaint();
            }
        });

        upButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                snowmanY -= 10;
                snowmanPanel.repaint();
            }
        });

        downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                snowmanY += 10;
                snowmanPanel.repaint();
            }
        });

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(leftButton);
        buttonPanel.add(rightButton);
        buttonPanel.add(upButton);
        buttonPanel.add(downButton);

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void drawSnowman(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(snowmanX, snowmanY, 80, 80);  // Head
        g.fillOval(snowmanX + 10, snowmanY + 80, 60, 60);  // Body
        g.fillOval(snowmanX + 25, snowmanY + 140, 30, 30);  // Bottom

        g.setColor(Color.BLACK);
        g.fillOval(snowmanX + 30, snowmanY + 20, 10, 10);  // Left eye
        g.fillOval(snowmanX + 50, snowmanY + 20, 10, 10);  // Right eye
        g.drawArc(snowmanX + 30, snowmanY + 40, 30, 20, 180, 180);  // Smile

        g.setColor(Color.ORANGE);
        g.fillOval(snowmanX + 40, snowmanY + 60, 10, 10);  // Nose
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SnowmanMover());
    }
}

