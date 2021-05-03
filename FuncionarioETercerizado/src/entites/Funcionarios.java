package entites;

public class Funcionarios {

	private String nome;
	private Integer hora;
	private Double valor;
	
	public Funcionarios() {
		
	}

	public Funcionarios(String nome, Integer hora, Double valor) {
		
		this.nome = nome;
		this.hora = hora;
		this.valor = valor;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	public double valorPagamento() {
		return hora * valor;
		
	}


	
}
