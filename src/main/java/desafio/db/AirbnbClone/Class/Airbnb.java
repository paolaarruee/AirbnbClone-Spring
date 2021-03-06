package desafio.db.AirbnbClone.Class;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Airbnb {
	public void setId(long id) {
		this.id = id;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nomeHospedagem;
	private String imagem;
	private double valor;
	private int hospedes;
	private int quartos;
	private int camas;
	private int banheiros;
	private boolean wifi;
	private boolean arCondicionado;
	private boolean piscina;
	private String descricao;
	private String diaria;
	
	protected Airbnb() {}
	
	public Airbnb(String nomeHospedagem,String imagem ,double valor,int hospedes, int quartos, int camas, int banheiros, boolean wifi,
			boolean arCondicionado, boolean piscina, String descricao, String diaria) {
		super();
		
		this.nomeHospedagem = nomeHospedagem;
		this.imagem = imagem;
		this.valor = valor;
		this.hospedes = hospedes;
		this.quartos = quartos;
		this.camas = camas;
		this.banheiros = banheiros;
		this.wifi = wifi;
		this.arCondicionado = arCondicionado;
		this.piscina = piscina;
		this.descricao = descricao;
		this.diaria = diaria;
	}
	

	public long getId() {
		return id;
	}

	

	public String getNomeHospedagem() {
		return nomeHospedagem;
	}
	
	public double getValor() {
		return valor;
	}

	public String getImagem() {
		return imagem;
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
	public String getDescricao() {
		return descricao;
	}
	
	public String getDiaria() {
		return diaria;
	}

	@Override
	public String toString() {
		return "Airbnb [id=" + id + ", nomeHospedagem=" + nomeHospedagem + ", imagem=" + imagem + ", valor=" + valor
				+ ", hospedes=" + hospedes + ", quartos=" + quartos + ", camas=" + camas + ", banheiros=" + banheiros
				+ ", wifi=" + wifi + ", arCondicionado=" + arCondicionado + ", piscina=" + piscina + ", descricao="
				+ descricao + ", diaria =" + diaria +"]";
	}


	



	
	
}
