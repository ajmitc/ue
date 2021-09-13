package ue;

import ue.view.View;

import javax.swing.SwingUtilities;

public class Main{
    public static void main(String ... args){
        Model model = new Model();
        View view = new View(model);
        new Controller(model, view);

        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                view.getFrame().setVisible(true);
            }
        });
    }
}
