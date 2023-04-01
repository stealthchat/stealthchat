package stealthchat.backend.services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.json.JSONObject;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    @PersistenceContext
    private EntityManager em;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        String sql = "SELECT username, password FROM users WHERE username = :username";

        List<Object[]> returnQuery = null;
        UserDetails user = null;

        try {
            returnQuery = em.createNativeQuery(sql).setParameter("username", username).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (returnQuery != null ) {
            for (Object[] obj : returnQuery) {
                user = new User((String) obj[0], (String) obj[1], new ArrayList<>());
            }
        }

        return user;
    }

}
