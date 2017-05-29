package controleur;


import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import modele.dao.*;
import modele.metier.*;
import vue.VueRapportsVisite;

//Chaque controleur rapporte les données du DAO, se l'approprie et l'affiche dans la vue

//Contrôleur de la fenêtre CtrlRapportsVisite
public class CtrlRapportsVisite extends CtrlAbstrait 
{
    private List<Medicament> lesMedicaments = new ArrayList<Medicament>();
   //instancie l'objet daoRapportsVisite
   private DaoRapportsVisite daoRapportsVisite = new DaoRapportsVisite();

    /**
     *
     * @param ctrlPrincipal
     */
   
   //Constructeur de CtrlRapportsVisite
    public CtrlRapportsVisite(CtrlPrincipal ctrlPrincipal)
    {
        //Super car appelle une instance du contrôle principal
        super(ctrlPrincipal);
        vue = new VueRapportsVisite(this);
        actualiser();
    }

    public final void actualiser() 
    {
        try 
        {
            chargerListeRapportsVisite();
        } 
        catch (DaoException ex)
        {
            //message d'erreur en cas de fail d'actualisation des données
            JOptionPane.showMessageDialog(getVue(), "CtrlRapportsVisite - actualiser - " + ex.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * RapportsVisiteFermer réaction au clic sur le bouton Fermer de la vueRapportsVisite
     * Le contrôle est rendu au contrôleur frontal
     */
    public void RapportsVisiteFermer()
    {
        this.getCtrlPrincipal().action(EnumAction.RAPPORTSVISITE_FERMER);
    }
 
    /**
     * chargerListeRapportsVisite renseigner le modèle du composant jComboBoxNumero
     * à partir de la base de données (DaoRapportsVisite)
     *
     * @throws DaoException
     */
    //si ca ne marche pas, sort un message d'erreur (throws)
    private void chargerListeRapportsVisite() throws DaoException 
    {
        //le RapportsVisite utilisé correspond à la classe métier RapportsVisite
        // est nommé "desRapportsVisite"
        List<RapportsVisite> desRapportsVisite = daoRapportsVisite.getAll();
        //Remplace les données par suppresion et insertion de données
        //renseigne le champs déroulant de la vue
        getVue().getModeleJComboBoxRapportsVisite().removeAllElements();
        for (RapportsVisite unRapportsVisite : desRapportsVisite) 
        {
            getVue().getModeleJComboBoxRapportsVisite().addElement(unRapportsVisite);
        }
    }
 
        
  
 
   
    @Override
    public VueRapportsVisite getVue() 
    {
        return (VueRapportsVisite) vue;
    }
}