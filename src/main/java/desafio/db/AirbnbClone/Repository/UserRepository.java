package desafio.db.AirbnbClone.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import desafio.db.AirbnbClone.Class.User;

public interface UserRepository  extends CrudRepository<User, List<User>> {
    User findById(long id);    
	List<User>findAll();
}
