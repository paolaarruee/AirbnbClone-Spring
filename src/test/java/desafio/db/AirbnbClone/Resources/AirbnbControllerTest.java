package desafio.db.AirbnbClone.Resources;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import desafio.db.AirbnbClone.Class.Airbnb;
import desafio.db.AirbnbClone.Repository.AirbnbRepository;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class AirbnbControllerTest {
	
	@Autowired
    private AirbnbController controller;
	
	@MockBean
    private AirbnbRepository repository;
	private List<Airbnb> airbnbs;
	private MockMvc mockMvc;
	
	@Before
	public void initAirbnbs() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(controller)
    			.build();
		airbnbs = new ArrayList<Airbnb>();
		Airbnb airbnb = new Airbnb("Ilha Bela", "imagem.jpg", 200.00, 5, 2, 4, 2, true, true, 
				false, "Belíssima pousada", "disponivel");
		airbnb.setId(1);
		airbnbs.add(airbnb);
		
		airbnb = new Airbnb("Verdes Mares", "imagem.jpg", 250.00, 4, 1, 4, 1, true, true, 
				true, "Próximo as principais praias", "disponivel");
		airbnbs.add(airbnb);
		
		airbnb = new Airbnb("Sol e Mar", "imagem.jpg", 300.00, 2, 2, 1, 2, true, true, 
				true, "Boa localização", "disponivel");
		airbnbs.add(airbnb);
	}
	
	@Test
    public void testGetAirbnbSuccess() throws Exception {
		given(this.repository.findById(1)).willReturn(airbnbs.get(0));
		this.mockMvc.perform(get("/hospedagem/1")
			.accept(MediaType.APPLICATION_JSON_VALUE))
			.andExpect(status().isOk())
			.andExpect(content().contentType("application/json"))
			.andExpect(jsonPath("$.id").value(1));
    }

}
