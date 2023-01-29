import java.util.Scanner;

public class Programa {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int resposta = 0;

      while (resposta != 3){
          System.out.println("----------------------------------");
          System.out.println("               AGENDA             ");
          System.out.println("----------------------------------");
          System.out.println("[1] Consultar um contato da agenda");
          System.out.println("[2] Adicionar um contato na agenda");
          System.out.println("[3] Sair");
          resposta = sc.nextInt();
      }

      switch (resposta) {

          case 1:
              consultarContato (sc, agenda)

      }

    }
}
