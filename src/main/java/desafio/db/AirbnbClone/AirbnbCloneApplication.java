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
			repository.save(new Airbnb("Pousada Terra e Mar","https://media-cdn.tripadvisor.com/media/photo-s/1c/45/55/0b/pousada-terra-mar-way.jpg",100,4, 2, 2, 1, true, true, true));
			repository.save(new Airbnb("Hotel Dunas","https://www.tangol.com/agencias/hoteles/img/HotelFotos/HB_644235_12.jpeg",90,2, 1, 1, 1, true, true, true));
			repository.save(new Airbnb("Pousada D'Boa","https://pousadavivamar.com.br/wp-content/uploads/2019/06/WEB-PousadaVivamar-166-e1567982987303.jpg" ,70,8, 3, 6, 3, true, true, false));
			repository.save(new Airbnb("Apartamento Barra da Lagoa","https://www.ryazbek.com.br/wp-content/uploads/2019/11/original-ccba23ab2eb493b23837674485286bcf.jpg" ,97,4, 2, 3, 2, true, true, true));
			repository.save(new Airbnb("Loft no centro de Floripa", "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/b7e93627619711.5636804a52310.png",130,2, 1, 1, 1, true, true, false));
                        
			
				
		};

	}

}
