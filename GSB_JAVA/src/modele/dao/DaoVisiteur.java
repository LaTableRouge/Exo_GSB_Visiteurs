package modele.dao;


import Utils.Utils;
import modele.metier.*;
import modele.jdbc.Jdbc;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe DAO pour la classe Visiteur
 *
 * @version 1.0
 * @author bts
 */
public class DaoVisiteur implements DaoInterface<Visiteur, Integer> 
{
    private DaoSecteur daoSecteur = new DaoSecteur();
    private DaoLabo daoLabo = new DaoLabo();
    /**
     * Non implémenté
     * @param unVisiteur
     */
    @Override
    public int create(Visiteur unVisiteur) throws Exception
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
      /**
     *
     * @param nom
     * @param dateEmbauche
     * @return
     */
    public Visiteur getConnexion(String nom, String dateEmbauche) throws DaoException
    {
        Visiteur ligne = null;
    try 
    {
        Jdbc.getInstance().connecter();
    } 
    
    catch (ClassNotFoundException ex) 
    {
        Logger.getLogger(DaoVisiteur.class.getName()).log(Level.SEVERE, null, ex);
    } 
    
    catch (SQLException ex) 
    {
        Logger.getLogger(DaoVisiteur.class.getName()).log(Level.SEVERE, null, ex);
    }
        ResultSet rs = null;
        
        // Préparer la requête
        String requete = "SELECT * FROM VISITEUR WHERE VIS_NOM =? AND VIS_DATEEMBAUCHE=?";
        
        try
        {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            String format = "ddmmyyyy";
            ps.setString(1, nom);
            ps.setDate(2, java.sql.Date.valueOf(Utils.StringToDate(format,dateEmbauche)));
            rs = ps.executeQuery();
            if (rs.next()) 
            {
                ligne = chargerUnEnregistrement(rs);
            }
        }
        
        catch (SQLException e) 
        {
           
            throw new modele.dao.DaoException("DaoVisiteur::getCredential : erreur requête SELECT : " + e.getMessage());
        }
        
        try 
        {
            Jdbc.getInstance().deconnecter();
        } 
        
        catch (SQLException ex) 
        {
            Logger.getLogger(DaoVisiteur.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (ligne);
    }

    /**
     * Lire un enregistrement d'après son identifiant
     *
     * @param idVisiteur métier de l'objet recherché
     * @return objet métier trouvé, ou null sinon
     * @throws modele.dao.DaoException
     */
    @Override
    public Visiteur getOne(Integer idVisiteur) throws DaoException
    {
        Visiteur result = null;
    try 
    {
        Jdbc.getInstance().connecter();
    } 
    catch (ClassNotFoundException ex) 
    {
        Logger.getLogger(DaoVisiteur.class.getName()).log(Level.SEVERE, null, ex);
    } 
    catch (SQLException ex) 
    {
        Logger.getLogger(DaoVisiteur.class.getName()).log(Level.SEVERE, null, ex);
    }
        ResultSet rs = null;
        // préparer la requête
        String requete = "SELECT * FROM VISITEUR WHERE ID_VISITEUR=?";
        
        try 
        {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            ps.setInt(1, idVisiteur);
            rs = ps.executeQuery();
            if (rs.next()) 
            {
                result = chargerUnEnregistrement(rs);
            }
        } 
        catch (SQLException e)
        {
            throw new modele.dao.DaoException("DaoVisiteur::getOne : erreur requete SELECT : " + e.getMessage());
        }
        
        try 
        {
            Jdbc.getInstance().deconnecter();
        } 
        
        catch (SQLException ex)
        {
            Logger.getLogger(DaoVisiteur.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (result);
    }


    /**
     * getAll
     *
     * @return ArrayList de l'ensemble des occurences des visiteurs de la table
     * VISITEUR
     * @throws modele.dao.DaoException
     */
    @Override
    public ArrayList<Visiteur> getAll() throws DaoException 
    {
        ArrayList<Visiteur> result = new ArrayList<>();
    try
    {
        Jdbc.getInstance().connecter();
    } 
    
    catch (ClassNotFoundException ex) 
    {
        Logger.getLogger(DaoVisiteur.class.getName()).log(Level.SEVERE, null, ex);
    } 
    
    catch (SQLException ex) 
    {
        Logger.getLogger(DaoVisiteur.class.getName()).log(Level.SEVERE, null, ex);
    }
        ResultSet rs;
        
        // préparer la requête
        String requete = "SELECT * FROM VISITEUR";
        Jdbc.getInstance().getConnexion();
        try
        {			
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            rs = ps.executeQuery();
            // Charger les enregistrements dans la collection
            while (rs.next()) 
            {
                Visiteur unVisiteur = chargerUnEnregistrement(rs);
                result.add(unVisiteur);
            }
            
        } 
        
        catch (SQLException e) 
        {
            throw new modele.dao.DaoException("DaoVisiteur::getOne : erreur requete SELECT : " + e.getMessage());
        }
        
        try 
        {        
            Jdbc.getInstance().deconnecter();
        } 
        
        catch (SQLException ex) 
        {
            Logger.getLogger(DaoVisiteur.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
 

    /**
     * Non implémenté
     */
    @Override
    public int update(Integer idMetier, Visiteur objetMetier) throws Exception 
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
     * chargerUnEnregistrementVisiteur Instancie un objet visiteur avec les
     * valeurs lues dans la base de données La jointure avec la table PRESENCE
     * n'est pas effectuée
     *
     * @param rs enregistrement de la table Visiteur courant
     * @return un objet Visiteur, dont la liste des "présences" n'est pas
     * renseignée
     * @throws DaoException
     */
    private Visiteur chargerUnEnregistrement(ResultSet rs) throws DaoException
    {
        try 
        {
            Visiteur visiteur = new Visiteur(null,null,null,null,null,null,null,null,null);
            visiteur.setMatricule(rs.getString("VIS_MATRICULE"));
            visiteur.setPrenom(rs.getString("VIS_PRENOM"));
            visiteur.setDateEmbauche(rs.getString("VIS_DATEEMBAUCHE"));
            visiteur.setNom(rs.getString("VIS_NOM"));
            visiteur.setAdresse(rs.getString("VIS_ADRESSE"));
            visiteur.setVille(rs.getString("VIS_VILLE"));
            visiteur.setCp(rs.getString("VIS_CP"));
            visiteur.setSecteur(daoSecteur.getOne(rs.getString("SEC_CODE")));
            visiteur.setLabo(daoLabo.getOne(rs.getString("LAB_CODE")));
            return visiteur;
        } 
        catch (SQLException ex) 
        {
            throw new DaoException("DaoVisiteur - chargerUnEnregistrement : pb JDBC\n" + ex.getMessage());
        }
    } 
}
