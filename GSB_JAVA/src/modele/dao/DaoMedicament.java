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
public class DaoMedicament implements DaoInterface<Medicament, Integer> {
    /**
     * Non implémenté
     * @param unMedicament
     */
    @Override
    public int create(Medicament unMedicament) throws Exception {
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
    public Medicament getOne(Integer idMedicament) throws DaoException {
        Medicament result = null;
    try {
        Jdbc.getInstance().connecter();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(DaoMedicament.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(DaoMedicament.class.getName()).log(Level.SEVERE, null, ex);
    }
        ResultSet rs = null;
        // préparer la requête
        String requete = "SELECT * FROM Medicament WHERE ID_Medicament=?";
        
        try {
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            ps.setInt(1, idMedicament);
            rs = ps.executeQuery();
            if (rs.next()) {
                result = chargerUnEnregistrement(rs);
            }
         
        } catch (SQLException e) {
           
            throw new modele.dao.DaoException("DaoMedicament::getOne : erreur requete SELECT : " + e.getMessage());
        }
    try {
        Jdbc.getInstance().deconnecter();
    } catch (SQLException ex) {
        Logger.getLogger(DaoMedicament.class.getName()).log(Level.SEVERE, null, ex);
    }
        return (result);
    }

    /**
     * getAll
     *
     * @return ArrayList de l'ensemble des occurences des Medicaments de la table
     * Medicament
     * @throws modele.dao.DaoException
     */
    @Override
    public ArrayList<Medicament> getAll() throws DaoException {
        ArrayList<Medicament> result = new ArrayList<>();
    try {
        Jdbc.getInstance().connecter();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(DaoMedicament.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(DaoMedicament.class.getName()).log(Level.SEVERE, null, ex);
    }
        ResultSet rs;
        
        // préparer la requête
        String requete = "SELECT * FROM MEDICAMENT";
        Jdbc.getInstance().getConnexion();
        try {
 
				
            PreparedStatement ps = Jdbc.getInstance().getConnexion().prepareStatement(requete);
            rs = ps.executeQuery();
            // Charger les enregistrements dans la collection
            while (rs.next()) {
                Medicament unMedicament = chargerUnEnregistrement(rs);
                result.add(unMedicament);
            }
            
        } catch (SQLException e) {
            throw new modele.dao.DaoException("DaoMedicament::getOne : erreur requete SELECT : " + e.getMessage());
        }
    try {        
     
  
  
        Jdbc.getInstance().deconnecter();
    } catch (SQLException ex) {
        Logger.getLogger(DaoMedicament.class.getName()).log(Level.SEVERE, null, ex);
    }
        return result;
    }

    /**
     * Non implémenté
     */
    @Override
    public int update(Integer idMetier, Medicament objetMetier) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Non implémenté
     */
    @Override
    public int delete(Integer idMetier) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //----------------------------------------------------------------------
    //  Méthodes privées
    //----------------------------------------------------------------------
    /**
     * 
     */
    private Medicament chargerUnEnregistrement(ResultSet rs) throws DaoException {
        try {
            Medicament Medicament = new Medicament();

            Medicament.setdepotLegal(rs.getString("MED_DEPOTLEGAL"));
            Medicament.setcode(rs.getString("FAM_CODE"));
            Medicament.setnomCommercial(rs.getString("MED_NOMCOMMERCIAL"));
            Medicament.setcomposition(rs.getString("MED_COMPOSITION"));
            Medicament.seteffets(rs.getString("MED_EFFETS"));
            Medicament.setcontreIndic(rs.getString("MED_CONTREINDIC"));
            Medicament.setprixEchantillon(rs.getString("MED_PRIXECHANTILLON"));
            Medicament.setdepotLegal(rs.getString("MED_DEPOTLEGAL"));
            return Medicament;
        } catch (SQLException ex) {
            throw new DaoException("DaoMedicament - chargerUnEnregistrement : pb JDBC\n" + ex.getMessage());
        }
    }
}
