import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageSelector extends JFrame {
    private JComboBox<String> imageComboBox;
    private JLabel imageLabel;
    private String[] imageNames = {"cat.jpg", "dog.jpg", "bird.jpg"};

    public ImageSelector() {
        setTitle("Image Viewer");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        imageComboBox = new JComboBox<>(imageNames);
        imageLabel = new JLabel("", SwingConstants.CENTER);

        add(imageComboBox, BorderLayout.NORTH);
        add(imageLabel, BorderLayout.CENTER);

        // Adding listener to JComboBox
        imageComboBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String selectedImage = (String) imageComboBox.getSelectedItem();
                    
                    // Ensure the path to images is correct (add directory if necessary)
                    ImageIcon icon = new ImageIcon(selectedImage);  // Ensure this path is correct
                    if (icon.getIconWidth() == -1) {
                        JOptionPane.showMessageDialog(null, "Image not found: " + selectedImage);
                    } else {
                        // Resize the image to fit in the label
                        Image scaledImage = icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
                        imageLabel.setIcon(new ImageIcon(scaledImage));
                    }
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new ImageSelector();
    }
}

