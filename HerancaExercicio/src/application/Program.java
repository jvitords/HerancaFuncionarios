package application;

import entities.FuncionariosTerceirizados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Funcionarios;

public class Program {

	public static void main(String[] args) {
		
		Scanner digitar = new Scanner(System.in);
		List<Funcionarios> listaDeFuncionarios = new ArrayList<Funcionarios>();
		
		
		System.out.println("===== FUNCIONÁRIOS =====\n");
		
		System.out.print("Quantos funcionários deseja registrar? ");
		int numeroDeFuncionarios = digitar.nextInt();
		
		
		for(int i = 0; i < numeroDeFuncionarios; i++) {
			System.out.print("\nÉ funcionário da empresa('s') ou terceirizado('n')? ");
			char letraDaOpcao = digitar.next().charAt(0);
			
			while (letraDaOpcao != 's' && letraDaOpcao != 'n') {
				System.out.print("Digite 'S' para funcionário da empresa e 'N' para terceirizado: ");
				letraDaOpcao = digitar.next().charAt(0);
			}
			
			System.out.print("Nome do funcionário:");
			digitar.nextLine();
			String nome = digitar.nextLine();
			System.out.print("Quantas horas trabalhadas? ");
			int horasTrabalhadas = digitar.nextInt();
			System.out.print("Valor por hora? ");
			double valorPorHora = digitar.nextDouble();
			
			if(letraDaOpcao == 's') {
				Funcionarios Funcionario = new Funcionarios(nome, horasTrabalhadas, valorPorHora);
				listaDeFuncionarios.add(Funcionario);
			}
			else {
				System.out.print("Qual foi o valor adicional: ");
				Double valorAdicional = digitar.nextDouble();
				Funcionarios funcionario = new FuncionariosTerceirizados(nome, horasTrabalhadas, valorPorHora, valorAdicional);
				listaDeFuncionarios.add(funcionario);
			}
		}

		for(Funcionarios funcionario : listaDeFuncionarios) {
			System.out.println(funcionario);
		}
	}
}