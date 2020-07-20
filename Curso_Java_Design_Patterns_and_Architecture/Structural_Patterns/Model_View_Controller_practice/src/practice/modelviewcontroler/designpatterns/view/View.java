package practice.modelviewcontroler.designpatterns.view;

import javax.swing.JFrame;
import java.awt.*;
import practice.modelviewcontroler.designpatterns.model.Model;

public class View  extends JFrame {
    private Model model;

    public View(Model model) throws HeadlessException {
        super("MVC Demo");
        this.model = model;
    }

}
