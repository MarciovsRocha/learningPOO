package practice.modelviewcontroler.designpatterns.controller;

import practice.modelviewcontroler.designpatterns.model.Model;
import practice.modelviewcontroler.designpatterns.view.View;

public class Controller {
    private View view;
    private Model model;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

}
