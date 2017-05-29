package vue;

import controleur.CtrlAbstrait;
import controleur.CtrlPraticiens;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Laetitia,Romain,Victor et Gaëtan
 */
public class VuePraticiens extends VueAbstraite
{
    DefaultComboBoxModel modeleJComboBoxPraticiens;


    /**
     * Créer une nouvelle vue praticiens
     */
    public VuePraticiens(CtrlAbstrait ctrl)         
    {
        // accès au controleur abstrait
        super(ctrl);
        // initialisation des composants
        initComponents();
        
        modeleJComboBoxPraticiens = new DefaultComboBoxModel();
        jComboBoxPraticiens.setModel(modeleJComboBoxPraticiens);
        
        
    // affiche un titre dans la barre
    this.setTitle("Praticiens");
    // modifie la taille de la fenêtre
    this.setSize(800, 700);
    //positionne la fenêtre au centre
    this.setBackground(Color.blue);
    this.setLocationRelativeTo(null);
    // permet de fermer l'application en cliquant sur la croix rouge
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    // Affiche la fenêtre
    this.setVisible(true);
    // false = empeche de modifier la taille de la fenetre =! true
    this.setResizable(false);
    // true = bloque la fenêtre au premier plan 
    this.setAlwaysOnTop(true);
    
    }
    
     public DefaultComboBoxModel getModeleJComboBoxPraticiens() 
    {
        return modeleJComboBoxPraticiens;
    }

    public void setModeleJComboBoxPraticiens(DefaultComboBoxModel modeleJComboBoxPraticiens) 
    {
        this.modeleJComboBoxPraticiens = modeleJComboBoxPraticiens;
    }
    
     public JComboBox getjComboBoxPraticiens()
    {
        return jComboBoxPraticiens;
    }

    public void setjComboBoxPraticiens(JComboBox jComboBoxVisiteur) 
    {
        this.jComboBoxPraticiens = jComboBoxPraticiens;
    }
    
    public JTextField getTxtAdrs()
    {
        return txtAdrs;
    }

    public void setTxtAdrs(JTextField txtAdrs) 
    {
        this.txtAdrs = txtAdrs;
    }

      public JTextField getTxtNum() 
    {
        return txtNum;
    }

    public void setTxtNum(JTextField txtNum)
    {
        this.txtNum = txtNum;
    }
    public JTextField getTxtNom() 
    {
        return txtNom;
    }

    public void setTxtNom(JTextField txtNom)
    {
        this.txtNom = txtNom;
    }

    public JTextField getTxtPrenom()
    {
        return txtPrenom;
    }

    public void setTxtPrenom(JTextField txtPrenom)
    {
        this.txtPrenom = txtPrenom;
    }

    public JTextField getTxtVille()
    {
        return txtVille;
    }

    public void setTxtVille(JTextField txtVille) 
    {
        this.txtVille = txtVille;
    }
     public JTextField getTxtCoef()
    {
        return txtCoef;
    }

    public void setTxtCoef(JTextField txtCoeff) 
    {
        this.txtCoef = txtCoeff;
    }
    
       public JTextField getTxtExercice()
    {
        return txtExercice;
    }

    public void setTxtExercice(JTextField txtExercice) 
    {
        this.txtExercice = txtExercice;
    }


    
    /**
     * Cette méthode est appelée depuis le constructeur pour initialiser le formulaire.
     * AVERTISSEMENT: NE PAS modifier ce code. Le contenu de cette méthode est toujours
     * Enregistré par l'éditeur de formulaire.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBoxPraticiens = new javax.swing.JComboBox<>();
        label1 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        txtNom = new javax.swing.JTextField();
        txtPrenom = new javax.swing.JTextField();
        txtAdrs = new javax.swing.JTextField();
        txtVille = new javax.swing.JTextField();
        txtCoef = new javax.swing.JTextField();
        txtExercice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtNum = new javax.swing.JTextField();
        label9 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setForeground(new java.awt.Color(0, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 700));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 600));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));

        jComboBoxPraticiens.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxPraticiens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPraticiensActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 255));
        label1.setText("Chercher");

        label3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 0, 255));
        label3.setText("Nom");

        label4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 0, 255));
        label4.setText("Prénom");

        label5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label5.setForeground(new java.awt.Color(0, 0, 255));
        label5.setText("Adresse");

        label6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 0, 255));
        label6.setText("Coeff notoriété");

        label7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label7.setForeground(new java.awt.Color(0, 0, 255));
        label7.setText("Ville");

        label8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label8.setForeground(new java.awt.Color(0, 0, 255));
        label8.setText("Lieu d'exercice");

        txtNom.setName("chNom"); // NOI18N
        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });

        txtPrenom.setName("chPrenom"); // NOI18N

        txtAdrs.setName("chAdresse"); // NOI18N

        txtVille.setName("chVille"); // NOI18N

        txtCoef.setName("chCoef"); // NOI18N
        txtCoef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCoefActionPerformed(evt);
            }
        });

        txtExercice.setName("chLieu"); // NOI18N
        txtExercice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExerciceActionPerformed(evt);
            }
        });

        jButton1.setText("Suivant");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuivantActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setText("Fermer");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitterActionPerformed(evt);
            }
        });

        jButton3.setText("Précédent");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrecedentActionPerformed(evt);
            }
        });

        txtNum.setName("chNom"); // NOI18N
        txtNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumActionPerformed(evt);
            }
        });

        label9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label9.setForeground(new java.awt.Color(0, 0, 255));
        label9.setText("Numéro");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jComboBoxPraticiens, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCoef, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdrs, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtExercice, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxPraticiens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCoef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExercice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        label6.getAccessibleContext().setAccessibleName("coef");
        label8.getAccessibleContext().setAccessibleName("Lieu");
        txtNom.getAccessibleContext().setAccessibleName("chNom");
        txtNom.getAccessibleContext().setAccessibleDescription("champs Nom");
        txtPrenom.getAccessibleContext().setAccessibleName("chPrenom");
        txtPrenom.getAccessibleContext().setAccessibleDescription("champ prenom");
        txtAdrs.getAccessibleContext().setAccessibleName("chAdresse");
        txtAdrs.getAccessibleContext().setAccessibleDescription("champ Adresse");
        txtVille.getAccessibleContext().setAccessibleName("chVille");
        txtVille.getAccessibleContext().setAccessibleDescription("champ Ville");
        txtCoef.getAccessibleContext().setAccessibleName("chCoef");
        txtCoef.getAccessibleContext().setAccessibleDescription("champ coef");
        txtExercice.getAccessibleContext().setAccessibleName("chLieu");
        txtExercice.getAccessibleContext().setAccessibleDescription("champ Lieu");

        jPanel1.add(jPanel2);
        jPanel2.setBounds(110, 120, 600, 460);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRATICIENS");
        jLabel1.setName("praticiens"); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(350, 40, 148, 31);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/18072521_1428479533862503_168616891_n.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 190, 100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //évènement sur la liste déroulante qui va chercher la méthode PraticiensSelectionner dans le controleur pour afficher les éléments de praticiens
    private void jComboBoxPraticiensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPraticiensActionPerformed
        ((CtrlPraticiens)controleur).PraticiensSelectionner();
    }//GEN-LAST:event_jComboBoxPraticiensActionPerformed
    //évènement qui va chercher la méthode PraticiensFermer dans le controleur pour quitter la vue praticiens
    private void jButtonQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitterActionPerformed
        ((CtrlPraticiens)controleur).PraticiensFermer();
    }//GEN-LAST:event_jButtonQuitterActionPerformed
    //évènement qui va chercher la méthode PraticiensPrecedent dans le controleur pour afficher le praticien précédent
    private void jButtonPrecedentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrecedentActionPerformed
       ((CtrlPraticiens)controleur).PraticiensPrecedent();
    }//GEN-LAST:event_jButtonPrecedentActionPerformed
    //évènement qui va chercher la méthode PraticiensSuivant dans le controleur pour afficher le praticien suivant
    private void jButtonSuivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuivantActionPerformed
        ((CtrlPraticiens)controleur).PraticiensSuivant();
    }//GEN-LAST:event_jButtonSuivantActionPerformed

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

    private void txtNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumActionPerformed

    private void txtExerciceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExerciceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExerciceActionPerformed

    private void txtCoefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCoefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCoefActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBoxPraticiens;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Label label1;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JTextField txtAdrs;
    private javax.swing.JTextField txtCoef;
    private javax.swing.JTextField txtExercice;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtPrenom;
    private javax.swing.JTextField txtVille;
    // End of variables declaration//GEN-END:variables
}
