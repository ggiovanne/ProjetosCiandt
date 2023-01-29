package Exercicio1;

public class Quadrado implements FormaGeometrica {
 
	private double lado;

	
	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public void area() {
		System.out.println("A área do quadrado de lado " + lado + " é: " + (lado * lado));
	}

	@Override
	public void comprimento() {
		System.out.println("O comprimento do quadrado de lado " + lado + " é: " + (lado * 4));
		
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
}
