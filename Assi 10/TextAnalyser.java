import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextAnalyzer extends JFrame {
    private JTextArea textArea;
    private JLabel countLabel;

    public TextAnalyzer() {
        setTitle("Real-Time Text Analyzer");
        setSize(400, 300);   
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Create text area
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        
        // Create label to show counts
        countLabel = new JLabel("Characters: 0 | Words: 0");
        
        // Add the text area and count label to the layout
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(countLabel, BorderLayout.SOUTH);

        // KeyListener to update the counts when the user types
        textArea.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                String text = textArea.getText();

                // Count characters including spaces
                int charCount = text.length();
                
                // Count words by splitting on one or more whitespace characters
                int wordCount = text.trim().isEmpty() ? 0 : text.trim().split("\\s+").length;
                
                // Update the label with the new counts
                countLabel.setText("Characters: " + charCount + " | Words: " + wordCount);
            }
        });

        // Make the window visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextAnalyzer();
    }
}

