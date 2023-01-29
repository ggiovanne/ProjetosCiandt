public class Contato {

    private String nome;
    private int telefone;
    public int identificador;

    public static int contador = 0;

    public Contato (String nome, int telefone, int identificador) {
        this.nome = nome;
        this.telefone = telefone;
        contador++;
        this.identificador = contador;

    }



}
