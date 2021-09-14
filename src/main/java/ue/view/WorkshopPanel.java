package ue.view;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;

public class WorkshopPanel extends JPanel{
    private static final String IMAGE_FILENAME = "adventureSheetArtifactWorkshop.png";

    public WildernessPanel(){
        super();
        setPreferredSize(new Dimension(904, 1275));
    }

    @Override
    public void paintComponent(Graphics graphics){
        graphics.drawImage(ImageUtil.get(IMAGE_FILENAME));
    }
}
