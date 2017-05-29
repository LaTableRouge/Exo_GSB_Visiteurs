package controleur;

import static controleur.EnumAction.*;
import javax.swing.JOptionPane;
import modele.jdbc.Jdbc;
import modele.metier.Visiteur;

/**
 * Controleur principal (ou frontal) - un lien vers chaque contrôleur de base
 *
 * @author Laetitia,Romain,Victor et Gaëtan
 * @version 2.0
 */
// les contôleurs de chaque vue viennent se positionner ici (class(super))
//Tous les controleurs sont instancié de cette classe
//le contrôleur principal permet de hiérarchiser les ordres à effectuer de l'application 
public class CtrlPrincipal 
{
    private Visiteur visiteurConnecte;
    
    private CtrlId ctrlId = null;
    private CtrlMenu ctrlMenu = null;
    private CtrlRapportsVisite ctrlRapportsVisite = null;
    private CtrlVisiteur ctrlVisiteur = null;
    private CtrlPraticiens ctrlPraticiens = null;
    private CtrlMedicament ctrlMedicament = null;
   

    //action par défaut action au démarrage de l'application 
    //ici demande d'authentification
    public void action() 
    {
        if (ctrlId == null) 
        {
            ctrlId = new CtrlId(this);
        }
        //Enabled = True 
        //fait en sorte de pouvoir interagir avec la vue
        ctrlId.getVue().setEnabled(true);
        //Visible = True fait en sorte que la vue soit visible
        ctrlId.getVue().setVisible(true);
    }

    public void action(EnumAction action) 
    {
        switch (action) 
        {
            case MENU_ID:               // L'application se lance nous sommes sur vueId
                menuId();
            case ID_FERMER:             // Fermeture de vueId
                idFermer();
                break;
            case MENU_ACCUEIL:          // activation de vueMenu depuis vueId
                menuAccueil();
                break;
            case ACCUEIL_FERMER:        // retour à vueId depuis vueMenu
                accueilFermer();
                break;
            case MENU_VISITEUR:         // activation de vueVisiteur depuis vueMenu
                menuVisiteur();
                break;
            case VISITEUR_FERMER:       // retour à vueMenu depuis la vueVisiteur
                visiteurFermer();
                break;
            case MENU_RAPPORTSVISITE:   // activation de RapportsVisite depuis vueMenu
                menuRapportsVisite();
                break;
            case RAPPORTSVISITE_FERMER: // retour à VueMenu depuis la VueRapportsVisite
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
            case MENU_QUITTER:          // déconnexion depuis vueMenu
                menuQuitter();
                break;
        }
    }

    /**
     * Fin définitive de l'application La demande de confirmation est gérée par
     * le contrôleur spécialisé
     */
    //utilisation de try catch pour la gestion d'erreur
    private void menuQuitter() 
    {
        try 
        {
            Jdbc.getInstance().deconnecter();
        } 
        
        //Si ne se déconnecte pas, vas fermer la connexion avec la BDD
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "CtrlPrincipal - fermeture connexion BD", JOptionPane.ERROR_MESSAGE);
        } 
        
        //Si ni le try et le catch ne marche pas ça quitte l'application
        finally 
        {
            System.exit(0);
        }
    }
    
    
     private void menuId() 
    {
        if (ctrlId == null) 
        {
            ctrlId = new CtrlId(this);
        }
       
        // vueId est une fenêtre modale :
        // -> vueId est affichée
        
        //Enabled = false afin que la vueMenu en arrière plan ne soit pas active durant le choix de quitter
        ctrlMenu.getVue().setEnabled(false);
        ctrlId.getVue().setVisible(true);
    }
     
    private void idFermer() 
    {
        if (ctrlMenu == null) 
        {
            ctrlMenu = new CtrlMenu(this);
        }
        ctrlId.getVue().setVisible(false);
        ctrlId.getVue().dispose();
        ctrlMenu.getVue().setEnabled(true);
        ctrlMenu.getVue().setVisible(true);
    }
    
    private void menuAccueil() 
    {
        if (ctrlMenu == null) 
        {
            ctrlMenu = new CtrlMenu(this);
        }
       
        // vueMenu est une fenêtre modale :
        // -> vueId n'est pas visible et n'est pas active
        ctrlId.getVue().setEnabled(false);
        ctrlId.getVue().setVisible(false);
        ctrlMenu.getVue().setVisible(true);
    }
       
    //Transition vueMenu -> vueId
    private void accueilFermer()
    {
        if (ctrlId == null) 
        {
            ctrlId = new CtrlId(this);
        }
        //ctrlMenu.getVue().setVisible(true); 
        //dans le cas ou plusieurs fenêtres sont à ouvrir en même temps
        ctrlMenu.getVue().setVisible(false);
        ctrlId.getVue().setEnabled(true);
        ctrlId.getVue().setVisible(true);
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
            // si à ce moment le contrôleur et sa vue existent déjà
            // il faut rafraîchir le contenu à partir de la base de données -> actualisation de la vue
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
            // si à ce moment le contrôleur et sa vue existent déjà
            // il faut rafraîchir le contenu à partir de la base de données -> actualisation de la vue
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
   
     
    /* A parti d'ici Nous allons gérer la transition entre les vues 
      (Visiteur, Praticiens etc..) vers la vue Menu principale.
    */
    
     //Transition vueRapportsVisite -> vueMenu
    private void RapportsVisiteFermer()
    {
        if (ctrlMenu == null) 
        {
            ctrlMenu = new CtrlMenu(this);
        }
        ctrlRapportsVisite.getVue().setVisible(false);
        ctrlMenu.getVue().setEnabled(true);
        ctrlMenu.getVue().setVisible(true);
    }
    
    /**
     * Transition vueVisiteur / vueMenu
     */
    private void visiteurFermer() 
    {
        if (ctrlMenu == null) 
        {
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
    
    public void setVisiteurConnecter(Visiteur visiteur)
    {
       visiteurConnecte = visiteur;
    }
    //retourne le visiteur connecté
    public Visiteur getVisiteurConnecte() 
    {
        return visiteurConnecte;
    }
}
