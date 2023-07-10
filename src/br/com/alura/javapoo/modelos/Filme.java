package br.com.alura.javapoo.modelos;

public class Filme {
    public String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalAvaliacoes;
    int duracaoEmMinutos;
    //não vai devolver nada, logo, void.

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }
    public void avalia(double nota){
        somaAvaliacao += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia(){
        return somaAvaliacao / totalAvaliacoes;
    }
}
