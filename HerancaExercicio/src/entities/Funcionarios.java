package entities;

public class Funcionarios {

	private String nome;
	private Integer horas;
	private Double valorPorHora;
	
	public Funcionarios() {
	}

	public Funcionarios(String nome, Integer horas, Double valorPorHora) {
		this.nome = nome;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValor() {
		return valorPorHora;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public Double pagamento(Integer horas, Double valorPorHora) {
		return horas * valorPorHora;
	}
	
	public String toString() {
		return "Nome: " + nome.toString() + "\nHoras: " + horas + "\nValor por hora: R$" +valorPorHora + "\nPagamento: R$" + pagamento(horas, valorPorHora);
	}
}
