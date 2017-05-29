package controleur;

import java.util.List;
import javax.swing.JOptionPane;
import modele.dao.*;
import modele.metier.*;
import vue.VueMedicament;

/**
 * Contrôleur de la fenêtre VueMedicament
 *
 */
public class CtrlMedicament extends CtrlAbstrait 
{
    
   private DaoMedicament daoMedicament = new DaoMedicament();

    /**
     *
     * @param ctrlPrincipal
     */
    public CtrlMedicament(CtrlPrincipal ctrlPrincipal)
    {
        super(ctrlPrincipal);
        vue = new VueMedicament(this);
        actualiser();
    }

    public final void actualiser() 
    {
        try 
        {
            chargerListeMedicament();
        } 
        
        catch (DaoException ex)
        {
            JOptionPane.showMessageDialog(getVue(), "CtrlMedicament - actualiser - " + ex.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * MedicamentFermer réaction au clic sur le bouton Fermer de la vueMedicament 
     * Le contrôle est rendu au contrôleur frontal
     */
    public void MedicamentFermer() 
    {
        this.getCtrlPrincipal().action(EnumAction.MEDICAMENT_FERMER);
    }
    
    //Bouton suivant. rajoute + 1 a chaque Medicament
    public void MedicamentSuivant() 
    {
        int index = getVue().getjComboBoxMedicament().getSelectedIndex()+1;
        if(index== getVue().getjComboBoxMedicament().getItemCount())
        {
            index=0;
        }
        getVue().getjComboBoxMedicament().setSelectedIndex(index);
    }
    
    //Bouton Précédent. enleve - 1 a chaque Medicament
    public void MedicamentPrecedent() 
    {
        int index = getVue().getjComboBoxMedicament().getSelectedIndex()-1;
        if(index== -1) 
        {
            index=getVue() .getjComboBoxMedicament() .getItemCount() -1;
        }
        getVue().getjComboBoxMedicament().setSelectedIndex(index);
    }
    
    /**
     * chargerListeMedicaments renseigner le modèle du composant jComboBoxMedicament
     * à partir de la base de données (DaoMedicament)
     *
     * @throws DaoException
     */
    private void chargerListeMedicament() throws DaoException
    {
        List<Medicament> desMedicament = daoMedicament.getAll();
        getVue().getModeleJComboBoxMedicament().removeAllElements();
        for (Medicament unMedicament : desMedicament) 
        {
            getVue().getModeleJComboBoxMedicament().addElement(unMedicament);
        }
    }
    /**
     * MedicamentSelectionner renseigner le modèle des composants
     * JTextField (TxtCode, TxtNomCommercial, TxtComposition, TxtEffets, TxtContreIndic, TxtDepotLegal)
     * JComboBoxSecteur, JComboBoxLabo
     *
     */
    public void MedicamentSelectionner ()
    {
        Medicament MedicamentSelect = (Medicament) getVue().getjComboBoxMedicament().getSelectedItem();
        if (MedicamentSelect != null)
        {
            getVue().getTxtCode().setText(MedicamentSelect.getCode());
            getVue().getTxtNomCommercial().setText(MedicamentSelect.getNomCommercial());
            getVue().getTxtComposition().setText(MedicamentSelect.getComposition());
            getVue().getTxtEffets().setText(MedicamentSelect.getEffets());
            getVue().getTxtContreIndic().setText(MedicamentSelect.getContreIndic());
            getVue().getTxtPrix().setText(Float.toString(MedicamentSelect.getPrix()));
        }       
    }
   
    @Override
    public VueMedicament getVue()
    {
        return (VueMedicament) vue;
    }
}