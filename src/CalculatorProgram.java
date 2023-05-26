// Calculator Program (Számológép Program)


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorProgram {
    private JFrame frame;
    private JTextField num1Field;
    private JTextField num2Field;
    private JLabel resultLabel;

    public CalculatorProgram() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a panel to hold the components (Hozzon létre egy panelt az összetevők tárolására)
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        // Create labels, text fields, and a button (Címkék, szövegmezők és egy gomb létrehozása)
        JLabel num1Label = new JLabel("Number 1:");
        num1Field = new JTextField(10);

        JLabel num2Label = new JLabel("Number 2:");
        num2Field = new JTextField(10);

        JLabel resultTitleLabel = new JLabel("Result:");
        resultLabel = new JLabel();

        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform addition (Végezze el a kiegészítést)
                try { 
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double result = num1 + num2;
                    resultLabel.setText(Double.toString(result));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input");
                }
            }
        });

        // Add components to the panel (Összetevők hozzáadása a panelhez)
        panel.add(num1Label);
        panel.add(num1Field);
        panel.add(num2Label);
        panel.add(num2Field);
        panel.add(resultTitleLabel);
        panel.add(resultLabel);
        panel.add(addButton);

        // Add the panel to the frame (/ Adja hozzá a panelt a kerethez)
        frame.getContentPane().add(panel);

        // Set the size and make the frame visible (Állítsa be a méretet, és tegye láthatóvá a keretet)
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

}

