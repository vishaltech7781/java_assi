import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    // Declare components
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton addButton, subButton, mulButton, divButton, eqButton, clrButton;
    private JButton squareButton, sqrtButton, cubeButton, percentButton;
    private String operator;
    private double num1, num2, result;

    public Calculator() {
        // Set up the frame
        setTitle("Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the display text field
        textField = new JTextField();
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        // Initialize buttons
        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }

        // Operators and other buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        eqButton = new JButton("=");
        clrButton = new JButton("C");
        squareButton = new JButton("x²");
        sqrtButton = new JButton("√");
        cubeButton = new JButton("x³");
        percentButton = new JButton("%");

        // Add action listeners for operators and special buttons
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        eqButton.addActionListener(this);
        clrButton.addActionListener(this);
        squareButton.addActionListener(this);
        sqrtButton.addActionListener(this);
        cubeButton.addActionListener(this);
        percentButton.addActionListener(this);

        // Layout the buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 10, 10));

        // Add number buttons to the panel
        for (int i = 1; i <= 9; i++) {
            panel.add(numberButtons[i]);
        }
        panel.add(numberButtons[0]);
        panel.add(percentButton);
        panel.add(squareButton);
        panel.add(sqrtButton);
        panel.add(cubeButton);
        panel.add(clrButton);
        panel.add(addButton);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(divButton);
        panel.add(eqButton);

        add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        // If number button is pressed
        if ((command.charAt(0) >= '0' && command.charAt(0) <= '9')) {
            textField.setText(textField.getText() + command);
        }
        // Clear button action
        else if (command.equals("C")) {
            textField.setText("");
            num1 = num2 = result = 0;
            operator = "";
        }
        // Operator button action
        else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
            if (!textField.getText().isEmpty()) {
                num1 = Double.parseDouble(textField.getText());
                operator = command;
                textField.setText("");
            }
        }
        // Equals button action
        else if (command.equals("=")) {
            if (!textField.getText().isEmpty()) {
                num2 = Double.parseDouble(textField.getText());

                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;u
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            textField.setText("Error");
                            return;
                        }
                        break;
                }
                textField.setText(String.valueOf(result));
                num1 = result; // Store result for further operations
            }
        }
        // Square button action
        else if (command.equals("x²")) {
            if (!textField.getText().isEmpty()) {
                double number = Double.parseDouble(textField.getText());
                result = Math.pow(number, 2);
                textField.setText(String.valueOf(result));
            }
        }
        // Square root button action
        else if (command.equals("√")) {
            if (!textField.getText().isEmpty()) {
                double number = Double.parseDouble(textField.getText());
                result = Math.sqrt(number);
                textField.setText(String.valueOf(result));
            }
        }
        // Cube button action
        else if (command.equals("x³")) {
            if (!textField.getText().isEmpty()) {
                double number = Double.parseDouble(textField.getText());
                result = Math.pow(number, 3);
                textField.setText(String.valueOf(result));
            }
        }
        // Percent button action
        else if (command.equals("%")) {
            if (!textField.getText().isEmpty()) {
                double number = Double.parseDouble(textField.getText());
                result = number / 100;
                textField.setText(String.valueOf(result));
            }
        }
    }

    public static void main(String[] args) {
        // Run the calculator in the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
        });
    }
}

