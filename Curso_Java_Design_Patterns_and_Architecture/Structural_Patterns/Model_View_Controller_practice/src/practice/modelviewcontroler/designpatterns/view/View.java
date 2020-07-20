package practice.modelviewcontroler.designpatterns.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import practice.modelviewcontroler.designpatterns.model.Model;

public class View extends JFrame implements ActionListener {
    private Model model;
    private JButton helloButton;
    private  JButton goodbyeButton;

    public View(Model model) throws HeadlessException {
        super("MVC Demo");
        this.model = model;

        helloButton = new JButton("CLick Me!");
        goodbyeButton = new JButton("GoodBye");

        setLayout(new GridBagLayout());

        // create a grid layout
        GridBagConstraints gc = new GridBagConstraints();

        //set position of helloButton on the grid layout
        gc.anchor = GridBagConstraints.CENTER;
        gc.gridx = 1;
        gc.gridy = 1;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;
        add(helloButton, gc); // add the helloButton on grid

        // set the position of goodbyeButton on the grid layout
        gc.anchor = GridBagConstraints.CENTER;
        gc.gridx = 1;
        gc.gridy = 2;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;
        add(goodbyeButton, gc); // ad the goodbyeButton on grid

        helloButton.addActionListener(this); // add a listener method to the helloButton
        goodbyeButton.addActionListener(this); // add a listener method to the goodbyeButton
        // create an anonymous method listener to goodbyeButton
        goodbyeButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Sorry to see u go");
            } // public void actionPerformed
        }); //  goodbyeButton.addActionListener

        setSize(600,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    } // public View(Model model)

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        if (source == helloButton){
            System.out.println("Hello there!");
        } // if (source == helloButton)
        else{
            System.out.println("Some Otter Button");
        }// else
    } //  public void actionPerformed
} // public class View
