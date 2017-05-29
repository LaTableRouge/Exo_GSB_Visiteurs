package vue;

import controleur.CtrlAbstrait;
import controleur.CtrlVisiteur;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
/**
 *
 * @author Laetitia,Romain,Victor et Gaëtan
 */
public class VueVisiteur extends VueAbstraite
{
    
    DefaultComboBoxModel modeleJComboBoxVisiteur;
    DefaultComboBoxModel modeleJComboBoxLabo;
    DefaultComboBoxModel modeleJComboBoxSecteur;

    /**
     * Creates new form VueVisiteurs
     */
    public VueVisiteur(CtrlAbstrait ctrl) 
    {  
        // accès au controleur abstrait
        super(ctrl);
        // initialisation des composants
        initComponents();
        modeleJComboBoxVisiteur = new DefaultComboBoxModel();
        modeleJComboBoxLabo = new DefaultComboBoxModel();
        modeleJComboBoxSecteur = new DefaultComboBoxModel();
        jComboBoxVisiteur.setModel(modeleJComboBoxVisiteur);
        jComboBoxLabo.setModel(modeleJComboBoxLabo);
        jComboBoxSecteur.setModel(modeleJComboBoxSecteur);
        
    // affiche un titre dans la barre
    this.setTitle("Visiteurs");
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
    
    public DefaultComboBoxModel getModeleJComboBoxLabo() 
    {
        return modeleJComboBoxLabo;
    }

    public void setModeleJComboBoxLabo(DefaultComboBoxModel modeleJComboBoxLabo)
    {
        this.modeleJComboBoxLabo = modeleJComboBoxLabo;
    }

    public DefaultComboBoxModel getModeleJComboBoxSecteur() 
    {
        return modeleJComboBoxSecteur;
    }

    public void setModeleJComboBoxSecteur(DefaultComboBoxModel modeleJComboBoxSecteur) 
    {
        this.modeleJComboBoxSecteur = modeleJComboBoxSecteur;
    }
    

    public DefaultComboBoxModel getModeleJComboBoxVisiteur()
    {
        return modeleJComboBoxVisiteur;
    }

    public void setModeleJComboBoxVisiteur(DefaultComboBoxModel modeleJComboBoxVisiteur) 
    {
        this.modeleJComboBoxVisiteur = modeleJComboBoxVisiteur;
    }

    public JComboBox getjComboBoxVisiteur() 
    {
        return jComboBoxVisiteur;
    }

    public void setjComboBoxVisiteur(JComboBox jComboBoxVisiteur) 
    {
        this.jComboBoxVisiteur = jComboBoxVisiteur;
    }

    public JComboBox getCbLabo() 
    {
        return jComboBoxLabo;
    }

    public void setCbLabo(JComboBox cbLabo)
    {
        this.jComboBoxLabo = cbLabo;
    }

    public JComboBox getCbSecteur() 
    {
        return jComboBoxSecteur;
    }

    public void setCbSecteur(JComboBox cbSecteur)
    {
        this.jComboBoxSecteur = cbSecteur;
    }

    public JTextField getTxtAdrs()
    {
        return txtAdrs;
    }

    public void setTxtAdrs(JTextField txtAdrs) 
    {
        this.txtAdrs = txtAdrs;
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
        jComboBoxVisiteur = new javax.swing.JComboBox<>();
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
        jButtonSuivant = new javax.swing.JButton();
        jButtonQuitter = new javax.swing.JButton();
        jComboBoxSecteur = new javax.swing.JComboBox<>();
        jComboBoxLabo = new javax.swing.JComboBox<>();
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

        jComboBoxVisiteur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxVisiteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVisiteurActionPerformed(evt);
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
        label6.setName(""); // NOI18N
        label6.setText("Secteur");

        label7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label7.setForeground(new java.awt.Color(0, 0, 255));
        label7.setText("Ville");

        label8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label8.setForeground(new java.awt.Color(0, 0, 255));
        label8.setText("Labo");

        txtNom.setName("chNom"); // NOI18N
        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });

        txtPrenom.setName("chPrenom"); // NOI18N

        txtAdrs.setName("chAdresse"); // NOI18N

        txtVille.setName("chVille"); // NOI18N

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

        jComboBoxSecteur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxSecteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSecteurActionPerformed(evt);
            }
        });

        jComboBoxLabo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxLabo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLaboActionPerformed(evt);
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
                        .addGap(79, 79, 79)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jComboBoxVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAdrs, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButtonPrecedent, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonSuivant, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)))
                                .addGap(78, 78, 78)
                                .addComponent(jButtonQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBoxSecteur, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxLabo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxSecteur))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxLabo))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSuivant)
                    .addComponent(jButtonQuitter)
                    .addComponent(jButtonPrecedent))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(90, 120, 610, 470);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VISITEURS");
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
    //évènement sur la liste déroulante qui va chercher la méthode visiteurSelectionner dans le controleur pour afficher les éléments de visiteur
    private void jComboBoxVisiteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVisiteurActionPerformed
        ((CtrlVisiteur)controleur).visiteurSelectionner();
    }//GEN-LAST:event_jComboBoxVisiteurActionPerformed
    //évènement qui va chercher la méthode visiteurFermer dans le controleur pour quitter la vue visiteur
    private void jButtonQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitterActionPerformed
        ((CtrlVisiteur)controleur).visiteurFermer();
    }//GEN-LAST:event_jButtonQuitterActionPerformed
    
    private void jComboBoxSecteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSecteurActionPerformed
     
    }//GEN-LAST:event_jComboBoxSecteurActionPerformed
    
    private void jComboBoxLaboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLaboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLaboActionPerformed

    private void jButtonSuivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuivantActionPerformed
        ((CtrlVisiteur)controleur).visiteurSuivant();
    }//GEN-LAST:event_jButtonSuivantActionPerformed

    private void jButtonPrecedentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrecedentActionPerformed
        ((CtrlVisiteur)controleur).visiteurPrecedent();
    }//GEN-LAST:event_jButtonPrecedentActionPerformed

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPrecedent;
    private javax.swing.JButton jButtonQuitter;
    private javax.swing.JButton jButtonSuivant;
    private javax.swing.JComboBox<String> jComboBoxLabo;
    private javax.swing.JComboBox<String> jComboBoxSecteur;
    private javax.swing.JComboBox<String> jComboBoxVisiteur;
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
    private javax.swing.JTextField txtAdrs;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPrenom;
    private javax.swing.JTextField txtVille;
    // End of variables declaration//GEN-END:variables
}
