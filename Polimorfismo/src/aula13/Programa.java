package aula13;

public class Programa {
	public static void main(String[] args) {
	
		Cachorro c = new Cachorro();
		Lobo l = new Lobo();
		
		c.emitirSom();
		l.emitirSom();
		
		c.reagir("Ola");
		c.reagir("Vai apanhar");
		c.reagir(false);
		c.reagir(4, 15);
}
}
