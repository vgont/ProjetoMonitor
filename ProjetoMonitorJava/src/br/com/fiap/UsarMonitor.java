package br.com.fiap;

import java.util.Scanner;

public class UsarMonitor {

	public static void main(String[] args) {
		
		Monitor tela1 = new Monitor();
		int volume, brilho;
		String display, status;
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			
			System.out.println("Você deseja ligar o monitor? (digite s ou n): ");
			
			status = scan.next();
			
			if(status.equals("s")) {
				
				System.out.println("Digite o volume desejado: ");
				volume = scan.nextInt();
				System.out.println("Digite o brilho desejado: ");
				brilho = scan.nextInt();
				System.out.println("Digite o display a ser usado: ");
				display = scan.next();
				
				tela1.volume = volume;
				tela1.brilho = brilho;
				tela1.display = display;
				System.out.println("");
				System.out.println("Status: Ligado") ; tela1.mostrar();
				
			}
			
			
			else if (status.equals("n")) {
				System.out.println("Monitor desligado");
			}
			
			else {
				System.out.println("Opção inválida");
			}
			
		} catch (Exception e) {
			System.out.println("Formato incorreto");
		}
		
	}

}
