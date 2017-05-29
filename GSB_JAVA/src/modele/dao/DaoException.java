package modele.dao;

/**
 *
 * @author bts
 */
public class DaoException extends Exception 
{

    /**
     * Créer une nouvelle instance <code>DaoException</code> avec le message détaillé.
     */
    public DaoException() 
    {
    }

    /**
     *Construire une instance de <code>DaoException</code> en spécifiant le détail du message.
     * @param msg le détail du message.
     */
    public DaoException(String msg) 
    {
        super(msg);
    }
}
