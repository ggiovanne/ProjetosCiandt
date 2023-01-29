package Exercicio1;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		FormaGeometrica c1 = new Circulo(11.5);
		c1.area();
		c1.comprimento();
		

		FormaGeometrica q1 = new Quadrado(6);
		q1.area();
		q1.comprimento();

	}
}

