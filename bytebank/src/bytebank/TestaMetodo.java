package bytebank;

public class TestaMetodo { 
    public static void main (String[] args) {
         Conta contaDoPaulo = new Conta();
         // Deposita
         contaDoPaulo.saldo = 100;
         contaDoPaulo.deposita(50);
         
         contaDoPaulo.deposita(2850);
         
         //saldo 150
         System.out.println("saldo do paulo " + contaDoPaulo.saldo);
         // Sacar
         Boolean conseguiuRetirar = contaDoPaulo.saca(80.00);
         System.out.println("saldo 2 do paulo " + contaDoPaulo.saldo);
         System.out.println(conseguiuRetirar);
         System.out.println("----------------------");
         System.out.println("Conseguiu retirar");
         System.out.println("----------------------");
         
         //transfere
         Conta contaDaMarcela = new Conta();
         contaDaMarcela.deposita(1000);
         
         boolean sucessoTransferencia = contaDaMarcela.transfere(999 , contaDoPaulo);
         
         if(sucessoTransferencia) {
             System.out.println("A transferencia ocorreu com sucesso");
         } else {
             System.out.println("A transferencia falhou");
         }        
         
         System.out.println("saldo da Marcela " + contaDaMarcela.saldo);
         System.out.println("saldo 3 do paulo " +contaDoPaulo.saldo);
     }
 }