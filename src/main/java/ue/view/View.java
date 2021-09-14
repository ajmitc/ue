package ue.view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ue.Model;

public class View{
    private static final String CARD_WILDERNESS = "wilderness";
    private static final String CARD_WORKSHOP   = "workshop";

    private JFrame frame;
    private Model model;

    private JButton btnWilderness;
    private JButton btnWorkshop;

    private WildernessPanel wildernessPanel;
    private JPanel centerPanel;

    public View(Model model){
        this.model = model;
        this.frame = new JFrame();

        wildernessPanel = new WildernessPanel(model, this);

        centerPanel = new JPanel();
        centerPanel.setLayout(new CardLayout());
        centerPanel.add(wildernessPanel, CARD_WILDERNESS);

        btnWilderness = new JButton("Wilderness")
        btnWorkshop   = new JButton("Workshop")

        JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        northPanel.add(btnWilderness);
        northPanel.add(btnWorkshop);

        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(northPanel,  BorderLayout.NORTH);
        frame.getContentPane().add(centerPanel, BorderLayout.CENTER);
    }

    public JFrame getFrame(){
        return frame;
    }

    public JButton getBtnWilderness(){return btnWilderness;}
    public JButton getBtnWorkshop(){return btnWorkshop;}

    private void showCard(String name){
        CardLayout cardLayout = (CardLayout) centerPanel.getLayout();
        cardLayout.show(name, centerPanel);
    }

    public void showWilderness(){
        showCard(CARD_WILDERNESS);
    }

    public void showWorkshop(){
        showCard(CARD_WORKSHOP);
    }
}
