package desafio.db.AirbnbClone;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class AirbnbCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirbnbCloneApplication.class, args);
	}
	
	
	@Bean 
	public CommandLineRunner nomeHospedagem(AirbnbRepository repository) {
		return (args) -> {
			// criando objetos
			repository.save(new Airbnb("Pousada Terra e Mar", 4, 2, 2, 1, true, true, true));
			repository.save(new Airbnb("Hotel Dunas", 2, 1, 1, 1, true, true, true));
			repository.save(new Airbnb("Pousada D'Boa", 8, 3, 6, 3, true, true, false));
			repository.save(new Airbnb("Apartamento Barra da Lagoa", 4, 2, 3, 2, true, true, true));
			repository.save(new Airbnb("Loft no centro de Floripa", 2, 1, 1, 1, true, true, false));
                        
			
				
		};

	}

}
