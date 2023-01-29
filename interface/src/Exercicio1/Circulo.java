package Exercicio1;

public class Circulo implements FormaGeometrica{
	
	private double raio;
	private static final double PI = 3.14;
	
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public void area() {
		System.out.println("A área do círculo de raio " + raio + " é: " + (PI * raio * raio));
		
	}

	@Override
	public void comprimento() {
		System.out.println("O comprimento do círculo de raio " + raio + " é: " +  (2 * PI * raio));
		
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public static double getPi() {
		return PI;
	}
}
