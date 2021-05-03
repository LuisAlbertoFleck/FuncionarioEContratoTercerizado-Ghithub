package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Funcionarios;
import entites.Tercerizado;
public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		List<Funcionarios> list = new ArrayList<>();
		
		
		System.out.println("Informe a quantidade de funcionarios");
		int n = sc.nextInt();
		
		for(int i =1; i<=n; i++) {
			System.out.println("Funiconario  " + i + "  Dados:");
			System.out.print("Funcionario � tercerizado (y/n)");
			char ch =sc.next().charAt(0);
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Quantidade de horas trabalhadas");
			int horas = sc.nextInt();
			System.out.println("Informe o valor por hora:");
			double valor =sc.nextDouble();
			if (ch == 'y') {
				System.out.println("Adicional do Salario");
				double adicional = sc.nextDouble();
				 
				list.add(new Tercerizado(nome, horas, valor, adicional));
			}else {
				
				list.add(new Funcionarios (nome, horas, valor));	
			}
		}
		System.out.println();
		System.out.println("Pagamentos:");
		for (Funcionarios func : list) {
			System.out.println(func.getNome() + "- $ " + String.format("%.2f", func.valorPagamento()));
			
		}
		sc.close();
	}
}

