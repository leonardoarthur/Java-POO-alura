public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaAvaliacao;
    int totalAvaliacoes;
    int duracaoEmMinutos;
    //não vai devolver nada, logo, void.
    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }
    void avalia(double nota){
        somaAvaliacao += nota;
        totalAvaliacoes++;
    }

    double pegaMedia(){
        return somaAvaliacao / totalAvaliacoes;
    }
}
