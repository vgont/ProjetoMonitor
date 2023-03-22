package br.com.fiap;

public class Monitor {

	//atributos
	public int volume, brilho;
	public String display;
	
	//métodos
	
	
	public void aumentarVolume() {
		this.volume++;
	}
	
	public void diminuirVolume() {
		this.volume--;
	}
	
	public void aumentarBrilho() {
		this.brilho += 10;
	}
	
	public void diminuirBrilho() {
		this.brilho -= 10;
	}
	
	public void definirDisplay(String display) {
		this.display = display;
	}
	
	public void mostrar() {
		System.out.println("\nVolume atual: " + volume + 
				"\nBrilho atual: " + brilho + "\nDisplay atual: " + display);
	}
	
	
	
	
	
	
	
	
	
	
	
}
