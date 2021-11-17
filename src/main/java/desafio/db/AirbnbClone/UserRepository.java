package desafio.db.AirbnbClone;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

interface UserRepository  extends CrudRepository<User, List<User>> {
    User findById(long id);    
	List<User>findAll();
}