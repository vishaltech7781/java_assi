import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterGUI extends JFrame {
    private JTextField textField;
    private int count = 0;

    public CounterGUI() {
        // Set Look and Feel (Optional)
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        setTitle("Counter");
        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Components
        JLabel label = new JLabel("Counter");
        textField = new JTextField("0", 10);
        textField.setEditable(false);

        // Buttons
        JButton countUpBtn = new JButton("Count Up");
        JButton countDownBtn = new JButton("Count Down");
        JButton resetBtn = new JButton("Reset");

        // Action listeners
        countUpBtn.addActionListener(e -> {
            count++;
            textField.setText(String.valueOf(count));
        });
        countDownBtn.addActionListener(e -> {
            count--;
            textField.setText(String.valueOf(count));
        });
        resetBtn.addActionListener(e -> {
            count = 0;
            textField.setText(String.valueOf(count));
        });

        // Panel with GridLayout for better control
        JPanel panel = new JPanel(new GridLayout(1, 5));
        panel.add(label);
        panel.add(textField);
        panel.add(countUpBtn);
        panel.add(countDownBtn);
        panel.add(resetBtn);

        // Add the panel to the frame
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CounterGUI();
    }
}

