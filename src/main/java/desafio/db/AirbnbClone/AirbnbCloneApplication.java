package desafio.db.AirbnbClone;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import desafio.db.AirbnbClone.Class.Airbnb;
import desafio.db.AirbnbClone.Repository.AirbnbRepository;
/* authors: Erico, Paola,Danieli , Stefany e Artur*/


@SpringBootApplication
public class AirbnbCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirbnbCloneApplication.class, args);
	}
	
	
	@Bean 
	public CommandLineRunner nomeHospedagem(AirbnbRepository repository) {
		return (args) -> {
			// criando objetos
			repository.save(new Airbnb("Pousada Terra e Mar","https://media-cdn.tripadvisor.com/media/photo-s/1c/45/55/0b/pousada-terra-mar-way.jpg",100,4, 2, 2, 1, true, true, true,"Relaxar, desestressar e curtir o sol em um dos lugares mais bonitos do Brasil! A partir da sacada, você pode curtir a brisa e a vista de um fim de tarde ou acordar e verificar se o dia está para praia ou para uma piscina aquecida.\r\n", "Novembro"));
					
			repository.save(new Airbnb("Hotel Dunas","https://www.tangol.com/agencias/hoteles/img/HotelFotos/HB_644235_12.jpeg",90,2, 1, 1, 1, true, true, true,"Além de um espaço muito charmoso, internet, cafe da manhã e taxa de limpeza gratuita.Cofre, cama box, ar condicionado split, piso vinílico.", "Novembro"));
			repository.save(new Airbnb("Pousada D'Boa","https://pousadavivamar.com.br/wp-content/uploads/2019/06/WEB-PousadaVivamar-166-e1567982987303.jpg" ,70,8, 3, 6, 3, true, true, false,"Pousada linda, limpa e aconchegante.", "Novembro"));
			repository.save(new Airbnb("Apartamento Barra da Lagoa","https://www.ryazbek.com.br/wp-content/uploads/2019/11/original-ccba23ab2eb493b23837674485286bcf.jpg" ,97,4, 2, 3, 2, true, true, true,"Apartamento completo no centro da Lagoa da Conceição, local tranquilo, organizado e limpo. O apartamento é completo com cozinha toda equipada (fogão, geladeira, microondas, torradeira, pratos, copos, taças, panelas e talheres)", "Novembro"));
			repository.save(new Airbnb("Loft no centro de Floripa", "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/b7e93627619711.5636804a52310.png",130,2, 1, 1, 1, true, true, false,"O estúdio é muito bem localizado, centralizado, a 150m do CTC da Universidade Federal de Santa Catarina (UFSC), 15-20 minutos das praias do norte e sul, 15 minutos da Lagoa da Conceição.", "Novembro"));
                        
			
				
		};

	}

}
