public abstract class Funcionario {
    private String nome;
    private int rg;
    private double salarioBase;
    
    public abstract void holerite(); 
        
    public Funcionario (String nome, int rg, double salarioBase) {
        super();
        this.nome = nome;
        this.rg = rg;
        this.salarioBase = salarioBase;
    }

	public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getRg() {
        return rg;
    }
    public void setRg(int rg) {
        this.rg = rg;
    }

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
    
    
    
}