package desafio.db.AirbnbClone.Class;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nome;
	private String email;
	private String senha;
	
	protected User() {}
	
	public User(String nome, String email, String senha) {
		super();	
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	
	public long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}	
	
	@Override
	public String toString() {
		return "Usuário [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha+ "]";
	}
}
