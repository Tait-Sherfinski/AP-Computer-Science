package Q3.Prog52aForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prog52aForm {
    private JTextField textField1;
    private JTextField textField2;
    private JButton showButton;
    private JButton clearButton;
    private JLabel len;
    private JLabel wid;
    private JLabel area;
    private JLabel perim;
    private JLabel out1;
    private JLabel out2;
    private JPanel mainPanel;

    public Prog52aForm() {
        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int len = Integer.parseInt(textField1.getText());
                int wid = Integer.parseInt(textField2.getText());

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                out1.setText("");
                out2.setText("");
                textField1.setText("");
                textField2.setText("");
            }
        });
    }
}
