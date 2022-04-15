package dat.sauna.model.persistence;

import dat.sauna.model.entities.User;
import dat.sauna.model.exceptions.DatabaseException;

public interface IUserMapper
{
    public User login(String email, String kodeord) throws DatabaseException;
    public User createUser(String username, String password, String role) throws DatabaseException;
}
