package practice.modelviewcontroler.designpatterns.controller;

import practice.modelviewcontroler.designpatterns.model.Model;
import practice.modelviewcontroler.designpatterns.view.LoginFormEvent;
import practice.modelviewcontroler.designpatterns.view.LoginListener;
import practice.modelviewcontroler.designpatterns.view.View;

public class Controller implements LoginListener {
    private View view;
    private Model model;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    @Override
    public void loginPerformed(LoginFormEvent event) {
        System.out.println("Login Event Received: "+event.getName()+"; "+event.getPassword());
    }
}
