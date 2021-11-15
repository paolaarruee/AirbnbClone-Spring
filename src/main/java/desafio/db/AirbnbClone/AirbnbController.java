package desafio.db.AirbnbClone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirbnbController {
	
	@Autowired
	private AirbnbRepository repository;
	@CrossOrigin
	@RequestMapping(value = "/{nomeHospedagem}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Airbnb> getNomeHospedagem(@PathVariable("nomeHospedagem") String nomeHospedagem) {
		Airbnb nome = repository.findByNomeHospedagem(nomeHospedagem);
		return new ResponseEntity<Airbnb>(nome, HttpStatus.OK);
	}
	@CrossOrigin
	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Airbnb>> findAll() {
		List<Airbnb> todos = this.repository.findAll();
		if (todos.isEmpty()) {
			return new ResponseEntity<List<Airbnb>>(todos, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Airbnb>>(todos, HttpStatus.OK);
	}
	
	
	
}
