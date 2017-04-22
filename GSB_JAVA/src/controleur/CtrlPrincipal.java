package controleur;

import static controleur.EnumAction.*;
import javax.swing.JOptionPane;
import modele.jdbc.Jdbc;

/**
 * Controleur principal (ou frontal) - un lien vers chaque contrôleur de base
 *
 * @author bts
 * @version 2.0
 */
// les contôleurs de chaque vue viennent se positionner ici (class(super)).
//le contrôleur proncipal permet de hiérarchiser les ordres à effectuer de l'application 
public class CtrlPrincipal 
{

    private CtrlMenu ctrlMenu = null;
    private CtrlRapportsVisite ctrlRapportsVisite = null;
    private CtrlVisiteur ctrlVisiteur = null;
    private CtrlPraticiens ctrlPraticiens = null;
    private CtrlMedicament ctrlMedicament = null;
   

    //action par défaut action au démarrage de l'application 
    public void action() 
    {
        if (ctrlMenu == null) 
        {
            ctrlMenu = new CtrlMenu(this);
        }
        ctrlMenu.getVue().setEnabled(true);
        ctrlMenu.getVue().setVisible(true);
    }

    public void action(EnumAction action) {
        switch (action) {
            case MENU_VISITEUR:         // activation de vueVisiteur depuis vueMenu
                menuVisiteur();
                break;
            case VISITEUR_FERMER:       // retour à vueMenu depuis la vueVisiteur
                visiteurFermer();
                break;
            case MENU_RAPPORTSVISITE:   // activation de RapportsVisite depuis vueMenu
                menuRapportsVisite();
                break;
            case RAPPORTSVISITE_FERMER: //retour à VueMenu depuis la VueRapportsVisite
                RapportsVisiteFermer();
                break;
            case MENU_PRATICIENS:       // activation de Praticiens depuis vueMenu
                menuPraticiens();
                break;
            case PRATICIENS_FERMER:     // retour à VueMenu depuis la vuePraticiens
                PraticiensFermer();
                break;
            case MENU_MEDICAMENT:       // activation de Medicament depuis vueMenu
                menuMedicament();
                break;
            case MEDICAMENT_FERMER:     // retour à VueMenu depuis la vueMedicament
                MedicamentFermer();
                break;
            case MENU_QUITTER: // fin de l'application depuis vueMenu
                menuQuitter();
                break;
        }
    }

    /**
     * Fin définitive de l'application La demande de confirmation est gérée par
     * le contrôleur spécialisé
     */
    private void menuQuitter() 
    {
        
        try 
        {
            Jdbc.getInstance().deconnecter();
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "CtrlPrincipal - fermeture connexion BD", JOptionPane.ERROR_MESSAGE);
        } 
        finally 
        {
            System.exit(0);
        }
    }
    
      //Transition vueMenu -> vueRapportsVisite
     private void menuRapportsVisite() 
     {
        if (ctrlRapportsVisite == null) 
        {
            ctrlRapportsVisite = new CtrlRapportsVisite(this);
        } 
        else 
        {
            // si la le contrôleur et sa vue existent déjà
            // il faut rafraîchir le contenu à partir de la base de données
            ctrlRapportsVisite.actualiser();
        }
        // vueRapportsVisite est une fenêtre modale :
        // -> vueMenu reste visible, mais n'est pas active
        ctrlMenu.getVue().setEnabled(false);
        ctrlRapportsVisite.getVue().setVisible(true);
    }

    /**
     * Transition vueMenu -> vueVisiteur
     */
    private void menuVisiteur() 
    {
        if (ctrlVisiteur == null) 
        {
            ctrlVisiteur = new CtrlVisiteur(this);
        }
        else 
        {
            // si la le contrôleur et sa vue existent déjà
            // il faut rafraîchir le contenu à partir de la base de données
            ctrlVisiteur.actualiser();
        }
        // vueVisiteur est une fenêtre modale :
        // -> vueMenu reste visible, mais n'est pas active
        ctrlMenu.getVue().setEnabled(false);
        ctrlVisiteur.getVue().setVisible(true);
    }
    

    /**
     * Transition vueMenu -> vuePraticiens
     */
    private void menuPraticiens()
    {
        if (ctrlPraticiens == null) 
        {
            ctrlPraticiens = new CtrlPraticiens(this);
        } 
        else 
        {
            // si la le contrôleur et sa vue existent déjà
            // il faut rafraîchir le contenu à partir de la base de données
            ctrlPraticiens.actualiser();
        }
        // vuePraticiens est une fenêtre modale :
        // -> vueMenu reste visible, mais n'est pas active
        ctrlMenu.getVue().setEnabled(false);
        ctrlPraticiens.getVue().setVisible(true);
    }
    
    //Transition vueMenu -> vueMedicament
    private void menuMedicament()
    {
        if (ctrlMedicament == null) 
        {
            ctrlMedicament = new CtrlMedicament(this);
        } 
        else 
        {
            // si la le contrôleur et sa vue existent déjà
            // il faut rafraîchir le contenu à partir de la base de données
            ctrlMedicament.actualiser();
        }
        // vueMedicament est une fenêtre modale :
        // -> vueMenu reste visible, mais n'est pas active
        ctrlMenu.getVue().setEnabled(false);
        ctrlMedicament.getVue().setVisible(true);
    }
   
    /* A parti d'ici Nous allons gérer la transition entre les  vues 
      (Visiteur, Praticiens etc..) vers la vue Menu principale.
    */
    
     //Transition vueRapportsVisite -> vueMenu
    private void RapportsVisiteFermer(){
        if (ctrlMenu == null) {
            ctrlMenu = new CtrlMenu(this);
        }
        ctrlRapportsVisite.getVue().setVisible(false);
        ctrlMenu.getVue().setEnabled(true);
        ctrlMenu.getVue().setVisible(true);
    }
    
    /**
     * Transition vueVisiteur / vueMenu
     */
    private void visiteurFermer() {
        if (ctrlMenu == null) {
            ctrlMenu = new CtrlMenu(this);
        }
        ctrlVisiteur.getVue().setVisible(false);
        ctrlMenu.getVue().setEnabled(true);
        ctrlMenu.getVue().setVisible(true);
    }
    
    //Transition vuePraticiens -> vueMenu
    private void PraticiensFermer()
    {
        if (ctrlMenu == null) 
        {
            ctrlMenu = new CtrlMenu(this);
        }
        ctrlPraticiens.getVue().setVisible(false);
        ctrlMenu.getVue().setEnabled(true);
        ctrlMenu.getVue().setVisible(true);
    }
    
    //Transition vueMedicament -> vueMenu
    private void MedicamentFermer()
      {
        if (ctrlMenu == null) 
        {
            ctrlMenu = new CtrlMenu(this);
        }
        ctrlMedicament.getVue().setVisible(false);
        ctrlMenu.getVue().setEnabled(true);
        ctrlMenu.getVue().setVisible(true);
    }
    
     
   
}
