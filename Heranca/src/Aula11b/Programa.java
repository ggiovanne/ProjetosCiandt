package Aula11b;

public class Programa {
	public static void main(String[] args) {
		Visitante v1 = new Visitante();
		v1.setNome ("Gabriel");
		v1.setIdade (24);
		v1.setSexo("M");
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Claudio");
		a1.setMatricula(1111);
		a1.setCurso("Informática");
		a1.setIdade(16);
		a1.setSexo("M");
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setMatricula(1112);
		b1.setNome("Jubileu");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensalidade();
		
		Tecnico t1 = new Tecnico();
		t1.setNome("Paula");
		t1.setIdade(18);
		t1.setSexo("F");
		t1.setRegistroProfissional(1562);
		t1.praticar();
		t1.fazerAniversário();
		
		Professor p1 = new Professor ();
		p1.setNome("Carlos");
		p1.setIdade(62);
		p1.setSexo("M");
		p1.fazerAniversário();
		p1.setEspecialidade("Programação");
		p1.setSalario(2500);
		p1.receberAumento();
		
		
	}
}
