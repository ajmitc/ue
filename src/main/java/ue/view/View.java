package ue.view;

import javax.swing.JFrame;

import ue.Model;

public class View{
    private JFrame frame;
    private Model model;

    public View(Model model){
        this.model = model;
        this.frame = new JFrame();
    }

    public JFrame getFrame(){
        return frame;
    }
}
