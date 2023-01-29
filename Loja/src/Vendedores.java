public class Vendedores extends Funcionario {
   
    private double comissaoVendas;
    
    double pagamentoComissao = 0;
    
    public Vendedores(String nome, int rg, double salarioBase, int horasExtras) {
        super(nome, rg, salarioBase);
        this.comissaoVendas = comissaoVendas;
    }
    
    //public void pagamentoComissao
    
    @Override
    public void holerite() {
        System.out.println("-----------------------------------------");
        System.out.println("              HOLERITE                   ");
        System.out.println("-----------------------------------------");
        System.out.println(" Nome do funcionário: " + this.getNome());
        System.err.println(" RG: " + this.getRg());
        System.out.println("-----------------------------------------");
        System.out.println("Salário Base: " + this.getSalarioBase());
        System.out.println("Comissão: " + this.receberComissao());
        System.out.println("Total líquido: " + salarioTotal);
        System.out.println("-----------------------------------------");
    }
    double valor = 0;
    public double informaTotalVendas(double valor) {
        valor += valor;
        return valor;
            
    }
    double receberComissaoVendas = 0;
    
    public double receberComissao () {
    	receberComissaoVendas = valor * 1.05;
    	return receberComissaoVendas;
    }
    
    double salarioTotal = 0;
    public double informarSalario() {
        salarioTotal = this.getSalarioBase() + comissaoVendas;
        return salarioTotal;
    }
    
    public double getComissaoVendas() {
        return comissaoVendas;
    }

    public void setComissaoVendas(double comissaoVendas) {
        this.comissaoVendas = comissaoVendas;
    }  
}