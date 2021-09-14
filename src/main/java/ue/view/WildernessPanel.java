package ue.view;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class WildernessPanel extends JLayeredPane{
    private static final String IMAGE_FILENAME = "adventureSheetWilderness.png";

    private static final List<Point> SILVER_STORE_COORDS = new ArrayList<>();
    private static final List<Point> LEAD_STORE_COORDS = new ArrayList<>();
    private static final List<Point> WAX_STORE_COORDS = new ArrayList<>();
    private static final List<Point> GUM_STORE_COORDS = new ArrayList<>();
    private static final List<Point> QUARTZ_STORE_COORDS = new ArrayList<>();
    private static final List<Point> SILICA_STORE_COORDS = new ArrayList<>();

    private static final int COMPONENT_STORE_WIDTH  = 30;
    private static final int COMPONENT_STORE_HEIGHT = 30;

    static {
        SILVER_STORE_COORDS.add(new Point(0, 0));
        SILVER_STORE_COORDS.add(new Point(0, 0));
        SILVER_STORE_COORDS.add(new Point(0, 0));
        SILVER_STORE_COORDS.add(new Point(0, 0));
    }

    private Model model;
    private View view;

    private int mx, my;

    public WildernessPanel(Model model, View view){
        super();
        this.model = model;
        this.view = view;

        setPreferredSize(new Dimension(1275, 1650));

        add(new BackgroundPanel(), 0);
        add(new OverlayPanel(), 1);
    }

    public static class BackgroundPanel extends JPanel{
        public BackgroundPanel(){
            super();
            setPreferredSize(new Dimension(1275, 1650));
        }

        @Override
        public void paintComponent(Graphics graphics){
            graphics.drawImage(ImageUtil.get(IMAGE_FILENAME));
        }
    }

    public static class OverlayPanel extends JPanel{
        public OverlayPanel(){
            super();
            setPreferredSize(new Dimension(1275, 1650));
            // Make this an absolute panel
            setLayout(null);

            addMouseMotionListener(new MouseMotionListener(){
                @Override
                public void mouseMoved(MouseEvent e){
                    mx = e.getX();
                    my = e.getY();
                }

                @Override
                public void mouseDragged(MouseEvent e){

                }
            });
        }

        @Override
        public void paintComponent(Graphics graphics){
            Graphics2D g = (Graphics2D) graphics;
            drawStores(g);

            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 20, 20);
            g.setColor(Color.BLACK);
            g.drawString(mx + ", " + my, 20, 20);
        }

        private void drawStores(Graphics2D g){
            int storedSilver = model.getGame().getComponentStore(Component.SILVER);
            for (int i = 0; i < storedSilver; ++i){
                Point p = SILVER_STORE_COORDS.get(i);
                drawX(p.x, p.y, COMPONENT_STORE_WIDTH, COMPONENT_STORE_HEIGHT);
            }
        }
    }

    private void drawX(Graphics2D g, int x, int y, int width, int height){
        g.drawLine(x, y, x + width, y + height);
        g.drawLine(x + width, y, x, y + height);
    }
}
