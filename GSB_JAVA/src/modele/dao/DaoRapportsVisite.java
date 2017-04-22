package modele.dao;

import modele.metier.*;
import modele.jdbc.Jdbc;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Classe DAO pour la classe RapportsVisite
 *
 * @version 1.0
 * @author bts
 */
public class DaoRapportsVisite implements DaoInterface<RapportsVisite, Integer> 
{
    /**
     * Non implémenté
     * Permet de créer tables, colonnes ou lignes dans la base de données
     * @param unRapportsVisite
     */
    @Override
    public int create(RapportsVisite unRapportsVisite) throws Exception 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Lire un enregistrement d'après son identifiant
     *
     * @param idRapportsVisite métier de l'objet recherché
     * @return objet métier trouvé, ou null sinon
     * @throws modele.dao.DaoException
     */
    @Override
    public RapportsVisite getOne(Integer idRapportsVisite) throws DaoException
    {
        RapportsVisite result = null;
    try 
    {
        Jdbc.getInstance().connecter();
    } 
    catch (ClassNotFoundException ex)
    {
        Logger.getLogger(DaoRapportsVisite.class.getName()).log(Level.SEVERE, null, ex);
    } 
    catch (SQLException ex)
    {
        Logger.getLogger(DaoRapportsVisite.class.getName()).log(Level.SEVERE, null, ex);
    }
        ResultSet rs = null;
        // préparer la requête
        String requete = "SELECT * FROM RAPPORT_VISITE WHERE ID_RAPPORT_VISITES=?";
        
        try 
        {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            ps.setInt(1, idRapportsVisite);
            rs = ps.executeQuery();
            if (rs.next()) 
            {
                result = chargerUnEnregistrement(rs);
            }
         
        } 
        
        catch (SQLException e) 
        {
            throw new modele.dao.DaoException("DaoRapportsVisite::getOne : erreur requete SELECT : " + e.getMessage());
        }
    try
    {
        Jdbc.getInstance().deconnecter();
    } 
    catch (SQLException ex) 
    {
        Logger.getLogger(DaoRapportsVisite.class.getName()).log(Level.SEVERE, null, ex);
    }
        return (result);
    }

    /**
     * getAll
     *
     * @return ArrayList de l'ensemble des occurences des RapportsVisite de la table
     * RAPPORT_VISITE
     * @throws modele.dao.DaoException
     */
    @Override
    public ArrayList<RapportsVisite> getAll() throws DaoException 
    {
        ArrayList<RapportsVisite> result = new ArrayList<>();
    try 
    {
        Jdbc.getInstance().connecter();
    } 
    catch (ClassNotFoundException ex) 
    {
        Logger.getLogger(DaoRapportsVisite.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(DaoRapportsVisite.class.getName()).log(Level.SEVERE, null, ex);
    }
        ResultSet rs;
        
        // préparer la requête
        String requete = "SELECT  RAPPORT_VISITE.*,PRATICIEN.pra_nom,PRATICIEN.pra_prenom FROM RAPPORT_VISITE INNER JOIN PRATICIEN ON RAPPORT_VISITE.rap_num = praticien.pra_num";
        //SELECT  RAPPORT_VISITE.*,PRATICIEN.pra_nom,PRATICIEN.pra_prenom FROM RAPPORT_VISITE INNER JOIN PRATICIEN ON RAPPORT_VISITE.rap_num = praticien.pra_num
        Jdbc.getInstance().getConnexion();
        try {
 
				
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            rs = ps.executeQuery();
            // Charger les enregistrements dans la collection
            while (rs.next()) 
            {
                RapportsVisite unRapportsVisite = chargerUnEnregistrement(rs);
                result.add(unRapportsVisite);
            }
            
        } 
        catch (SQLException e) 
        {
            throw new modele.dao.DaoException("DaoRapportsVisite::getOne : erreur requete SELECT : " + e.getMessage());
        }
    try {        
     
  
  
        Jdbc.getInstance().deconnecter();
    } catch (SQLException ex) {
        Logger.getLogger(DaoRapportsVisite.class.getName()).log(Level.SEVERE, null, ex);
    }
        return result;
    }

    /**
     * Non implémenté
     * Permet de faire un update (modifié/actualisé) d'un visiteur medicament/autre
     */
    @Override
    public int update(Integer idMetier, RapportsVisite objetMetier) throws Exception 
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
     * chargerUnEnregistrementRapportsVisite Instancie un objet RapportsVisite avec les
     * valeurs lues dans la base de données La jointure avec la table PRESENCE
     * n'est pas effectuée
     *
     * @param rs enregistrement de la table RapportsVisite courant
     * @return un objet RapportsVisite, dont la liste des "présences" n'est pas
     * renseignée
     * @throws DaoException
     */
    private RapportsVisite chargerUnEnregistrement(ResultSet rs) throws DaoException 
    {
        try 
        {
            RapportsVisite RapportsVisite = new RapportsVisite(null,null,null,null,null,null);
            RapportsVisite.setNumrapport(rs.getString("RAP_NUM"));
            RapportsVisite.setNom(rs.getString("PRA_NOM"));
            RapportsVisite.setPrenom(rs.getString("PRA_PRENOM"));
            RapportsVisite.setDaterapport(rs.getString("RAP_DATE"));
            RapportsVisite.setMotifvisite(rs.getString("RAP_BILAN"));
            RapportsVisite.setBilan(rs.getString("RAP_MOTIF"));
            return RapportsVisite;
        }
        catch (SQLException ex) 
        {
            throw new DaoException("DaoRapportsVisite - chargerUnEnregistrement : pb JDBC\n" + ex.getMessage());
        }
    }
}
