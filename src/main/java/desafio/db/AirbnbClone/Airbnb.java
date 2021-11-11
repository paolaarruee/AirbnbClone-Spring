package desafio.db.AirbnbClone;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Airbnb {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nomeHospedagem;
	private int hospedes;
	private int quartos;
	private int camas;
	private int banheiros;
	private boolean wifi;
	private boolean arCondicionado;
	private boolean piscina;
	
	protected Airbnb() {}
	
	public Airbnb(String nomeHospedagem, int hospedes, int quartos, int camas, int banheiros, boolean wifi,
			boolean arCondicionado, boolean piscina) {
		super();
		
		this.nomeHospedagem = nomeHospedagem;
		this.hospedes = hospedes;
		this.quartos = quartos;
		this.camas = camas;
		this.banheiros = banheiros;
		this.wifi = wifi;
		this.arCondicionado = arCondicionado;
		this.piscina = piscina;
	}


	public Long getId() {
		return id;
	}

	

	public String getNomeHospedagem() {
		return nomeHospedagem;
	}


	public int getHospedes() {
		return hospedes;
	}



	public int getQuartos() {
		return quartos;
	}



	public int getCamas() {
		return camas;
	}

	

	public int getBanheiros() {
		return banheiros;
	}

	

	public boolean isWifi() {
		return wifi;
	}

	

	public boolean isArCondicionado() {
		return arCondicionado;
	}



	public boolean isPiscina() {
		return piscina;
	}


	@Override
	public String toString() {
		return "Airbnb [id=" + id + ", nomeHospedagem=" + nomeHospedagem + ", hospedes=" + hospedes + ", quartos="
				+ quartos + ", camas=" + camas + ", banheiros=" + banheiros + ", wifi=" + wifi + ", arCondicionado="
				+ arCondicionado + ", piscina=" + piscina + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
