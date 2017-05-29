package vue;

import java.awt.Color;
import javax.swing.JFrame;
import controleur.CtrlAbstrait;
import controleur.CtrlId;
import controleur.EnumAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import modele.dao.DaoException;

/**
 *
 * @author Laetitia,Romain,Victor et Gaëtan
 */
public class VueId extends VueAbstraite
{

    /**
     * Créer une nouvelle vue menu
     */
    public VueId(CtrlAbstrait ctrl) 
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
    
    public String getTxtLogin()
    {
        return txtLogin.getText();
    }

    public void setTxtLogin(JTextField txtLogin) 
    {
        this.txtLogin = txtLogin;
    }
    
    public String getTxtMdp()
    {
        return String.valueOf(txtMdp.getPassword());
    }

    public void setTxtMdp(JPasswordField txtMdp) 
    {
        this.txtMdp = txtMdp;
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
        btnValider = new javax.swing.JButton();
        btnQuitter = new javax.swing.JButton();
        txtLogin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMdp = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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

        btnValider.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnValider.setText("Valider");
        btnValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValiderActionPerformed(evt);
            }
        });

        btnQuitter.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnQuitter.setText("Quitter");
        btnQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitterActionPerformed(evt);
            }
        });

        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Identifiez-vous");
        jLabel3.setName("praticiens"); // NOI18N

        txtMdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMdpActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Identifiant");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Mot de passe");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnValider, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(341, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addComponent(btnValider, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(100, 160, 610, 330);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("IDENTIFICATION");
        jLabel1.setName("praticiens"); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(250, 50, 300, 30);

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
        ((CtrlId)controleur).menuQuitter();
    }//GEN-LAST:event_btnQuitterActionPerformed

   //évènement sur le bouton medicament qui va chercher la méthode menuMedicament dans le controleur pour afficher la vue medicament
    private void btnValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValiderActionPerformed
        try 
        {
            if (((CtrlId)controleur).menuAccueil()!= null) 
            {
                controleur.getCtrlPrincipal().setVisiteurConnecter(((CtrlId)controleur).menuAccueil());   
                controleur.getCtrlPrincipal().action(EnumAction.ID_FERMER);
                int rep = JOptionPane.showConfirmDialog(VueId.this, "Vous êtes connecté(e) !", "GSB", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                 JOptionPane.showConfirmDialog(VueId.this, "Login ou mot de passe incorrect, renseignez un login et un mot de passe correct", "GSB", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        catch (DaoException ex)   
        {
            Logger.getLogger(VueId.class.getName()).log(Level.SEVERE, null, ex);        
        }
    }//GEN-LAST:event_btnValiderActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void txtMdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMdpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMdpActionPerformed

  public static void main(String args[]) 
    {
        /* Réglez l'aspect et le fonctionnement de Nimbus */
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
            java.util.logging.Logger.getLogger(VueMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VueMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VueMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VueMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Créer et affiche le formulaire */

    }          
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuitter;
    private javax.swing.JButton btnValider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtMdp;
    // End of variables declaration//GEN-END:variables
    
}
