
package vue;

import controleur.CtrlAbstrait;
import controleur.CtrlMedicament;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Gaëtan
 */
public class VueMedicament extends VueAbstraite
{
    DefaultComboBoxModel modeleJComboBoxMedicament;
    /**
     * Créer une nouvelle forme medicament
     */
    public VueMedicament(CtrlAbstrait ctrl)         
    {
        // accès au controleur abstrait
        super(ctrl);
        // initialisation des composants
        initComponents();
        
        modeleJComboBoxMedicament = new DefaultComboBoxModel();
        jComboBoxMedicament.setModel(modeleJComboBoxMedicament);
        
        
    // affiche un titre dans la barre
    this.setTitle("Medicament");
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

     
    
    public DefaultComboBoxModel getModeleJComboBoxMedicament() 
    {
        return modeleJComboBoxMedicament;
    }

    public void setModeleJComboBoxMedicament(DefaultComboBoxModel modeleJComboBoxMedicament) 
    {
        this.modeleJComboBoxMedicament = modeleJComboBoxMedicament;
    }
    
     public JComboBox getjComboBoxMedicament() 
    {
        return jComboBoxMedicament;
    }

    public void setjComboBoxMedicament(JComboBox jComboMedicament) 
    {
        this.jComboBoxMedicament = jComboBoxMedicament;
    }
    
     
    //le contôleur envoi les informations reçu par la requète faite en base de données (DaoMedicament) à toutes les variables.
    public JTextField getTxtCode() 
    {
        return txtCode;
    }

    public void setTxtCode(JTextField txtCode) 
    {
        this.txtCode = txtCode;
    }
 
    public JTextField getTxtNomCommercial()
    {
        return txtNomCommercial;
    }

    public void setTxtNomCommercial(JTextField txtNomCommercial) 
    {
        this.txtNomCommercial = txtNomCommercial;
    }

    public JTextField getTxtComposition()
    {
        return txtComposition;
    }

    public void setTxtComposition(JTextField txtComposition) 
    {
        this.txtComposition = txtComposition;
    }

    public JTextField getTxtEffets() 
    {
        return txtEffets;
    }

    public void setTxtEffets(JTextField txtEffets)
    {
        this.txtEffets = txtEffets;
    }

    public JTextField getTxtContreIndic()
    {
        return txtContreIndic;
    }

    public void setTxtContreIndic(JTextField txtContreIndic) 
    {
        this.txtContreIndic = txtContreIndic;
    }
    
    public JTextField getTxtPrix() 
    {
        return txtPrix;
    }

    public void setTxtPrix(JTextField txtPrix) 
    {
        this.txtPrix = txtPrix;
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
        jComboBoxMedicament = new javax.swing.JComboBox<>();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        txtCode = new javax.swing.JTextField();
        txtNomCommercial = new javax.swing.JTextField();
        txtComposition = new javax.swing.JTextField();
        txtEffets = new javax.swing.JTextField();
        txtContreIndic = new javax.swing.JTextField();
        txtPrix = new javax.swing.JTextField();
        jButtonSuivant = new javax.swing.JButton();
        jButtonQuitter = new javax.swing.JButton();
        jButtonPrecedent = new javax.swing.JButton();
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

        jComboBoxMedicament.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxMedicament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMedicamentActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 255));
        label1.setText("Chercher");

        label2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 0, 255));
        label2.setText("Famille");

        label3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 0, 255));
        label3.setText("Nom Commercial");

        label5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label5.setForeground(new java.awt.Color(0, 0, 255));
        label5.setText("Composition");

        label6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 0, 255));
        label6.setText("Contre indications");

        label7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label7.setForeground(new java.awt.Color(0, 0, 255));
        label7.setText("Effets indérisables");

        label8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label8.setForeground(new java.awt.Color(0, 0, 255));
        label8.setText("Prix d'échantillon");

        txtCode.setName("chNum"); // NOI18N

        txtNomCommercial.setName("chNom"); // NOI18N

        txtComposition.setName("chAdresse"); // NOI18N

        txtEffets.setName("chVille"); // NOI18N

        txtContreIndic.setName("chCoef"); // NOI18N

        txtPrix.setName("chLieu"); // NOI18N

        jButtonSuivant.setText("Suivant");
        jButtonSuivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuivantActionPerformed(evt);
            }
        });

        jButtonQuitter.setBackground(new java.awt.Color(102, 102, 102));
        jButtonQuitter.setText("Fermer");
        jButtonQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitterActionPerformed(evt);
            }
        });

        jButtonPrecedent.setText("Précédent");
        jButtonPrecedent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrecedentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonPrecedent, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonSuivant, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonQuitter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtPrix, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContreIndic, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEffets, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComposition, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomCommercial, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jComboBoxMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(370, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomCommercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComposition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEffets, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContreIndic, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSuivant)
                    .addComponent(jButtonQuitter)
                    .addComponent(jButtonPrecedent))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(187, 98, 800, 620);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MEDICAMENTS");
        jLabel1.setName("praticiens"); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(410, 50, 148, 31);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/18072521_1428479533862503_168616891_n.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 190, 100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //évènement sur la liste déroulante qui va chercher la méthode MedicamentSelectionner dans le controleur pour afficher les éléments de medicament
    private void jComboBoxMedicamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMedicamentActionPerformed
       ((CtrlMedicament)controleur).MedicamentSelectionner();
    }//GEN-LAST:event_jComboBoxMedicamentActionPerformed
    //évènement qui va chercher la méthode MedicamentFermer dans le controleur pour quitter la vue medicament
    private void jButtonQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitterActionPerformed
        ((CtrlMedicament)controleur).MedicamentFermer();
    }//GEN-LAST:event_jButtonQuitterActionPerformed
    //évènement qui va chercher la méthode MedicamentSuivant dans le controleur pour afficher le medicament suivant
    private void jButtonSuivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuivantActionPerformed
        ((CtrlMedicament)controleur).MedicamentSuivant();        
    }//GEN-LAST:event_jButtonSuivantActionPerformed
    //évènement qui va chercher la méthode MedicamentPrecedent dans le controleur pour afficher le medicament précédent
    private void jButtonPrecedentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrecedentActionPerformed
        ((CtrlMedicament)controleur).MedicamentPrecedent();
    }//GEN-LAST:event_jButtonPrecedentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPrecedent;
    private javax.swing.JButton jButtonQuitter;
    private javax.swing.JButton jButtonSuivant;
    private javax.swing.JComboBox<String> jComboBoxMedicament;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtComposition;
    private javax.swing.JTextField txtContreIndic;
    private javax.swing.JTextField txtEffets;
    private javax.swing.JTextField txtNomCommercial;
    private javax.swing.JTextField txtPrix;
    // End of variables declaration//GEN-END:variables
}
