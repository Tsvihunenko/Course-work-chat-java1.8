package gui;

import javax.swing.*;

public class Chatform extends JDialog {
    private JPanel contentPane;
    private JTextArea textArea1;
    private JButton sendbutton;
    private JTextField message;
    private JTextArea txtarea;


    public Chatform() {
        setContentPane(contentPane);
        setModal(true);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
