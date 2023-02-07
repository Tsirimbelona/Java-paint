
package paint.java_avancee;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Arc2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ZoneDessin extends JPanel {
    
    private Color couleurP;
    private int tailleP= 5;
    private int refType = 1;
    private JButton elements = new JButton();
    private Color couleurBackground = Color.white;
    protected boolean CcolF = true, RColF = false;
    BufferedImage tmpImg;
    private Cursor curseur = Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR);
    
    private ArrayList<Formes> listeForme= new ArrayList<>();
    private ArrayList<Formes> listeRepete = new ArrayList<>();
    
   
    BaseDeLine b2, eraser;
    Formes touteForme;
    private Font policeFont = new Font("", Font.PLAIN, 12);
    private Frame frame;
    private int Xdeplace, Ydeplace, elementX = -50, elementY = -50;

    public ZoneDessin(Frame frame) {
        this.frame = frame;
        setRefCouleurPointer(Color.BLACK);
        elements.setContentAreaFilled(false);
        elements.setBackground(Color.RED);
        elements.setOpaque(true);
        add(elements);
        //elements.setLocation(-50, -50);
        elements.setPreferredSize(new Dimension(5, 5));
        elements.setCursor(Cursor.getPredefinedCursor(Cursor.SE_RESIZE_CURSOR));

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent evt) {
                if (getCursor().equals(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR))) {
                    Xdeplace = evt.getXOnScreen() - (int) touteForme.getX();
                    Ydeplace = evt.getYOnScreen() - (int) touteForme.getY();
                    if (touteForme.getRefForme() == 2) {
                        touteForme.setWidth(touteForme.getLastX() - touteForme.getX());
                        touteForme.setHeight(touteForme.getLastY() - touteForme.getY());
                    }
                } else {
                    elementX = -25;
                    elementY = -25;
                    //elements.setLocation(elementX, elementY);
                    
                    switch (refType) {
                        case 1:
                            b2 = new BaseDeLine(evt.getX(), evt.getY(), tailleP, couleurP, couleurBackground, 1);
                            listeForme.add(b2);
                            break;
                        case 2:
                            touteForme = new Formes(evt.getX(), evt.getY(), tailleP, couleurP, couleurBackground, 2, CcolF, RColF);
                            touteForme.setLastX(evt.getX());
                            touteForme.setLastY(evt.getY());
                            listeForme.add(touteForme);
                            break;
                        case 3:
                            touteForme = new Formes(evt.getX(), evt.getY(), tailleP, couleurP, couleurBackground, 3, CcolF, RColF);
                            listeForme.add(touteForme);
                            break;
                        case 4:
                            touteForme = new Formes(evt.getX(), evt.getY(), tailleP, couleurP, couleurBackground, 4, CcolF, RColF);
                            listeForme.add(touteForme);
                            break;
                        case 5:
                            touteForme = new Formes(evt.getX(), evt.getY(), tailleP, couleurP, couleurBackground, 5, CcolF, RColF);
                            listeForme.add(touteForme);
                            break;
                        case 6:
                            touteForme = new Formes(evt.getX(), evt.getY(), tailleP, couleurP, couleurBackground, 6, CcolF, RColF);
                            touteForme.setLastX(evt.getX());
                            touteForme.setLastY(evt.getY());
                            listeForme.add(touteForme);
                            break;
                        case 7:
                            touteForme = new Formes(evt.getX(), evt.getY(), tailleP, couleurP, couleurBackground, 7, CcolF, RColF);
                            listeForme.add(touteForme);
                            break;
                        
                        case 9:
                            TexteDialog txtD = new TexteDialog(frame);
                            txtD.setVisible(true);
                            if (txtD.getTExte() != null) {
                                System.out.println(txtD.getTExte());
                                touteForme = new Texte(evt.getX(), evt.getY(), tailleP, couleurP, couleurBackground, 9, CcolF, RColF, policeFont, txtD.getTExte());
                               
                                touteForme.setWidth(50);
                                touteForme.setHeight(50);
                                listeForme.add(touteForme);
                            }
                            break;
                        case 10:
                            touteForme = new Formes(evt.getX(), evt.getY(), tailleP, couleurP, couleurBackground, 10, CcolF, RColF);
                            listeForme.add(touteForme);
                            break;
                        case 11:
                            touteForme = new Formes(evt.getX(), evt.getY(), tailleP, couleurP, couleurBackground, 11, CcolF, RColF);
                            listeForme.add(touteForme);
                            break;
                        case 12:
                            touteForme = new Formes(evt.getX(), evt.getY(), tailleP, couleurP, couleurBackground, 12, CcolF, RColF);
                            listeForme.add(touteForme);
                            break;
                        case 13:
                            touteForme = new Formes(evt.getX(), evt.getY(), tailleP, couleurP, couleurBackground, 13, CcolF, RColF);
                            listeForme.add(touteForme);
                            break;

                    }
                    repaint();
                    listeRepete.clear();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (getCursor().equals(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR))) {

                } else {
                    if (touteForme instanceof Formes) {
                        elements.setLocation(e.getX(), e.getY());
                    }
                    elementX = e.getX();
                    elementY = e.getY();
                }
                System.out.println(elementX + "         " + elementY);
            }

        });

        this.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseMoved(MouseEvent evt) {
                if (touteForme instanceof Formes) {
                    if (touteForme.getRefForme() == 2) {
                        Rectangle2D lin = new Rectangle2D.Double(touteForme.getX(), touteForme.getY(), touteForme.getLastX() - touteForme.getX(), touteForme.getLastY() - touteForme.getY());
                        if (lin.contains(evt.getX(), evt.getY())) {
                            setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
                        } else {
                            setCursor(curseur);
                        }
                    } else {
                        Rectangle2D r = new Rectangle2D.Double(touteForme.getX(), touteForme.getY(), touteForme.getWidth(), touteForme.getHeight());
                        if (r.contains(evt.getX(), evt.getY())) {
                            setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
                        } else {
                            setCursor(curseur);
                        }
                    }
                }
            }

            @Override
            public void mouseDragged(MouseEvent evt) {
                if (getCursor().equals(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR))) {
                    touteForme.setX(evt.getXOnScreen() - Xdeplace);
                    touteForme.setY(evt.getYOnScreen() - Ydeplace);
                    touteForme.setLastX(touteForme.getX() + touteForme.getHeight());
                    touteForme.setLastY(touteForme.getY() + touteForme.getWidth());
                    if (touteForme.getRefForme() == 2) {
                        elementX = (int) touteForme.getLastX();
                        elementY = (int) touteForme.getLastY();
                    } else {
                        elementX = (int) (touteForme.getX() + touteForme.getWidth());
                        elementY = (int) (touteForme.getY() + touteForme.getHeight());
                    }
                    elements.setLocation(elementX, elementY);
                } else {
                    switch (refType) {
                        case 1:
                            b2.AddPoint(evt.getX(), evt.getY());
                            break;
                        case 2:
                            if (touteForme != null) {
                                touteForme.setLastX(evt.getX());
                                touteForme.setLastY(evt.getY());
                            }
                            break;
                        case 3:
                            if (touteForme != null) {
                                touteForme.setWidth(evt.getX() - touteForme.getX());
                                touteForme.setHeight(evt.getY() - touteForme.getY());
                            }
                            break;
                        case 4:
                            if (touteForme != null) {
                                touteForme.setHeight(evt.getY() - touteForme.getY());
                                touteForme.setWidth(touteForme.getHeight());
                            }
                            break;
                        case 5:
                            if (touteForme != null) {
                                touteForme.setWidth(evt.getX() - touteForme.getX());
                                touteForme.setHeight(evt.getY() - touteForme.getY());
                            }
                            break;
                        case 6:
                            if (touteForme != null) {
                                touteForme.setLastX(evt.getX());
                                touteForme.setLastY(evt.getY());
                            }
                            break;
                        case 7:
                            if (touteForme != null) {
                                touteForme.setWidth(evt.getX());
                                touteForme.setHeight(evt.getY());
                            }
                            break;
                        case 8:
                            eraser.AddPoint(evt.getX(), evt.getY());
                            break;
                        case 10:
                            if (touteForme != null) {
                                touteForme.setWidth(evt.getX());
                                touteForme.setHeight(evt.getY());
                            }
                        case 11:
                            if (touteForme != null) {
                                touteForme.setWidth(evt.getX());
                                touteForme.setHeight(evt.getY());
                            }
                        case 12:
                            if (touteForme != null) {
                                touteForme.setWidth(evt.getX());
                                touteForme.setHeight(evt.getY());
                            }
                        case 13:
                            if (touteForme != null) {
                                touteForme.setWidth(evt.getX());
                                touteForme.setHeight(evt.getY());
                            }
                    }

                }
                repaint();
            }
        });
        elements.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent evt) {
                elementX = evt.getXOnScreen() - Xdeplace;
                elementY = evt.getYOnScreen() - Ydeplace;
                elements.setLocation(elementX, elementY);
                if (touteForme instanceof Formes) {
                    if (touteForme.getRefForme() == 2) {
                        touteForme.setLastX(elements.getLocation().x);
                        touteForme.setLastY(elements.getLocation().y);
                    } else {
                        touteForme.setWidth(elements.getLocation().x - touteForme.getX());
                        touteForme.setHeight(elements.getLocation().y - touteForme.getY());
                    }
                }
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent evt) {

            }
        });
        
        //***********************On récupère les coordonnées de la souris **************
        elements.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent evt) {
                Xdeplace = evt.getXOnScreen() - elements.getLocation().x;
                Ydeplace = evt.getYOnScreen() - elements.getLocation().y;
                elements.setLocation(Xdeplace, Ydeplace);
                if (touteForme instanceof Formes) {
                    if (touteForme.getRefForme() == 2) {
                        touteForme.setLastX(elements.getLocation().x);
                        touteForme.setLastY(elements.getLocation().y);
                    } else {
                        touteForme.setWidth(elements.getLocation().x - touteForme.getX());
                        touteForme.setHeight(elements.getLocation().y - touteForme.getY());
                    }
                }
                repaint();
            }
        });

    }

//************************* Pallette de couleur***************************
 //   
    @Override
    protected void paintComponent(Graphics graph) {
        Graphics2D g2 = (Graphics2D) graph;
        g2.setColor(getBackground()); //solut
        g2.fillRect(0, 0, this.getWidth(), this.getHeight());
        if(tmpImg!=null){
            graph.drawImage(tmpImg, 0, 0, null);
        }
        listeForme.forEach((list) -> {
            g2.setColor(list.getCountourColor());
            g2.setStroke(new BasicStroke(list.getStrokeWidth(), BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            switch (list.getRefForme()) {
                case 1:
                    BaseDeLine stylo = (BaseDeLine) list;
                    for (Line2D l : stylo.getMikajTsipika()) {
                        g2.draw(l);
                    }
                    break;
                case 2:
                    Line2D ligne = new Line2D.Double(list.getX(), list.getY(), list.getLastX(), list.getLastY());
                    g2.draw(ligne);
                    break;
                case 3:
                    Rectangle2D rectangle = new Rectangle2D.Double(list.getX(), list.getY(), list.getWidth(), list.getHeight());
                    g2.setStroke(new BasicStroke(list.getStrokeWidth(), BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER));
                    if (list.isRColBJ()) {
                        g2.setPaint(list.getInsideColor());
                        g2.fill(rectangle);
                    }
                    if (list.isCcolBJ()) {
                        g2.setPaint(list.getCountourColor());
                        g2.draw(rectangle);
                    }
                    break;
                case 4:
                    Rectangle2D carre = new Rectangle2D.Double(list.getX(), list.getY(), list.getHeight(), list.getHeight());
                    g2.setStroke(new BasicStroke(list.getStrokeWidth(), BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER));
                    if (list.isRColBJ()) {
                        g2.setPaint(list.getInsideColor());
                        g2.fill(carre);
                    }
                    if (list.isCcolBJ()) {
                        g2.setPaint(list.getCountourColor());
                        g2.draw(carre);
                    }
                    break;
                case 5:
                    Ellipse2D ellypse = new Ellipse2D.Double(list.getX(), list.getY(), list.getWidth(), list.getHeight());
                    if (list.isRColBJ()) {
                        g2.setPaint(list.getInsideColor());
                        g2.fill(ellypse);
                    }
                    if (list.isCcolBJ()) {
                        g2.setPaint(list.getCountourColor());
                        g2.draw(ellypse);
                    }
                    break;
                case 6:
                    CubicCurve2D courbe = new CubicCurve2D.Double(list.getX(), list.getY(), list.getWidth(), list.getHeight(), list.getLastX() / 2, list.getLastY() / 2, list.getLastX(), list.getLastY());
                    if (list.isRColBJ()) {
                        g2.setPaint(list.getInsideColor());
                        g2.fill(courbe);
                    }
                    if (list.isCcolBJ()) {
                        g2.setPaint(list.getCountourColor());
                        g2.draw(courbe);
                    }
                    break;
                case 7:
                    Arc2D arc = new Arc2D.Double(list.getX(), list.getY(), list.getWidth(), list.getHeight(), 30, 60, 0);

                    if (list.isRColBJ()) {
                        g2.setPaint(list.getInsideColor());
                        g2.fill(arc);
                    }
                    if (list.isCcolBJ()) {
                        g2.setPaint(list.getCountourColor());
                        g2.draw(arc);
                    }
                    break;
                case 8:
                    BaseDeLine gommage = (BaseDeLine) list;
                    for (Line2D erase : gommage.getMikajTsipika()) {
                        g2.draw(erase);
                    }
                    break;
                case 9:
                    g2.setFont(((Texte) list).getPolice());
                    g2.drawString(((Texte) list).getTexte(), (float) list.getX(), (float) list.getY());
                    break;
                case 10:
                    Polygon polygon = new Polygon(
                            new int[]{(int) (list.getWidth() / 2 + list.getX()), (int) (list.getWidth() + list.getX()), (int) list.getX()},
                            new int[]{(int) list.getY(), (int) (list.getHeight() + list.getY()), (int) (list.getHeight() + list.getY())},
                            3);
                    if (list.isRColBJ()) {
                        g2.setPaint(list.getInsideColor());
                        g2.fill(polygon);
                    }
                    if (list.isCcolBJ()) {
                        g2.setPaint(list.getCountourColor());
                        g2.draw(polygon);
                    }
                    break;
                case 11:
                    Polygon losange = new Polygon(
                            new int[]{
                                (int) (list.getWidth() / 2 + list.getX()),
                                (int) (list.getWidth() + list.getX()),
                                (int) (list.getWidth() / 2 + list.getX()),
                                (int) list.getX()},
                            new int[]{
                                (int) list.getY(),
                                (int) (list.getHeight() / 2 + list.getY()),
                                (int) (list.getHeight() + list.getY()),
                                (int) (list.getHeight() / 2 + list.getY())},
                            4);
                    if (list.isRColBJ()) {
                        g2.setPaint(list.getInsideColor());
                        g2.fill(losange);
                    }
                    if (list.isCcolBJ()) {
                        g2.setPaint(list.getCountourColor());
                        g2.draw(losange);
                    }
                    break;
                case 12:
                    Polygon hexagon = new Polygon(
                            new int[]{
                                (int) (list.getWidth() / 2 + list.getX()),
                                (int) (list.getWidth() + list.getX()),
                                (int) (list.getWidth() + list.getX()),
                                (int) (list.getWidth() / 2 + list.getX()),
                                (int) list.getX(),
                                (int) list.getX()},
                            new int[]{
                                (int) list.getY(),
                                (int) (list.getHeight() / 4 + list.getY()),
                                (int) ((list.getHeight() * 3) / 4 + list.getY()),
                                (int) (list.getHeight() + list.getY()),
                                (int) ((list.getHeight() * 3) / 4 + list.getY()),
                                (int) (list.getHeight() / 4 + list.getY())},
                            6);
                    if (list.isRColBJ()) {
                        g2.setPaint(list.getInsideColor());
                        g2.fill(hexagon);
                    }
                    if (list.isCcolBJ()) {
                        g2.setPaint(list.getCountourColor());
                        g2.draw(hexagon);
                    }
                    break;
                case 13:
                    Polygon poly = new Polygon( 
                            new int[]{ (int)list.getX(), (int)((list).getWidth()+list.getX()), (int)list.getX()}, 
                            new int[]{ (int)list.getY(), (int)((list).getHeight()+list.getY()), (int)((list).getHeight()+list.getY())},
                            3);
                    if(list.isRColBJ()){
                        g2.setPaint( list.getInsideColor());
                        g2.fill(poly);
                    }
                    if(list.isCcolBJ()){
                        g2.setPaint( list.getCountourColor());
                        g2.draw(poly);
                    }
                    break;
                default:
                    break;
            }
        });

        if (touteForme instanceof Formes) {
            if (touteForme.getRefForme() == 2) {

            } else {
                Rectangle2D recta = new Rectangle2D.Double(touteForme.getX(), touteForme.getY(), touteForme.getWidth(), touteForme.getHeight());
                g2.setPaint(Color.GRAY);
                g2.setStroke(new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 3f, new float[]{4f, 2f}, 0f));
                g2.draw(recta);

            }
        }
        elements.setLocation(elementX, elementY);
    }
//****************************************************************************

   /* public static void main(String[] args) {

    }*/

    public void ControlZ() {
        if (!listeForme.isEmpty()) {
            Formes T = listeForme.get(listeForme.size() - 1);
            listeForme.remove(T);
            listeRepete.add(T);
            repaint();
        }
    }

    public void ControlY() {
        if (!listeRepete.isEmpty()) {
            Formes T = listeRepete.get(listeRepete.size() - 1);
            listeRepete.remove(T);
            listeForme.add(T);
            repaint();
        }
    }

    public int getRefPointerTaille() {
        return tailleP;
    }

    public void setRefPointerTaille(int tailleP) {
        this.tailleP = tailleP;
    }

    public Color getRefCouleurPointer() {
        return couleurP;
    }

    public void setRefCouleurPointer(Color refCouleur) {
        this.couleurP = refCouleur;
        if (touteForme != null) {
            touteForme.setCountourColor(refCouleur);
            repaint();
        }
    }

    public Color getRefCouleurBackground() {
        return couleurBackground;
    }

    public void setRefCouleurBackground(Color refCouleurBackground) {
        this.couleurBackground = refCouleurBackground;
        if (touteForme != null) {
            touteForme.setInsideColor(refCouleurBackground);
            repaint();
        }
    }

    public int getRefType() {
        return refType;
    }

    public void setRefType(int refType) {
        this.refType = refType;
        if (refType == 1 || refType == 8) {
            touteForme = null;
        }
    }

    public void setCcolF(boolean CcolF) {
        this.CcolF = CcolF;
        if (touteForme != null) {
            touteForme.setCcolBJ(CcolF);
            repaint();
        }
    }

    public void setRColF(boolean RColF) {
        this.RColF = RColF;
        if (touteForme != null) {
            touteForme.setRColBJ(RColF);
            repaint();
        }
    }public void setPoliceF(Font policeFont) {
        this.policeFont = policeFont;
        if (touteForme != null) {
            ((Texte) touteForme).setPolice(policeFont);
            repaint();
        }
    }

    
//**********************SAUVEGARDE IMAGES***********************
    public void SaveImage() {
        String extension = "PNG";
        BufferedImage BI = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_3BYTE_BGR);
        Graphics2D g2 = BI.createGraphics();
        this.paint(g2);
        File file = new File("Untitled." + extension);
        JFileChooser jfile = new JFileChooser(); // boite de dialogue pour choisir le dossier de destination...        
        jfile.setSelectedFile(file);
        int valRetourne = jfile.showSaveDialog(this);
        if (valRetourne == JFileChooser.APPROVE_OPTION) {
            try {

                File fichier = new File(jfile.getSelectedFile().toString() + "." + extension);
                ImageIO.write(BI, "JPEG", fichier);
            } catch (IOException ex) {
                Logger.getLogger(FenetrePrincipale.class.getName()).log(Level.SEVERE, null, ex);
            }
            g2.dispose();
        }
    }
   
  //******************OUVRIR PROJET**************************************  
    public void OpenImage() throws IOException {
        
        Graphics2D g2 = (Graphics2D) this.getGraphics();
        JFileChooser jfile = new JFileChooser();// boite de dialogue pour choisir le dossier de destination...
        int status = jfile.showOpenDialog(this);
        File file = jfile.getSelectedFile();
        if (status == JFileChooser.APPROVE_OPTION) {
            tmpImg = ImageIO.read(file);
            g2.drawImage(tmpImg, 0, 0, null);
            System.out.println("Image Opened: " + file.toString());
            listeForme.clear();
        }
    }

 //*************************ACTION BOTTON NOUVEAU********************   
    public void clearPan(){
        if(listeForme.isEmpty()){
            repaint();
        }else{
            if(JOptionPane.showConfirmDialog(this, "Votre dessin  sera enregistré?", "Nouvel Zone du dessin", JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION){
               SaveImage(); 
               listeForme.clear();
            }else{
                listeForme.clear();
                repaint();
            }
            
        }
    }
    
   //*************************ACTION BOTTON QUITTER********************** 
      public void Exit(){
        if(listeForme.isEmpty()){
            System.exit(1);
        }
        else
        {
            if(JOptionPane.showConfirmDialog(this, "VOULEZ VOUS  SAUVEGARDER CE DESSIN?", "Quitter", JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION){
               SaveImage(); 
               listeForme.clear();
               System.exit(1);
            }else{
                listeForme.clear();
                repaint();
                System.exit(1);
            }         
        }
    }
    
         //*******************EFFACE TOUT*****************
         public void clear(){
        if(listeForme.isEmpty()){
            repaint();
        }
        else
        {
            if(JOptionPane.showConfirmDialog(this, "Voulez vous effacer ce dessin?", "Suppression du dessin", JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION){
              listeForme.clear();
              repaint();
               
            }       
        }
    }
         
    public ArrayList<Formes> getFormeList() {
        return listeForme;
    }

    public Formes getFormejiaby() {
        return touteForme;
    }
}
