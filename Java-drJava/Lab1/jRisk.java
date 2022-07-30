import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;

public class jRisk extends JFrame {


    private JFrame mainMap;
    private Polygon poly;

    public jRisk(){

        initComponents();

    }

    private void initComponents(){

        mainMap = new JFrame();
        mainMap.setSize(800, 600);
        mainMap.setResizable(false);

        mainMap.setVisible(true);
        mainMap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int xPoly[] = {150,250,325,375,450,275,100};
        int yPoly[] = {150,100,125,225,250,375,300};

        poly = new Polygon(xPoly, yPoly, xPoly.length);

    }

    protected void paintComponent(Graphics g){

        super.paintComponents(g);

        g.setColor(Color.BLUE);
        g.drawPolygon(poly);

    }   

    /**
     * @param args
     */
    public static void main(String[] args) {

        new jRisk();

    }
}