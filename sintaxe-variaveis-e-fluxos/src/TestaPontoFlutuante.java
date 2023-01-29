public class TestaPontoFlutuante {

	public static void main(String[] args){

        double salario = 2801;
        double percentual = (2800.50 / 100) * 10;
        
        if (salario <= 2800.50) { 
        	salario = salario + percentual;
        	System.out.println("O novo salario de Andre é " + salario);}
        
        else
        	
        	{System.out.println("O salario de Andre permanece o mesmo");}
        
    }
}