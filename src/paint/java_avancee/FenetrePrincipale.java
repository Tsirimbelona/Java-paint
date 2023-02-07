/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paint.java_avancee;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;

/**
 *
 * @author Jean_Nico .T
 */
public class FenetrePrincipale extends javax.swing.JFrame {
    
    //*********Notre zone de dessin************************
   private ZoneDessin zonedessin = new ZoneDessin(this);
   private final String listPolice[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

   
    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale() {
        initComponents();
        listPolice[1] = "Default";
        this.add(zonedessin, BorderLayout.CENTER);
        this.barDeMenu();
       
    }
    
     private void barDeMenu()
    {
        
      //****************changement taille du point***************************************
        largTaille_Text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                String[] taillerefPinceauToolx = {"2", "4", "6", "8", "10", "12", "14",
                    "16", "18", "20", "22", "24", "26", "28", "34", "48", "72", "84", "90"};

                String chaineTaille = (String) JOptionPane.showInputDialog(FenetrePrincipale.this, "Choisissez la taille de curseur", "Curseur!!",
                        JOptionPane.QUESTION_MESSAGE,
                        null, taillerefPinceauToolx, taillerefPinceauToolx[0]);
                int taille = Integer.parseInt(chaineTaille);
                zonedessin.setRefPointerTaille(taille);              
            }
        });
         
       //*******************changement couleur du pinceau***************************************  
       colors.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e) 
           {  
               Color couleur = JColorChooser.showDialog(FenetrePrincipale.this, "Choisissez la couleur du pinceau", Color.GREEN);
                zonedessin.setRefCouleurPointer(couleur);             
           }
       });
       
       //********************changement couleur du remplissage**********************************
       couleurRempli.addActionListener(new ActionListener() 
       {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                Color couleur = JColorChooser.showDialog(FenetrePrincipale.this, "Choisissez la couleur du remplissage.", Color.RED);
                zonedessin.setRefCouleurBackground(couleur);
                couleurRempli.setBackground(couleur);
                couleurRempli.setOpaque(true);
            }
        });
             
       //*******************changement backgroung de dessin*******************************************
       fond.addActionListener(new ActionListener() 
       {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color couleur = JColorChooser.showDialog(FenetrePrincipale.this, "Choisissez la couleur du background", Color.WHITE);
                zonedessin.setBackground(couleur);
                fond.setBackground(couleur);
                fond.setOpaque(true);
            }
        }); 
       
       //*******************COULEURS******************************
       white.addActionListener(new ActionListener() 
       {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                zonedessin.setRefCouleurPointer(Color.WHITE);
            }
        });
       
       black.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                zonedessin.setRefCouleurPointer(Color.BLACK);
            }
        });

        red.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                zonedessin.setRefCouleurPointer(Color.RED);
            }
        });

        blue.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                zonedessin.setRefCouleurPointer(Color.BLUE);             
            }
        });

        mangeta.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                zonedessin.setRefCouleurPointer(Color.MAGENTA);
            }
        });

        black.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
               zonedessin.setRefCouleurPointer(Color.BLACK);
            }
        });

        green.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                zonedessin.setRefCouleurPointer(Color.GREEN);
            }
        });

        yellow.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                zonedessin.setRefCouleurPointer(Color.YELLOW);            
            }
        });

        pink.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                zonedessin.setRefCouleurPointer(Color.PINK);          
            }
        });

        orange.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                zonedessin.setRefCouleurPointer(Color.ORANGE);
            }
        });

        cyan.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                zonedessin.setRefCouleurPointer(Color.CYAN);             
            }
        });

        lightGray.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                zonedessin.setRefCouleurPointer(Color.LIGHT_GRAY);           
            }
        });
        
        gray.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                zonedessin.setRefCouleurPointer(Color.GRAY);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        panel_ambany = new javax.swing.JPanel();
        panel_FormeGeo = new javax.swing.JPanel();
        ContoureCheck = new javax.swing.JCheckBox();
        remplisCheck = new javax.swing.JCheckBox();
        couleurRempli = new javax.swing.JButton();
        ligne = new javax.swing.JButton();
        rectangle = new javax.swing.JButton();
        oval = new javax.swing.JButton();
        carre = new javax.swing.JButton();
        courbe = new javax.swing.JButton();
        arc = new javax.swing.JButton();
        triangl = new javax.swing.JButton();
        trianglRect = new javax.swing.JButton();
        losa = new javax.swing.JButton();
        hexa = new javax.swing.JButton();
        panel_Texte = new javax.swing.JPanel();
        policeText = new javax.swing.JComboBox<>();
        tailleText = new javax.swing.JComboBox<>();
        gras = new javax.swing.JRadioButton();
        normal = new javax.swing.JRadioButton();
        italique = new javax.swing.JRadioButton();
        clic_text = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panel_Fond = new javax.swing.JPanel();
        fond = new javax.swing.JButton();
        barMenu = new javax.swing.JToolBar();
        newFile = new javax.swing.JButton();
        saveDoc = new javax.swing.JButton();
        openDoc = new javax.swing.JButton();
        pinceau = new javax.swing.JButton();
        largTaille_Text = new javax.swing.JButton();
        annuler = new javax.swing.JButton();
        repeter = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        white = new javax.swing.JButton();
        black = new javax.swing.JButton();
        red = new javax.swing.JButton();
        orange = new javax.swing.JButton();
        green = new javax.swing.JButton();
        lightGray = new javax.swing.JButton();
        mangeta = new javax.swing.JButton();
        gray = new javax.swing.JButton();
        blue = new javax.swing.JButton();
        pink = new javax.swing.JButton();
        cyan = new javax.swing.JButton();
        yellow = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        colors = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        nouveauFichier = new javax.swing.JMenuItem();
        ouvrirFichier = new javax.swing.JMenuItem();
        enregistrerFichier = new javax.swing.JMenuItem();
        quitterFichier = new javax.swing.JMenuItem();
        effaceTout = new javax.swing.JMenu();
        annuler_Edit = new javax.swing.JMenuItem();
        repeter_Edit = new javax.swing.JMenuItem();
        efacerTout = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("L'ardoise_Magique");
        setBackground(new java.awt.Color(255, 255, 255));

        panel_ambany.setBackground(new java.awt.Color(0, 102, 153));
        panel_ambany.setMinimumSize(new java.awt.Dimension(190, 600));
        panel_ambany.setPreferredSize(new java.awt.Dimension(220, 600));

        panel_FormeGeo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Forme Géométriques", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 1, 13), new java.awt.Color(204, 0, 0))); // NOI18N
        panel_FormeGeo.setPreferredSize(new java.awt.Dimension(200, 402));
        panel_FormeGeo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContoureCheck.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        ContoureCheck.setText("Bordures");
        ContoureCheck.setToolTipText("Ajouter ou supremer les bordures de votre sélection.");
        ContoureCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContoureCheckActionPerformed(evt);
            }
        });
        panel_FormeGeo.add(ContoureCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 113, 19));

        remplisCheck.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        remplisCheck.setText("Remplissage");
        remplisCheck.setToolTipText("Remplissage de la forme");
        remplisCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remplisCheckActionPerformed(evt);
            }
        });
        panel_FormeGeo.add(remplisCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        couleurRempli.setBackground(new java.awt.Color(255, 255, 255));
        couleurRempli.setToolTipText("Sélectionner la coleur techniquepour le remplissage de l'outil sélectionner..");
        couleurRempli.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        couleurRempli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                couleurRempliActionPerformed(evt);
            }
        });
        panel_FormeGeo.add(couleurRempli, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 45, 32));

        ligne.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ligne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ligne.png"))); // NOI18N
        ligne.setText("Ligne");
        ligne.setToolTipText("Ligne");
        ligne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ligneActionPerformed(evt);
            }
        });
        panel_FormeGeo.add(ligne, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 90, 20));

        rectangle.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rectangle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangle.png"))); // NOI18N
        rectangle.setText("Rectangle");
        rectangle.setToolTipText("Rectangle");
        rectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleActionPerformed(evt);
            }
        });
        panel_FormeGeo.add(rectangle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, 20));

        oval.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Circle.png"))); // NOI18N
        oval.setText("Ovale");
        oval.setToolTipText("Ovale");
        oval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovalActionPerformed(evt);
            }
        });
        panel_FormeGeo.add(oval, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 90, 20));

        carre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangle.png"))); // NOI18N
        carre.setText("  Carrée");
        carre.setToolTipText("Carrée");
        carre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carreActionPerformed(evt);
            }
        });
        panel_FormeGeo.add(carre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 100, 20));

        courbe.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        courbe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arc.png"))); // NOI18N
        courbe.setText("Courbe");
        courbe.setToolTipText("Courbe");
        courbe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courbeActionPerformed(evt);
            }
        });
        panel_FormeGeo.add(courbe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 90, 20));

        arc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arc.png"))); // NOI18N
        arc.setText("  Arc");
        arc.setToolTipText("Arc");
        arc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arcActionPerformed(evt);
            }
        });
        panel_FormeGeo.add(arc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 90, 20));

        triangl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/triangle.png"))); // NOI18N
        triangl.setText("Triangle");
        triangl.setToolTipText("Triangle");
        triangl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trianglActionPerformed(evt);
            }
        });
        panel_FormeGeo.add(triangl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 100, 20));

        trianglRect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/triangle.png"))); // NOI18N
        trianglRect.setText("Triangle rectangle");
        trianglRect.setToolTipText("Triangle rectangle");
        trianglRect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trianglRectActionPerformed(evt);
            }
        });
        panel_FormeGeo.add(trianglRect, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 190, 20));

        losa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/losange.png"))); // NOI18N
        losa.setText("Losange");
        losa.setToolTipText("Losange");
        losa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                losaActionPerformed(evt);
            }
        });
        panel_FormeGeo.add(losa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 100, 20));

        hexa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pentagon.png"))); // NOI18N
        hexa.setText("Hexagone");
        hexa.setToolTipText("Hexagone");
        hexa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hexaActionPerformed(evt);
            }
        });
        panel_FormeGeo.add(hexa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 190, 20));

        panel_Texte.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TEXTE", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 1, 14), new java.awt.Color(204, 0, 0))); // NOI18N
        panel_Texte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        policeText.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        policeText.setModel(new DefaultComboBoxModel<>(listPolice));
        policeText.setToolTipText("Sélectioner une nouvelle police pour votre texte");
        policeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                policeTextActionPerformed(evt);
            }
        });
        panel_Texte.add(policeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 103, -1));

        tailleText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "9", "10", "11", "12", "14", "16", "18", "20", "22", "24", "26", "28", "36", "48", "57", "65", "75", "89", "98", "100", " " }));
        tailleText.setSelectedIndex(3);
        tailleText.setToolTipText("Modifier la taille de votre texte.");
        tailleText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tailleTextActionPerformed(evt);
            }
        });
        panel_Texte.add(tailleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 60, 20));

        gras.setText("Gras");
        gras.setToolTipText("Mettre votre texte en gras.");
        gras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grasActionPerformed(evt);
            }
        });
        panel_Texte.add(gras, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 120, 50, 20));

        normal.setText("Normal");
        normal.setToolTipText("Mettre votre texte en normale");
        normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalActionPerformed(evt);
            }
        });
        panel_Texte.add(normal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 70, 20));

        italique.setText("Italique");
        italique.setToolTipText("Mettre votre texte en italique");
        italique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                italiqueActionPerformed(evt);
            }
        });
        panel_Texte.add(italique, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 70, 20));

        clic_text.setBackground(new java.awt.Color(0, 153, 102));
        clic_text.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        clic_text.setText("Cliquer ici pout texte");
        clic_text.setToolTipText("Cliquer ce botton pour ecrirer un mot ou texte.");
        clic_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clic_textActionPerformed(evt);
            }
        });
        panel_Texte.add(clic_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 190, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 253));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Police                Taille");
        panel_Texte.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 67, 180, 20));

        panel_Fond.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FOND", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 1, 14), new java.awt.Color(204, 0, 0))); // NOI18N
        panel_Fond.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backG.png"))); // NOI18N
        fond.setToolTipText("Sélectionner  la couleur de background de dessin.");
        fond.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fondActionPerformed(evt);
            }
        });
        fond.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fondPropertyChange(evt);
            }
        });
        panel_Fond.add(fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 90, 70));

        javax.swing.GroupLayout panel_ambanyLayout = new javax.swing.GroupLayout(panel_ambany);
        panel_ambany.setLayout(panel_ambanyLayout);
        panel_ambanyLayout.setHorizontalGroup(
            panel_ambanyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ambanyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_ambanyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_Fond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_FormeGeo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panel_Texte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_ambanyLayout.setVerticalGroup(
            panel_ambanyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ambanyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_FormeGeo, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_Texte, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_Fond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        getContentPane().add(panel_ambany, java.awt.BorderLayout.LINE_START);

        barMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        barMenu.setFloatable(false);
        barMenu.setRollover(true);
        barMenu.setMaximumSize(new java.awt.Dimension(500, 327));
        barMenu.setOpaque(false);
        barMenu.setPreferredSize(new java.awt.Dimension(751, 41));

        newFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/newdoc.png"))); // NOI18N
        newFile.setToolTipText("Nouveau");
        newFile.setFocusable(false);
        newFile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newFile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileActionPerformed(evt);
            }
        });
        barMenu.add(newFile);

        saveDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/savedoc.png"))); // NOI18N
        saveDoc.setToolTipText("Enregistrer sous.");
        saveDoc.setFocusable(false);
        saveDoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveDoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        saveDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDocActionPerformed(evt);
            }
        });
        barMenu.add(saveDoc);

        openDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/opendoc.png"))); // NOI18N
        openDoc.setToolTipText("Ouvrir");
        openDoc.setFocusable(false);
        openDoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        openDoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        openDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openDocActionPerformed(evt);
            }
        });
        barMenu.add(openDoc);

        pinceau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pinceau.png"))); // NOI18N
        pinceau.setToolTipText("Pinceaux");
        pinceau.setFocusable(false);
        pinceau.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pinceau.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pinceau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinceauActionPerformed(evt);
            }
        });
        barMenu.add(pinceau);

        largTaille_Text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/widthpencil.png"))); // NOI18N
        largTaille_Text.setToolTipText("Sélectioner la largeur de l'outil sélectionné.");
        largTaille_Text.setFocusable(false);
        largTaille_Text.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        largTaille_Text.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        largTaille_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                largTaille_TextActionPerformed(evt);
            }
        });
        barMenu.add(largTaille_Text);

        annuler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/undo1.PNG"))); // NOI18N
        annuler.setToolTipText("Annuler");
        annuler.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        annuler.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        annuler.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerActionPerformed(evt);
            }
        });
        barMenu.add(annuler);

        repeter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/REDO1.PNG"))); // NOI18N
        repeter.setToolTipText("Répéter");
        repeter.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        repeter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        repeter.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        repeter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                repeterFocusGained(evt);
            }
        });
        repeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repeterActionPerformed(evt);
            }
        });
        barMenu.add(repeter);
        barMenu.add(jSeparator1);

        white.setToolTipText("Blanc");
        white.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        white.setContentAreaFilled(false);
        white.setFocusable(false);
        white.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        white.setMaximumSize(new java.awt.Dimension(37, 37));
        white.setMinimumSize(new java.awt.Dimension(37, 37));
        white.setPreferredSize(new java.awt.Dimension(37, 37));
        white.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        white.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteActionPerformed(evt);
            }
        });
        barMenu.add(white);

        black.setToolTipText("Noir");
        black.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));
        black.setFocusable(false);
        black.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        black.setMaximumSize(new java.awt.Dimension(37, 37));
        black.setMinimumSize(new java.awt.Dimension(37, 37));
        black.setPreferredSize(new java.awt.Dimension(37, 37));
        black.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barMenu.add(black);

        red.setToolTipText("Rouge");
        red.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.red, java.awt.Color.red));
        red.setFocusable(false);
        red.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        red.setMaximumSize(new java.awt.Dimension(37, 37));
        red.setMinimumSize(new java.awt.Dimension(37, 37));
        red.setPreferredSize(new java.awt.Dimension(37, 37));
        red.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barMenu.add(red);

        orange.setToolTipText("Orange");
        orange.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.orange, java.awt.Color.orange));
        orange.setFocusable(false);
        orange.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        orange.setMaximumSize(new java.awt.Dimension(37, 37));
        orange.setMinimumSize(new java.awt.Dimension(37, 37));
        orange.setPreferredSize(new java.awt.Dimension(37, 37));
        orange.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barMenu.add(orange);

        green.setToolTipText("Verte");
        green.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.green, java.awt.Color.green));
        green.setFocusable(false);
        green.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        green.setMaximumSize(new java.awt.Dimension(37, 37));
        green.setMinimumSize(new java.awt.Dimension(37, 37));
        green.setPreferredSize(new java.awt.Dimension(37, 37));
        green.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barMenu.add(green);

        lightGray.setToolTipText("Light gray");
        lightGray.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        lightGray.setFocusable(false);
        lightGray.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lightGray.setMaximumSize(new java.awt.Dimension(37, 37));
        lightGray.setMinimumSize(new java.awt.Dimension(37, 37));
        lightGray.setPreferredSize(new java.awt.Dimension(37, 37));
        lightGray.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barMenu.add(lightGray);

        mangeta.setToolTipText("Mangeta");
        mangeta.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.magenta, java.awt.Color.magenta));
        mangeta.setFocusable(false);
        mangeta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mangeta.setMaximumSize(new java.awt.Dimension(37, 37));
        mangeta.setMinimumSize(new java.awt.Dimension(37, 37));
        mangeta.setPreferredSize(new java.awt.Dimension(37, 37));
        mangeta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barMenu.add(mangeta);

        gray.setToolTipText("Gris");
        gray.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.gray));
        gray.setFocusable(false);
        gray.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gray.setMaximumSize(new java.awt.Dimension(37, 37));
        gray.setMinimumSize(new java.awt.Dimension(37, 37));
        gray.setPreferredSize(new java.awt.Dimension(37, 37));
        gray.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barMenu.add(gray);

        blue.setToolTipText("Bleu");
        blue.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, java.awt.Color.blue));
        blue.setFocusable(false);
        blue.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blue.setMaximumSize(new java.awt.Dimension(37, 37));
        blue.setMinimumSize(new java.awt.Dimension(37, 37));
        blue.setPreferredSize(new java.awt.Dimension(37, 37));
        blue.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barMenu.add(blue);

        pink.setToolTipText("Rose");
        pink.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.pink));
        pink.setFocusable(false);
        pink.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pink.setMaximumSize(new java.awt.Dimension(37, 37));
        pink.setMinimumSize(new java.awt.Dimension(37, 37));
        pink.setPreferredSize(new java.awt.Dimension(37, 37));
        pink.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barMenu.add(pink);

        cyan.setToolTipText("Cyan");
        cyan.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.cyan, java.awt.Color.cyan));
        cyan.setFocusable(false);
        cyan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cyan.setMaximumSize(new java.awt.Dimension(37, 37));
        cyan.setMinimumSize(new java.awt.Dimension(37, 37));
        cyan.setPreferredSize(new java.awt.Dimension(37, 37));
        cyan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barMenu.add(cyan);

        yellow.setToolTipText("Jaune");
        yellow.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.yellow, java.awt.Color.yellow));
        yellow.setFocusable(false);
        yellow.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        yellow.setMaximumSize(new java.awt.Dimension(37, 37));
        yellow.setMinimumSize(new java.awt.Dimension(37, 37));
        yellow.setPreferredSize(new java.awt.Dimension(37, 37));
        yellow.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barMenu.add(yellow);
        barMenu.add(jSeparator2);

        colors.setBackground(new java.awt.Color(153, 153, 153));
        colors.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/colors.png"))); // NOI18N
        colors.setToolTipText("Sélectionner  une couleur dans la pallete de couleurs");
        colors.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.lightGray));
        colors.setContentAreaFilled(false);
        colors.setFocusable(false);
        colors.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        colors.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        colors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorsActionPerformed(evt);
            }
        });
        barMenu.add(colors);

        getContentPane().add(barMenu, java.awt.BorderLayout.PAGE_START);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("                                       L'ARDOISE_MAGIQUE");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel1.setMaximumSize(new java.awt.Dimension(4, 18));
        jLabel1.setMinimumSize(new java.awt.Dimension(4, 18));
        jLabel1.setPreferredSize(new java.awt.Dimension(1, 22));
        getContentPane().add(jLabel1, java.awt.BorderLayout.SOUTH);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        File.setText("Fichier    ");
        File.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        nouveauFichier.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        nouveauFichier.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        nouveauFichier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/file.png"))); // NOI18N
        nouveauFichier.setText("Nouveau");
        nouveauFichier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nouveauFichierActionPerformed(evt);
            }
        });
        File.add(nouveauFichier);

        ouvrirFichier.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ouvrirFichier.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        ouvrirFichier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/folder_open.png"))); // NOI18N
        ouvrirFichier.setText("Ouvrir");
        ouvrirFichier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ouvrirFichierActionPerformed(evt);
            }
        });
        File.add(ouvrirFichier);

        enregistrerFichier.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        enregistrerFichier.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        enregistrerFichier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        enregistrerFichier.setText("Enregitrer sous");
        enregistrerFichier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistrerFichierActionPerformed(evt);
            }
        });
        File.add(enregistrerFichier);

        quitterFichier.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        quitterFichier.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        quitterFichier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/effacer.PNG"))); // NOI18N
        quitterFichier.setText("Quitter");
        quitterFichier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterFichierActionPerformed(evt);
            }
        });
        File.add(quitterFichier);

        jMenuBar1.add(File);

        effaceTout.setText("  Edit    ");
        effaceTout.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        effaceTout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                effaceToutActionPerformed(evt);
            }
        });

        annuler_Edit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        annuler_Edit.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        annuler_Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/undomenu.png"))); // NOI18N
        annuler_Edit.setText("Annuler");
        annuler_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annuler_EditActionPerformed(evt);
            }
        });
        effaceTout.add(annuler_Edit);

        repeter_Edit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        repeter_Edit.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        repeter_Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redomenu.png"))); // NOI18N
        repeter_Edit.setText("Reffair");
        repeter_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repeter_EditActionPerformed(evt);
            }
        });
        effaceTout.add(repeter_Edit);

        efacerTout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        efacerTout.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        efacerTout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gom.PNG"))); // NOI18N
        efacerTout.setText("Effacer tout");
        efacerTout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efacerToutActionPerformed(evt);
            }
        });
        effaceTout.add(efacerTout);

        jMenuBar1.add(effaceTout);

        jMenu3.setText("  A Propos");
        jMenu3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info.png"))); // NOI18N
        jMenuItem2.setText("Une application de dessin réaliser en JAVA par l'outil Netbeans.   -Version 1.0"); // NOI18N
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1047, 724));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void whiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_whiteActionPerformed

    private void annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerActionPerformed
        zonedessin.ControlZ();
    }//GEN-LAST:event_annulerActionPerformed

    private void repeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repeterActionPerformed
        zonedessin.ControlY();
    }//GEN-LAST:event_repeterActionPerformed

    private void largTaille_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_largTaille_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_largTaille_TextActionPerformed

    private void pinceauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinceauActionPerformed
        zonedessin.setRefType(1);
    }//GEN-LAST:event_pinceauActionPerformed

    private void openDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openDocActionPerformed
        try {
            zonedessin.OpenImage();
        } catch (IOException ex) {
            Logger.getLogger(FenetrePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_openDocActionPerformed

    private void saveDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDocActionPerformed
        zonedessin.SaveImage();
    }//GEN-LAST:event_saveDocActionPerformed

    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed
        zonedessin.clearPan();
    }//GEN-LAST:event_newFileActionPerformed

    private void tailleTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tailleTextActionPerformed
        setPolice();
    }//GEN-LAST:event_tailleTextActionPerformed

    private void hexaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hexaActionPerformed
        zonedessin.setRefType(12);
    }//GEN-LAST:event_hexaActionPerformed

    private void losaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_losaActionPerformed
        zonedessin.setRefType(11);
    }//GEN-LAST:event_losaActionPerformed

    private void trianglRectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trianglRectActionPerformed
        zonedessin.setRefType(13);
    }//GEN-LAST:event_trianglRectActionPerformed

    private void trianglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trianglActionPerformed
        zonedessin.setRefType(10);
    }//GEN-LAST:event_trianglActionPerformed

    private void arcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arcActionPerformed
        zonedessin.setRefType(7);
    }//GEN-LAST:event_arcActionPerformed

    private void courbeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courbeActionPerformed
        zonedessin.setRefType(6);
    }//GEN-LAST:event_courbeActionPerformed

    private void carreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carreActionPerformed
        zonedessin.setRefType(4);
    }//GEN-LAST:event_carreActionPerformed

    private void ovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovalActionPerformed
        zonedessin.setRefType(5);
    }//GEN-LAST:event_ovalActionPerformed

    private void rectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleActionPerformed
        zonedessin.setRefType(3);
    }//GEN-LAST:event_rectangleActionPerformed

    private void ligneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ligneActionPerformed
        zonedessin.setRefType(2);
    }//GEN-LAST:event_ligneActionPerformed

    private void remplisCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remplisCheckActionPerformed
        zonedessin.setRColF(remplisCheck.isSelected());
    }//GEN-LAST:event_remplisCheckActionPerformed

    private void ContoureCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContoureCheckActionPerformed
        zonedessin.setCcolF(ContoureCheck.isSelected());
    }//GEN-LAST:event_ContoureCheckActionPerformed

    private void italiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_italiqueActionPerformed
         setPolice();
    }//GEN-LAST:event_italiqueActionPerformed

    private void ouvrirFichierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ouvrirFichierActionPerformed
        try {
            zonedessin.OpenImage();
        } catch (IOException ex) {
            Logger.getLogger(FenetrePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ouvrirFichierActionPerformed

    private void enregistrerFichierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistrerFichierActionPerformed
        zonedessin.SaveImage();
    }//GEN-LAST:event_enregistrerFichierActionPerformed

    private void quitterFichierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterFichierActionPerformed
        zonedessin.Exit();
    }//GEN-LAST:event_quitterFichierActionPerformed

    private void annuler_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annuler_EditActionPerformed
        zonedessin.ControlZ();
    }//GEN-LAST:event_annuler_EditActionPerformed

    private void repeter_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repeter_EditActionPerformed
        zonedessin.ControlY();
    }//GEN-LAST:event_repeter_EditActionPerformed

    private void grasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grasActionPerformed
         setPolice();
    }//GEN-LAST:event_grasActionPerformed

    private void normalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalActionPerformed
        setPolice();
    }//GEN-LAST:event_normalActionPerformed

    private void policeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_policeTextActionPerformed
        setPolice();
    }//GEN-LAST:event_policeTextActionPerformed

    private void couleurRempliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_couleurRempliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_couleurRempliActionPerformed

    private void colorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorsActionPerformed

    private void clic_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clic_textActionPerformed
       zonedessin.setRefType(9);
    }//GEN-LAST:event_clic_textActionPerformed

    private void fondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fondActionPerformed
        //refFandokoagna.getRefCouleurBackground();
    }//GEN-LAST:event_fondActionPerformed

    private void effaceToutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_effaceToutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_effaceToutActionPerformed

    private void nouveauFichierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nouveauFichierActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_nouveauFichierActionPerformed

    private void fondPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fondPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_fondPropertyChange

    private void efacerToutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efacerToutActionPerformed
        // TODO add your handling code here:
        zonedessin.clear();
    }//GEN-LAST:event_efacerToutActionPerformed

    private void repeterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_repeterFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_repeterFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }
    

    public ZoneDessin getZonedessin() {
        return zonedessin;
    }

    public JButton getlargTaille_Text() {
        return largTaille_Text;
    }

    public JButton getRepeter() {
        return repeter;
    }

    public JButton getSaveDoc() {
        return saveDoc;
    }

    /**
     *
     * @return
     */
    public JButton getAnnuler() {
        return annuler;
    }

    public JToolBar getBarMenu() {
        return barMenu;
    }

    public JMenu getjMenu1() {
        return File;
    }

    public JMenu getjMenu2() {
        return effaceTout;
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public JButton getLoko() {
        return colors;
    }

    public JButton getPindeau() {
        return pinceau;
    }

    public JPanel getPanel_ambany() {
        return panel_ambany;
    }

    public JButton getBlanc() {
        return white;
    }

    public JButton getOpenDoc() {
        return openDoc;
    }

    public JButton getNewFile() {
        return newFile;
    }
    
     private void setPolice() {
        Font pol = new Font(policeText.getSelectedItem().toString(),
                gras.isSelected() ? Font.BOLD
                : (italique.isSelected() ? Font.ITALIC : Font.PLAIN),
                Integer.parseInt(tailleText.getSelectedItem().toString()));
                zonedessin.setPoliceF(pol);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ContoureCheck;
    private javax.swing.JMenu File;
    private javax.swing.JButton annuler;
    private javax.swing.JMenuItem annuler_Edit;
    private javax.swing.JButton arc;
    private javax.swing.JToolBar barMenu;
    private javax.swing.JButton black;
    private javax.swing.JButton blue;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton carre;
    private javax.swing.JButton clic_text;
    private javax.swing.JButton colors;
    private javax.swing.JButton couleurRempli;
    private javax.swing.JButton courbe;
    private javax.swing.JButton cyan;
    private javax.swing.JMenuItem efacerTout;
    private javax.swing.JMenu effaceTout;
    private javax.swing.JMenuItem enregistrerFichier;
    private javax.swing.JButton fond;
    private javax.swing.JRadioButton gras;
    private javax.swing.JButton gray;
    private javax.swing.JButton green;
    private javax.swing.JButton hexa;
    private javax.swing.JRadioButton italique;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JButton largTaille_Text;
    private javax.swing.JButton lightGray;
    private javax.swing.JButton ligne;
    private javax.swing.JButton losa;
    private javax.swing.JButton mangeta;
    private javax.swing.JButton newFile;
    private javax.swing.JRadioButton normal;
    private javax.swing.JMenuItem nouveauFichier;
    private javax.swing.JButton openDoc;
    private javax.swing.JButton orange;
    private javax.swing.JMenuItem ouvrirFichier;
    private javax.swing.JButton oval;
    private javax.swing.JPanel panel_Fond;
    private javax.swing.JPanel panel_FormeGeo;
    private javax.swing.JPanel panel_Texte;
    private javax.swing.JPanel panel_ambany;
    private javax.swing.JButton pinceau;
    private javax.swing.JButton pink;
    private javax.swing.JComboBox<String> policeText;
    private javax.swing.JMenuItem quitterFichier;
    private javax.swing.JButton rectangle;
    private javax.swing.JButton red;
    private javax.swing.JCheckBox remplisCheck;
    private javax.swing.JButton repeter;
    private javax.swing.JMenuItem repeter_Edit;
    private javax.swing.JButton saveDoc;
    private javax.swing.JComboBox<String> tailleText;
    private javax.swing.JButton triangl;
    private javax.swing.JButton trianglRect;
    private javax.swing.JButton white;
    private javax.swing.JButton yellow;
    // End of variables declaration//GEN-END:variables

}
