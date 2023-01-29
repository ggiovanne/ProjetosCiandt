
public class Programa {
	
	public static void main(String[] args) {
		
		TipoGrao graoMelita = new TipoGrao ();
		graoMelita.nome = "grãoMelita";
		graoMelita.classificacao = Classificacao.Premium;
		graoMelita.estrutura = Estrutura.Moido;
		graoMelita.intensidade = Intensidade.ExtraForte;
		graoMelita.sabor = Sabor.Amargo;
		graoMelita.lote = "6543";
		
		TipoGrao graoPilaoGourmet = new TipoGrao ();
		graoPilaoGourmet.nome = "Grannus";
		graoPilaoGourmet.classificacao = Classificacao.Gourmet;
		graoPilaoGourmet.estrutura = Estrutura.Torrado;
		graoPilaoGourmet.intensidade = Intensidade.Moderada;
		graoPilaoGourmet.sabor = Sabor.Adocado;
		graoPilaoGourmet.lote = "6544";
		
		
		Embalagem embalagemMelita = new Embalagem ();
		embalagemMelita.fabricante = "Astromex";
		embalagemMelita.formato = "caixa";
		
		Embalagem embalagemPilao = new Embalagem ();
		embalagemPilao.fabricante = "TetraPark";
		embalagemPilao.formato = "Cápsula";
		
		Cafe cafeMelita = new Cafe ();
		cafeMelita.nome = "Melita";
		cafeMelita.vencimento = "20/07/2022";
		cafeMelita.embalagem = embalagemMelita;
		cafeMelita.grao = graoMelita;
		
		Cafe cafePilao = new Cafe ();
		cafePilao.nome = "Pilao";
		cafePilao.vencimento = "20/08/2022";
		cafePilao.embalagem = embalagemPilao;
		cafePilao.grao = graoPilaoGourmet;
		
	}
}
