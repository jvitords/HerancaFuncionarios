package entities;

public class FuncionariosTerceirizados extends Funcionarios {
	
	private Double despesaAdicional;
	
	private FuncionariosTerceirizados() {
	}

	public FuncionariosTerceirizados(String nome, Integer horas, Double valorPorHora,Double despesaAdicional) {
		super(nome, horas, valorPorHora);
		this.despesaAdicional = despesaAdicional;
	}
	
	public Double getValorAdicional() {
		return despesaAdicional;
	}

	public void setValorAdicional(Double valorAdicional) {
		this.despesaAdicional = valorAdicional;
	}

	@Override
	public Double pagamento(Integer horas, Double valorPorHora) {
		return super.pagamento(horas, valorPorHora) + despesaAdicional * 1.1; 
	}
	
	public String toString() {
		return "Nome: " + getNome() + "\nHoras: " + getHoras() + "\nValor por hora: R$" + getValor() + "\nPagamento: R$" + pagamento(getHoras(), despesaAdicional);
	}
}
