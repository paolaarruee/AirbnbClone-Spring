package desafio.db.AirbnbClone;

import org.springframework.data.repository.CrudRepository;


public interface AirbnbRepository  extends CrudRepository<Airbnb, Long> {

	Airbnb findByNomeHospedagem(String nomeHospedagem);
	
}
