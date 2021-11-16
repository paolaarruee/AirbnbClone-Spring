package desafio.db.AirbnbClone;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface AirbnbRepository  extends CrudRepository<Airbnb, List<Airbnb>> {
    Airbnb findById(long id);    
	List<Airbnb>findAll();
}
