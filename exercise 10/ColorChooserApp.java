package javaapplication38;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooserApp extends JFrame {
    private JTextArea textArea;
    private JRadioButton backgroundRed, backgroundGreen, backgroundBlue;
    private JRadioButton foregroundRed, foregroundGreen, foregroundBlue;

    public ColorChooserApp() {
        setTitle("Color Chooser");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        textArea = new JTextArea(10, 30);
        textArea.setFont(new Font("Arial", Font.PLAIN, 16));
        add(textArea, BorderLayout.CENTER);

        JPanel colorPanel = new JPanel();
        colorPanel.setLayout(new GridLayout(2, 3));

        ButtonGroup backgroundGroup = new ButtonGroup();
        ButtonGroup foregroundGroup = new ButtonGroup();

        backgroundRed = createColorRadioButton("Red", Color.RED, backgroundGroup);
        backgroundGreen = createColorRadioButton("Green", Color.GREEN, backgroundGroup);
        backgroundBlue = createColorRadioButton("Blue", Color.BLUE, backgroundGroup);

        foregroundRed = createColorRadioButton("Red", Color.RED, foregroundGroup);
        foregroundGreen = createColorRadioButton("Green", Color.GREEN, foregroundGroup);
        foregroundBlue = createColorRadioButton("Blue", Color.BLUE, foregroundGroup);

        colorPanel.add(new JLabel("Background Color:"));
        colorPanel.add(backgroundRed);
        colorPanel.add(backgroundGreen);
        colorPanel.add(backgroundBlue);

        colorPanel.add(new JLabel("Foreground Color:"));
        colorPanel.add(foregroundRed);
        colorPanel.add(foregroundGreen);
        colorPanel.add(foregroundBlue);

        add(colorPanel, BorderLayout.SOUTH);

        ActionListener colorChangeListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTextAreaColors();
            }
        };

        backgroundRed.addActionListener(colorChangeListener);
        backgroundGreen.addActionListener(colorChangeListener);
        backgroundBlue.addActionListener(colorChangeListener);
        foregroundRed.addActionListener(colorChangeListener);
        foregroundGreen.addActionListener(colorChangeListener);
        foregroundBlue.addActionListener(colorChangeListener);

        updateTextAreaColors();

        setVisible(true);
    }

    private JRadioButton createColorRadioButton(String text, Color color, ButtonGroup group) {
        JRadioButton radioButton = new JRadioButton(text);
        radioButton.setActionCommand(text);
        radioButton.setBackground(color);
        group.add(radioButton);
        return radioButton;
    }

    private void updateTextAreaColors() {
        Color background = getColorForSelectedRadioButton(backgroundRed, backgroundGreen, backgroundBlue);
        Color foreground = getColorForSelectedRadioButton(foregroundRed, foregroundGreen, foregroundBlue);

        textArea.setBackground(background);
        textArea.setForeground(foreground);
    }

    private Color getColorForSelectedRadioButton(JRadioButton... buttons) {
        for (JRadioButton button : buttons) {
            if (button.isSelected()) {
                return button.getBackground();
            }
        }
        return Color.BLACK; // Default color
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ColorChooserApp());
    }
}
