package Exercicio3;

public class Subtracao implements OperacaoMatematica {

	@Override
	public void calcular(double n1, double n2) {
		System.out.println("O resultado de " + n1 + " - " + n2 + "= " + (n1 - n2));
	}

	@Override
	public boolean valoresValidos(double n1, double n2) {
		if (n1 > n2) {
		return true;	
		}
		return false;
	}

}
