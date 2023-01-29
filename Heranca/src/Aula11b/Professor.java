package Aula11b;

public class Professor extends Pessoa {
	
	private String especialidade;
	private double salario;
	
	
	public void receberAumento() {
		
		System.out.println("O salário de " + this.getNome() + " era de " + this.salario);
		this.salario = salario + salario * 0.2;
		System.out.println("E agora passou a ser: " + this.salario);
		
		
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
