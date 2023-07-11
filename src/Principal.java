import br.com.alura.javapoo.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Star Wars");
        meuFilme.setAnoDeLancamento(1974);
        meuFilme.setDuracaoEmMinutos(184);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(2);
        meuFilme.avalia(10);

        System.out.println(meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

    }


}