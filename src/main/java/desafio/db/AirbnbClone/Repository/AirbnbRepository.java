package desafio.db.AirbnbClone.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import desafio.db.AirbnbClone.Class.Airbnb;


public interface AirbnbRepository  extends CrudRepository<Airbnb, List<Airbnb>> {
    Airbnb findById(long id);    
	List<Airbnb>findAll();
}
