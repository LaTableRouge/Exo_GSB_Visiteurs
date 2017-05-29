package controleur;

import javax.swing.JOptionPane;
import vue.VueMenu;

/**
 * Contrôleur de la fenêtre VueMenu
 * @author Laetitia,Romain,Victor et Gaëtan
 * @version 2.0
 */

public class CtrlMenu extends CtrlAbstrait 
{

    public CtrlMenu(CtrlPrincipal ctrlPrincipal) 
    {
        super(ctrlPrincipal);
        vue = new VueMenu(this);
        
    }
    
 

    /**
     * menuQuitter réaction au clic sur le bouton Fermer de la vueMenu 
     * Le contrôle est rendu au contrôleur frontal
     */
    public void menuQuitter()
    {
        // Confirmer avant de quitter
        int rep = JOptionPane.showConfirmDialog(getVue(), "Se déconnecter\nEtes-vous sûr(e) ?", "GSB", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (rep == JOptionPane.YES_OPTION) 
        {
             
            // Retourner à la vue identification
            this.getCtrlPrincipal().action(EnumAction.ACCUEIL_FERMER);
        }
    }

    
    /*clic sur le bouton Comptes Rendus de la vue Principale Le contrôleur délègue
        l'action au contrôleur frontal
    */
    public void menuRapportsVisite() 
    {
        this.getCtrlPrincipal().action(EnumAction.MENU_RAPPORTSVISITE);
    }
    
    /*clic sur le bouton Visiteur de la vue Principale Le contrôleur délègue
        l'action au contrôleur frontal
    */
    public void menuVisiteur()
    {
        this.getCtrlPrincipal().action(EnumAction.MENU_VISITEUR);
    }
       
    /*clic sur le bouton Praticiens de la vue Principale Le contrôleur délègue
        l'action au contrôleur frontal
    */
    public void menuPraticiens()
    {
        this.getCtrlPrincipal().action(EnumAction.MENU_PRATICIENS);
    }
    
    /*clic sur le bouton Medicament de la vue Principale Le contrôleur délègue
        l'action au contrôleur frontal
    */
    public void menuMedicament()
    {
        this.getCtrlPrincipal().action(EnumAction.MENU_MEDICAMENT);
    }
    
 

    @Override
    public VueMenu getVue() 
    {
        return (VueMenu) vue;
    }
}
