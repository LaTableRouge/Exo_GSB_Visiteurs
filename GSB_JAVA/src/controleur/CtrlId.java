package controleur;


import javax.swing.JOptionPane;
import modele.dao.DaoException;
import modele.dao.DaoVisiteur;
import modele.metier.Visiteur;
import vue.VueId;



/**
 * Contrôleur de la fenêtre VueId
 * @author Gaëtan
 * @version 2.0
 */
public class CtrlId extends CtrlAbstrait
{
     
    private DaoVisiteur daoVisiteur = new DaoVisiteur();
    
    public CtrlId(CtrlPrincipal ctrlPrincipal) 
    {
        super(ctrlPrincipal);
        vue = new VueId(this);
    }
    
     /**
     * clic sur le bouton Quitter de la vue Identification Le contrôleur délègue
     * l'action au contrôleur frontal
     */
    public void menuQuitter()
    {
        // Confirmer avant de quitter
        int rep = JOptionPane.showConfirmDialog(getVue(), "Quitter l'application\nEtes-vous sûr(e) ?", "GSB", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (rep == JOptionPane.YES_OPTION) 
        {
            // mettre fin à l'application
            this.getCtrlPrincipal().action(EnumAction.MENU_QUITTER);
        }
    }
      /**
     * clic sur le bouton Valider de la vue Identification Le contrôleur délègue
     * l'action au contrôleur frontal
     */
    public Visiteur menuAccueil() throws DaoException 
    { 
        Visiteur visiteur;
        //visiteur prend la valeur des méthodes getConnexion et getVue du dao
        visiteur = daoVisiteur.getConnexion(getVue().getTxtLogin(), getVue().getTxtMdp());
        
        //visiteur = daoVisiteur.getConnexion("Bioret","21031997");
        
        //return visiteur != null;
        
        return visiteur;
    }
    
    
     @Override
    public VueId getVue() 
    {
        return (VueId) vue;
    }   
}
