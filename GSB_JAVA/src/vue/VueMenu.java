package vue;

import java.awt.Color;
import javax.swing.JFrame;
import controleur.CtrlAbstrait;
import controleur.CtrlMenu;

/**
 *
 * @author Laetitia,Romain,Victor et Gaëtan
 */
public class VueMenu extends VueAbstraite
{

    /**
     * Créer une nouvelle vue menu
     */
    public VueMenu(CtrlAbstrait ctrl) 
    {
        // accès au controleur abstrait
        super(ctrl);
        
        // initialisation des composants
        initComponents();

        // affiche un titre dans la barre
        this.setTitle("Gestion des comptes rendus");
        // modifie la taille de la fenêtre
        this.setSize(800, 600);
        //positionne la fenêtre au centre
        this.setBackground(Color.blue);
        this.setLocationRelativeTo(null);
        // permet de fermer l'application en cliquant sur la croix rouge
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Affiche la fenêtre
        this.setVisible(true);
        // false = empeche de modifier la taille de la fenetre =! true
        this.setResizable(false);
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
        btnComptes = new javax.swing.JButton();
        btnVisiteur = new javax.swing.JButton();
        btnPraticiens = new javax.swing.JButton();
        btnMedicament = new javax.swing.JButton();
        btnQuitter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setForeground(new java.awt.Color(0, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 600));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));

        btnComptes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnComptes.setText("Comptes rendus");
        btnComptes.setEnabled(false);
        btnComptes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComptesActionPerformed(evt);
            }
        });

        btnVisiteur.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVisiteur.setText("Visiteurs");
        btnVisiteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisiteurActionPerformed(evt);
            }
        });

        btnPraticiens.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPraticiens.setText("Praticiens");
        btnPraticiens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPraticiensActionPerformed(evt);
            }
        });

        btnMedicament.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMedicament.setText("Médicaments");
        btnMedicament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicamentActionPerformed(evt);
            }
        });

        btnQuitter.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnQuitter.setText("Déconnexion");
        btnQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPraticiens, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComptes, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnComptes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPraticiens, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(100, 160, 613, 350);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GESTION DES COMPTES RENDUS");
        jLabel1.setName("praticiens"); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(260, 50, 300, 31);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //évènement sur le bouton déconnexion qui va chercher la méthode menuQuitter dans le controleur pour quitter la vue Menu
    private void btnQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitterActionPerformed
        ((CtrlMenu)controleur).menuQuitter();
    }//GEN-LAST:event_btnQuitterActionPerformed

   //évènement sur le bouton medicament qui va chercher la méthode menuMedicament dans le controleur pour afficher la vue medicament
    private void btnMedicamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicamentActionPerformed
        ((CtrlMenu)controleur).menuMedicament();
    }//GEN-LAST:event_btnMedicamentActionPerformed

    private void btnPraticiensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPraticiensActionPerformed
        ((CtrlMenu)controleur).menuPraticiens();
    }//GEN-LAST:event_btnPraticiensActionPerformed

    private void btnVisiteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisiteurActionPerformed
        ((CtrlMenu)controleur).menuVisiteur();
    }//GEN-LAST:event_btnVisiteurActionPerformed
               
    private void btnComptesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComptesActionPerformed
        ((CtrlMenu)controleur).menuRapportsVisite();
    }//GEN-LAST:event_btnComptesActionPerformed

               

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComptes;
    private javax.swing.JButton btnMedicament;
    private javax.swing.JButton btnPraticiens;
    private javax.swing.JButton btnQuitter;
    private javax.swing.JButton btnVisiteur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    
}
