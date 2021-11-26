package desafio.db.AirbnbClone.Service;

import java.util.List;
import java.util.Optional;

import desafio.db.AirbnbClone.Class.Airbnb;
import desafio.db.AirbnbClone.Repository.AirbnbRepository;

public class AirbnbService  implements AirbnbRepository {

	@Override
	public <S extends Airbnb> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Airbnb> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Airbnb> findById(List<Airbnb> id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(List<Airbnb> id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Airbnb> findAllById(Iterable<List<Airbnb>> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(List<Airbnb> id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Airbnb entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends List<Airbnb>> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Airbnb> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Airbnb findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Airbnb> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}