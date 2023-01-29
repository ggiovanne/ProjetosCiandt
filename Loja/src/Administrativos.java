public class Administrativos extends Funcionario {
    
    private int horasExtras;

    double pagamentoDeHoras = 0;
  

    public Administrativos(String nome, int rg, double salarioBase, int horasExtras) {
        super(nome, rg, salarioBase);
        this.horasExtras = horasExtras;
    }

    @Override
    public void holerite() {
        System.out.println("-----------------------------------------");
        System.out.println("              HOLERITE                   ");
        System.out.println("-----------------------------------------");
        System.out.println(" Nome do funcionário: " + this.getNome());
        System.out.println(" RG: " + this.getRg());
        System.out.println("-----------------------------------------");
        System.out.println("Salário Fixo: " + this.getSalarioBase());
        System.out.println("Horas extras: " + this.pagamentoDeHoras);
    }

    public int informarHorasExtras(int valor) {
        horasExtras += valor;
        return horasExtras;
    }

    public double pagarHorasExtras() {
        pagamentoDeHoras = (( this.getSalarioBase()/ 100) * horasExtras);
        return pagamentoDeHoras;
    }
    
    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

}