import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Circulo c1 = new Circulo(11.5);
		System.out.println("A área do círculo de raio " + c1.getRaio() + " é: " + c1.area());
		System.out.println("O comprimento do círculo de raio " + c1.getRaio() + " é: " + c1.comprimento());

		Quadrado q1 = new Quadrado(6);
		System.out.println("A área do quadrado de lado " + q1.getLado() + " é: " + q1.area());
		System.out.println("O comprimento do quadrado de lado " + c1.getRaio() + " é: " + q1.comprimento());
		
		
		
	}
}

