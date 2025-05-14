import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GenderSelectionGUI extends JFrame {
    private JRadioButton maleButton, femaleButton, otherButton;
    private JButton submitButton;
    private JLabel resultLabel;

    public GenderSelectionGUI() {
        setTitle("Gender Selection");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel promptLabel = new JLabel("Select Gender:");
        promptLabel.setBounds(20, 20, 100, 25);
        add(promptLabel);

        maleButton = new JRadioButton("Male");
        maleButton.setBounds(30, 50, 80, 25);
        add(maleButton);

        femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(110, 50, 80, 25);
        add(femaleButton);

        otherButton = new JRadioButton("Other");
        otherButton.setBounds(190, 50, 80, 25);
        add(otherButton);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        genderGroup.add(otherButton);

        submitButton = new JButton("Submit");
        submitButton.setBounds(90, 90, 100, 30);
        add(submitButton);

        resultLabel = new JLabel("Selected: ");
        resultLabel.setBounds(20, 130, 250, 25);
        add(resultLabel);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (maleButton.isSelected()) {
                    resultLabel.setText("Selected: Male");
                } else if (femaleButton.isSelected()) {
                    resultLabel.setText("Selected: Female");
                } else if (otherButton.isSelected()) {
                    resultLabel.setText("Selected: Other");
                } else {
                    resultLabel.setText("Please select a gender.");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GenderSelectionGUI frame = new GenderSelectionGUI();
            frame.setVisible(true);
        });
    }
}

