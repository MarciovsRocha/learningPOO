package practice.modelviewcontroler.designpatterns.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import practice.modelviewcontroler.designpatterns.controller.Controller;
import practice.modelviewcontroler.designpatterns.model.Model;

public class View extends JFrame implements ActionListener {
    private Model model;
    private JButton okButton;
    private JTextField nameField;
    private JPasswordField passwordField;

    private LoginListener loginListener;

    public View(Model model) throws HeadlessException {
        super("MVC Demo");
        this.model = model;

        okButton = new JButton("Send");
        nameField = new JTextField(10);
        passwordField = new JPasswordField(10);

        setLayout(new GridBagLayout());

        // create a grid layout
        GridBagConstraints gc = new GridBagConstraints();
        // creating the Name lable
        gc.anchor = GridBagConstraints.LAST_LINE_END;
        gc.gridx = 1;
        gc.gridy = 1;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.insets = new Insets(100,0,0,10);
        gc.fill = GridBagConstraints.NONE;

        add(new JLabel("Name: "), gc);

        gc.anchor = GridBagConstraints.LAST_LINE_START;
        gc.gridx = 2;
        gc.gridy = 1;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.insets = new Insets(100,0,0,10);
        gc.fill = GridBagConstraints.NONE;

        add(nameField, gc);

        gc.anchor = GridBagConstraints.LINE_END;
        gc.gridx = 1;
        gc.gridy = 2;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.insets = new Insets(0,0,0,10);
        gc.fill = GridBagConstraints.NONE;

        add(new JLabel("Password: "),gc);

        gc.anchor = GridBagConstraints.LINE_START;
        gc.gridx = 2;
        gc.gridy =2;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;

        add(passwordField, gc);

        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.gridx = 2;
        gc.gridy = 3;
        gc.weightx = 1;
        gc.weighty = 100;
        gc.fill = GridBagConstraints.NONE;

        add(okButton,gc);

        okButton.addActionListener(this);

        setSize(600,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    } // public View(Model model)

    @Override
    public void actionPerformed(ActionEvent e) {
        String password = new String(passwordField.getPassword());
        String name = new String(nameField.getText());
        fireLoginEvent(new LoginFormEvent(name, password));
    } //  public void actionPerformed

    public void setLoginListener(LoginListener loginListener) {
        this.loginListener = loginListener;
    } // public void setLoginListener

    public void fireLoginEvent(LoginFormEvent event){
        if (loginListener != null){
            loginListener.loginPerformed(event);
        }
    }

} // public class View
