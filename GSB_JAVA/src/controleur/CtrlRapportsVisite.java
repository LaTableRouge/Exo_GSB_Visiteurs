package controleur;


import java.util.List;
import javax.swing.JOptionPane;
import modele.dao.*;
import modele.metier.*;
import vue.VueRapportsVisite;


//Contrôleur de la fenêtre CtrlRapportsVisite
public class CtrlRapportsVisite extends CtrlAbstrait 
{
    
    
   private DaoRapportsVisite daoRapportsVisite = new DaoRapportsVisite();

    /**
     *
     * @param ctrlPrincipal
     */
    public CtrlRapportsVisite(CtrlPrincipal ctrlPrincipal)
    {
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
            JOptionPane.showMessageDialog(getVue(), "CtrlRapportsVisite - actualiser - " + ex.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * PraticiensFermer réaction au clic sur le bouton Fermer de la vuePraticiens
     * Le contrôle est rendu au contrôleur frontal
     */
    public void RapportsVisiteFermer()
    {
        this.getCtrlPrincipal().action(EnumAction.RAPPORTSVISITE_FERMER);
    }
   
    //Bouton suivant. rajoute + 1 a chaque Rapports Visite
    public void RapportsVisiteSuivant()
    {
        int index = getVue().getjComboBoxRapportsVisite().getSelectedIndex()+1;
        if(index== getVue().getjComboBoxRapportsVisite().getItemCount())index=0;
        getVue().getjComboBoxRapportsVisite().setSelectedIndex(index);
    }
    
    
    //Bouton précédent enleve -1 a chaque Rapports Visite 
    public void RapportsVisitePrecedent()
    {
        int index = getVue().getjComboBoxRapportsVisite().getSelectedIndex()-1;
        if(index== -1) index=getVue() .getjComboBoxRapportsVisite() .getItemCount() -1;
        getVue().getjComboBoxRapportsVisite().setSelectedIndex(index);
    }
    /**
     * chargerListeRapportsVisite renseigner le modèle du composant jComboBoxNumero
     * à partir de la base de données (DaoRapportsVisite)
     *
     * @throws DaoException
     */
    private void chargerListeRapportsVisite() throws DaoException 
    {
        List<RapportsVisite> desRapportsVisite = daoRapportsVisite.getAll();
        getVue().getModeleJComboBoxRapportsVisite().removeAllElements();
        for (RapportsVisite unRapportsVisite : desRapportsVisite) 
        {
            getVue().getModeleJComboBoxRapportsVisite().addElement(unRapportsVisite);
        }
    }
    /**
     * RapportsVisiteSelectionner renseigner le modèle des composants
     * JTextField (TxtNom, TxtPrenom, TxtAdrs, TxtVille, TxtCp),
     * JComboBoxSecteur, JComboBoxLabo
     *
     */
    public void RapportsVisiteSelectionner()
    {
        
        RapportsVisite rapportsVisiteSelect = (RapportsVisite) getVue().getjComboBoxRapportsVisite().getSelectedItem();
        if (rapportsVisiteSelect != null)
        { 
          
           getVue().getTxtNom().setText(rapportsVisiteSelect.toString());
          // getVue().getTxtNumero().setText(rapportsVisiteSelect.getNumrapport());
            getVue().getTxtDaterapport().setText(rapportsVisiteSelect.getDaterapport());    
             getVue().getTxtMotifvisite().setText(rapportsVisiteSelect.getMotifvisite());
              getVue().getTxtBilan().setText(rapportsVisiteSelect.getBilan());
        }       
    }
   
    @Override
    public VueRapportsVisite getVue() 
    {
        return (VueRapportsVisite) vue;
    }

}