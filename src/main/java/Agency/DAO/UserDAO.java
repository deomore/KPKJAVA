package Agency.DAO;

import Agency.Model.User;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;


@Data
public class UserDAO {
    private static final Logger logger = LoggerFactory.getLogger(UserDAO.class);

    private EntityManager manager;


    public User getByLogin(String login) {
        return (User) manager.createQuery("SELECT user FROM user user WHERE user.login = :login")
                .setParameter("login", login)
                .getSingleResult();
    }



}
