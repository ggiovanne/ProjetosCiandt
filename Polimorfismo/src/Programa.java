
public class Programa {
	public static void main(String[] args) {
		
	Mamifero m = new Mamifero();
	Reptil r = new Reptil();
	Peixe p = new Peixe();
	Ave a = new Ave();	
	Cachorro k = new Cachorro();
	Canguru c = new Canguru ();
	Cachorro boby = new Cachorro();
	
	m.setPeso(35.5f);
	m.setCorPelo("Marrom");
	m.alimentar();
	m.locomover();
	m.emitirSom();
	
	a.locomover();
	p.locomover();
	r.locomover();
	
	k.emitirSom();
	c.emitirSom();
	
	boby.reagir("Ola");
	boby.reagir("Vai apaanhar");
	boby.reagir(11, 45);
	boby.reagir(21, 00);
	boby.reagir(true);
	boby.reagir(false);
	boby.reagir(2, 12.5f);
	boby.reagir(17, 4.5f);
		
	}
	
}
