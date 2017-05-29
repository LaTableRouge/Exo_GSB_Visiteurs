package modele.dao;

import modele.metier.*;
import modele.jdbc.Jdbc;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Classe DAO pour la classe Praticiens
 *
 * @version 1.0
 * @author bts
 */
public class DaoPraticiens implements DaoInterface<Praticiens, Integer> 
{
    /**
     * Non implémenté
     * Permet de créer tables, colonnes ou lignes dans la base de données
     * @param unPraticiens
     */
    @Override
    public int create(Praticiens unPraticiens) throws Exception 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Lire un enregistrement d'après son identifiant
     *
     * @param idPraticiens métier de l'objet recherché
     * @return objet métier trouvé, ou null sinon
     * @throws modele.dao.DaoException
     */
    @Override
    public Praticiens getOne(Integer idPraticiens) throws DaoException
    {
        Praticiens result = null;
    try 
    {
        Jdbc.getInstance().connecter();
    }
    
    catch (ClassNotFoundException ex)
    {
        Logger.getLogger(DaoPraticiens.class.getName()).log(Level.SEVERE, null, ex);
    } 
    
    catch (SQLException ex)
    {
        Logger.getLogger(DaoPraticiens.class.getName()).log(Level.SEVERE, null, ex);
    }
        ResultSet rs = null;
        // préparer la requête
        String requete = "SELECT * FROM PRATICIEN WHERE ID_PRATICIENS=?";
        
        try 
        {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            ps.setInt(1, idPraticiens);
            rs = ps.executeQuery();
            if (rs.next()) 
            {
                result = chargerUnEnregistrement(rs);
            }
        } 
        
        catch (SQLException e) 
        {
            throw new modele.dao.DaoException("DaoPraticiens::getOne : erreur requete SELECT : " + e.getMessage());
        }
        
        try
        {
            Jdbc.getInstance().deconnecter();
        } 
        
        catch (SQLException ex) 
        {
            Logger.getLogger(DaoPraticiens.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (result);
    }

    /**
     * getAll
     *
     * @return ArrayList de l'ensemble des occurences des Praticiens de la table
     * PRATICIENS
     * @throws modele.dao.DaoException
     */
    @Override
    public ArrayList<Praticiens> getAll() throws DaoException 
    {
        ArrayList<Praticiens> result = new ArrayList<>();
    try 
    {
        Jdbc.getInstance().connecter();
    } 
    
    catch (ClassNotFoundException ex) 
    {
        Logger.getLogger(DaoPraticiens.class.getName()).log(Level.SEVERE, null, ex);
    } 
    
    catch (SQLException ex) 
    {
        Logger.getLogger(DaoPraticiens.class.getName()).log(Level.SEVERE, null, ex);
    }
        ResultSet rs;
        
        // préparer la requête
        String requete = "SELECT PRATICIEN.*,TYPE_PRATICIEN.typ_libelle FROM PRATICIEN INNER JOIN TYPE_PRATICIEN ON PRATICIEN.typ_code = TYPE_PRATICIEN.typ_code";
        Jdbc.getInstance().getConnexion();
        try 
        {		
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            rs = ps.executeQuery();
            // Charger les enregistrements dans la collection
            while (rs.next()) 
            {
                Praticiens unPraticiens = chargerUnEnregistrement(rs);
                result.add(unPraticiens);
            }
            
        } 
        
        catch (SQLException e) 
        {
            throw new modele.dao.DaoException("DaoPraticiens::getOne : erreur requete SELECT : " + e.getMessage());
        }
        try 
        {        
            Jdbc.getInstance().deconnecter();
        } 
        
        catch (SQLException ex)
        {
            Logger.getLogger(DaoPraticiens.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
     /**
     * Non implémenté
     * Permet de faire un update (modifié/actualisé) d'un visiteur medicament/autre
     */
    
    public ArrayList<Praticiens> insert() throws Exception 
    {
        ArrayList<Praticiens> result = new ArrayList<>();
        
    try 
    {
        Jdbc.getInstance().connecter();
    } 
    
    catch (ClassNotFoundException ex) 
    {
        Logger.getLogger(DaoPraticiens.class.getName()).log(Level.SEVERE, null, ex);
    } 
    
    catch (SQLException ex) 
    {
        Logger.getLogger(DaoPraticiens.class.getName()).log(Level.SEVERE, null, ex);
    }
        ResultSet rs;
        
        // préparer la requête
        String requete = "SELECT PRATICIEN.*,TYPE_PRATICIEN.typ_libelle FROM PRATICIEN INNER JOIN TYPE_PRATICIEN ON PRATICIEN.typ_code = TYPE_PRATICIEN.typ_code";
        Jdbc.getInstance().getConnexion();
        
        try 
        {		
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            rs = ps.executeQuery();
            // Charger les enregistrements dans la collection
            while (rs.next()) 
            {
                Praticiens unPraticiens = chargerUnEnregistrement(rs);
                result.add(unPraticiens);
            }
            
        } 
        
        catch (SQLException e) 
        {
            throw new modele.dao.DaoException("DaoPraticiens::getOne : erreur requete SELECT : " + e.getMessage());
        }
        try 
        {        
            Jdbc.getInstance().deconnecter();
        } 
        
        catch (SQLException ex)
        {
            Logger.getLogger(DaoPraticiens.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    

    /**
     * Non implémenté
     * Permet de faire un update (modifié/actualisé) d'un visiteur medicament/autre
     */
    @Override
    public int update(Integer idMetier, Praticiens objetMetier) throws Exception 
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
     * chargerUnEnregistrementPraticiens Instancie un objet Praticiens avec les
     * valeurs lues dans la base de données La jointure avec la table PRESENCE
     * n'est pas effectuée
     *
     * @param rs enregistrement de la table Praticiens courant
     * @return un objet Praticiens, dont la liste des "présences" n'est pas
     * renseignée
     * @throws DaoException
     */
    private Praticiens chargerUnEnregistrement(ResultSet rs) throws DaoException 
    {
        try 
        {
            Praticiens Praticiens = new Praticiens(null,null,null,null,null,null,0,null);
            Praticiens.setNumero(rs.getInt("PRA_NUM"));
            Praticiens.setNom(rs.getString("PRA_NOM"));
            Praticiens.setPrenom(rs.getString("PRA_PRENOM"));
            Praticiens.setAdresse(rs.getString("PRA_ADRESSE"));
            Praticiens.setCp(rs.getString("PRA_CP"));
            Praticiens.setVille(rs.getString("PRA_VILLE"));
            Praticiens.setLieu(rs.getString("TYP_LIBELLE"));
            Praticiens.setCoef(rs.getFloat("PRA_COEFNOTORIETE"));
            return Praticiens;
        }
        
        catch (SQLException ex) 
        {
            throw new DaoException("DaoPraticiens - chargerUnEnregistrement : pb JDBC\n" + ex.getMessage());
        }
    }
}
