package practice.modelviewcontroler.designpatterns;

import practice.modelviewcontroler.designpatterns.controller.Controller;
import practice.modelviewcontroler.designpatterns.model.Model;
import practice.modelviewcontroler.designpatterns.view.View;

import javax.swing.SwingUtilities;

public class Application {

    public static  void main(String[] args){

        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                runApp();
            }

        });
    }// public static void main

    public static void runApp(){
        Model model = new Model();
        View view = new View(model);

        Controller controller = new Controller(model,view);

    } // public static void runApp

} // public class Application
