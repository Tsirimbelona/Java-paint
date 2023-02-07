package paint.java_avancee;

import java.awt.Color;
import java.awt.geom.Line2D;
import java.util.ArrayList;

public class BaseDeLine extends Formes{
    ArrayList<Line2D> formeLigne = new ArrayList<>();

   public BaseDeLine(double x, double y, int taille, Color countourColor, Color insideColor,int reforme) {
        super(x, y, taille, countourColor, insideColor, reforme,true,false);
        AddPoint(x , y);
    }
    
    public void AddPoint(double X, double Y){
        formeLigne.add(new Line2D.Double(x, y, X, Y));
        x = X;
        y = Y;
    }

    public ArrayList<Line2D> getMikajTsipika() {
        return formeLigne;
    }

    void setPaint(Color couleurBackground) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
