
public class AluraArray {
	public static void main(String[] args) {
                            // String[] é um array de referencia do nosso método main
		// array
		int[] idades = new int[10];
		// tipo /[] nome unico / = / new / tipo[tamanho do vetor];

		idades[0] = 29;
		idades[1] = 39;
		// atribui valores pra cada posição do vetor
		
		System.out.println(idades.length);
		// retorna o tamanho do array
		
		for (int i = 0; i < idades.length; i++){
			System.out.println(idades[i]);
			//laço de repetição for para ler todo o conteudo do array
			// de um por um e imprimir na tela
		}
		
		//array literal, ja definindo quem sao numeros pertinentes a essa coleção
		int[] idades2 = {10, 20, 30};
	}
	
	//Um array é uma estrutura de dados e serve para guardar elementos (valores primitivos ou referências)
	//Arrays usam colchetes ([]) sintaticamente
	//Arrays têm um tamanho fixo!
	//Um array também é um objeto!
	//Arrays são zero-based (o primeiro elemento se encontra na posição 0)
	//Um array é sempre inicializado com os valores padrões.
	//Ao acessar uma posição inválida recebemos a exceção ArrayIndexOutOfBoundException
	//Arrays possuem um atributo length para saber o tamanho
	//A forma literal de criar uma Array, com o uso de chaves {}.
}
