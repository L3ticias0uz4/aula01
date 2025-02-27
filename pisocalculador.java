package aula1;

import java.util.Scanner;

public class pisocalculador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		// Entrada de dados
		System.out.print("Digite a largura do cômodo: ");
		double largura = sc.nextDouble();
		
		System.out.print("Digite o comprimento do ôcomodo: ");
		double comprimento= sc.nextDouble();
		
		System.out.print("Digite o valor do metro quadrado do piso: ");
		double valorMetroQuadrado = sc.nextDouble();
		
		
		//Cálculo da área do cômodo 
		double areaComodo = largura * comprimento;
		
		
		//Cálculo do custo total do piso
		double custototal = areaComodo * valorMetroQuadrado;
		
		
		//Exibição dos resultados com duas casas decimais 
		System.out.println(String.format("%.2f", areaComodo));
		System.out.println(String.format("%.2f", custototal));
		
		sc.close();
				
	}

}
