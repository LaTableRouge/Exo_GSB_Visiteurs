package controleur;

import java.util.List;
import javax.swing.JOptionPane;
import modele.dao.*;
import modele.metier.*;
import vue.VuePraticiens;

/**
 * Contrôleur de la fenêtre VuePraticiens
 *
 */
public class CtrlPraticiens extends CtrlAbstrait 
{
    
   private DaoPraticiens daoPraticiens = new DaoPraticiens();

    /**
     *
     * @param ctrlPrincipal
     */
    public CtrlPraticiens(CtrlPrincipal ctrlPrincipal)
    {
        super(ctrlPrincipal);
        vue = new VuePraticiens(this);
        actualiser();
    }

    public final void actualiser() 
    {
        try 
        {
            chargerListePraticiens();
        } 
        catch (DaoException ex)
        {
            JOptionPane.showMessageDialog(getVue(), "CtrlPraticiens - actualiser - " + ex.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * PraticiensFermer réaction au clic sur le bouton Fermer de la vuePraticiens
     * Le contrôle est rendu au contrôleur frontal
     */
    public void PraticiensFermer()
    {
        this.getCtrlPrincipal().action(EnumAction.PRATICIENS_FERMER);
    }
    
    //Bouton suivant. rajoute + 1 a chaque Praticiens
    public void PraticiensSuivant()
    {
        int index = getVue().getjComboBoxPraticiens().getSelectedIndex()+1;
        if(index== getVue().getjComboBoxPraticiens().getItemCount())index=0;
        getVue().getjComboBoxPraticiens().setSelectedIndex(index);
    }
    
    //Bouton précédent enleve - 1 a chaque Praticiens
    public void PraticiensPrecedent()
    {
        int index = getVue().getjComboBoxPraticiens().getSelectedIndex()-1;
        if(index== -1) index=getVue() .getjComboBoxPraticiens() .getItemCount() -1;
        getVue().getjComboBoxPraticiens().setSelectedIndex(index);
    }
    /**
     * chargerListePraticiens renseigner le modèle du composant jComboBoxPraticiens
     * à partir de la base de données (DaoPraticiens)
     *
     * @throws DaoException
     */
    private void chargerListePraticiens() throws DaoException 
    {
        List<Praticiens> desPraticiens = daoPraticiens.getAll();
        getVue().getModeleJComboBoxPraticiens().removeAllElements();
        for (Praticiens unPraticiens : desPraticiens) 
        {
            getVue().getModeleJComboBoxPraticiens().addElement(unPraticiens);
        }
    }
    /**
     * PraticiensSelectionner renseigner le modèle des composants
     * JTextField (TxtNom, TxtPrenom, TxtAdrs, TxtVille, TxtCp),
     * JComboBoxSecteur, JComboBoxLabo
     *
     */
    public void PraticiensSelectionner()
    {
        Praticiens praticiensSelect = (Praticiens) getVue().getjComboBoxPraticiens().getSelectedItem();
        if (praticiensSelect != null)
        { 
            //cast effectuer pour convertir un nombre entier en chaine de caractère
            getVue().getTxtNum().setText(Integer.toString((int)praticiensSelect.getNumero()));
            getVue().getTxtNom().setText(praticiensSelect.getNom());
            getVue().getTxtPrenom().setText(praticiensSelect.getPrenom());
            getVue().getTxtAdrs().setText(praticiensSelect.getAdresse());
            getVue().getTxtVille().setText(praticiensSelect.getVille()); 
            
            //cast effectuer pour convertir un nombre flottant en chaine de caractère
            getVue().getTxtCoef().setText(Float.toString((float) praticiensSelect.getCoef())); 
        }       
    }
    
    @Override
    public VuePraticiens getVue() 
    {
        return (VuePraticiens) vue;
    }

}