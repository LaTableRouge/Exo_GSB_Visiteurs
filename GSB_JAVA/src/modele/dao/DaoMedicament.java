package modele.dao;

import modele.metier.*;
import modele.jdbc.Jdbc;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe DAO pour la classe Medicament
 *
 * @version 1.0
 * @author bts
 */
public class DaoMedicament implements DaoInterface<Medicament, Integer> 
{
    /**
     * Non implémenté
     * Permet de créer tables, colonnes ou lignes dans la base de données
     * @param unMedicament
     */
    @Override
    public int create(Medicament unMedicament) throws Exception 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Lire un enregistrement d'après son identifiant
     *
     * @param idMedicament métier de l'objet recherché
     * @return objet métier trouvé, ou null sinon
     * @throws modele.dao.DaoException
     */
    @Override
    public Medicament getOne(Integer idMedicament) throws DaoException 
    {
        Medicament result = null;
    try 
    {
        Jdbc.getInstance().connecter();
    } 
    
    catch (ClassNotFoundException ex) 
    {
        Logger.getLogger(DaoMedicament.class.getName()).log(Level.SEVERE, null, ex);
    } 
    
    catch (SQLException ex) 
    {
        Logger.getLogger(DaoMedicament.class.getName()).log(Level.SEVERE, null, ex);
    }
        ResultSet rs = null;
        // préparer la requête
        String requete = "SELECT * FROM Medicament WHERE ID_Medicament=?";
        
        try 
        {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            ps.setInt(1, idMedicament);
            rs = ps.executeQuery();
            if (rs.next()) 
            {
                result = chargerUnEnregistrement(rs);
            }
         
        } 
        catch (SQLException e) 
        {
           
            throw new modele.dao.DaoException("DaoMedicament::getOne : erreur requete SELECT : " + e.getMessage());
        }
        
        try 
        {
            Jdbc.getInstance().deconnecter();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DaoMedicament.class.getName()).log(Level.SEVERE, null, ex);
        }
            return (result);
    }

    /**
     * getAll
     *
     * @return ArrayList de l'ensemble des occurences des Medicaments de la table
     * MEDICAMENT
     * @throws modele.dao.DaoException
     */
    @Override
    public ArrayList<Medicament> getAll() throws DaoException 
    {
        ArrayList<Medicament> result = new ArrayList<>();
    try 
    {
        Jdbc.getInstance().connecter();
    } 
    
    catch (ClassNotFoundException ex)
    {
        Logger.getLogger(DaoMedicament.class.getName()).log(Level.SEVERE, null, ex);
    } 
    
    catch (SQLException ex) 
    {
        Logger.getLogger(DaoMedicament.class.getName()).log(Level.SEVERE, null, ex);
    }
        ResultSet rs;
        
        // préparer la requête
        String requete = "SELECT MEDICAMENT.*,FAMILLE.fam_libelle FROM MEDICAMENT INNER JOIN FAMILLE ON MEDICAMENT.fam_code = FAMILLE.fam_code";
        Jdbc.getInstance().getConnexion();
        try 
        {			
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            rs = ps.executeQuery();
            // Charger les enregistrements dans la collection
            while (rs.next())
            {
                Medicament unMedicament = chargerUnEnregistrement(rs);
                result.add(unMedicament);
            }  
        } 
        
        catch (SQLException e) 
        {
            throw new modele.dao.DaoException("DaoMedicament::getOne : erreur requete SELECT : " + e.getMessage());
        }
        try 
        {        
            Jdbc.getInstance().deconnecter();
        } 
        
        catch (SQLException ex) 
        {
            Logger.getLogger(DaoMedicament.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    /**
     * Non implémenté
     * Permet de faire un update (modifié/actualisé) d'un visiteur medicament/autre
     */
    @Override
    public int update(Integer idMetier, Medicament objetMetier) throws Exception 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Non implémenté
     * Permet de supprimer un élement dans la base de donnée (medicament, visiteur)
     */
    @Override
    public int delete(Integer idMetier) throws Exception 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //----------------------------------------------------------------------
    //  Méthodes privées
    //----------------------------------------------------------------------
    /**
     * chargerUnEnregistrementMedicament Instancie un objet Medicament avec les
     * valeurs lues dans la base de données La jointure avec la table PRESENCE
     * n'est pas effectuée
     *
     * @param rs enregistrement de la table Medicament courant
     * @return un objet Medicament, dont la liste des "présences" n'est pas
     * renseignée
     * @throws DaoException
     */
    private Medicament chargerUnEnregistrement(ResultSet rs) throws DaoException
    {
        try 
        {
            //instancie un nouvel objet medicament
            Medicament Medicament = new Medicament(null,null,null,null,null,0);
            //Medicament.setDepotLegal(rs.getString("MED_DEPOTLEGAL"));
            Medicament.setCode(rs.getString("FAM_LIBELLE"));
            Medicament.setNomCommercial(rs.getString("MED_NOMCOMMERCIAL"));
            Medicament.setComposition(rs.getString("MED_COMPOSITION"));
            Medicament.setEffets(rs.getString("MED_EFFETS"));
            Medicament.setContreIndic(rs.getString("MED_CONTREINDIC"));
            Medicament.setPrix(rs.getFloat("MED_PRIXECHANTILLON"));
            return Medicament;
        } 
        catch (SQLException ex) 
        {
            throw new DaoException("DaoMedicament - chargerUnEnregistrement : pb JDBC\n" + ex.getMessage());
        }
    }
}
