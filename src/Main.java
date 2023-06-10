import br.com.git.screenmatch.calculos.CaculadoraDeTempo;
import br.com.git.screenmatch.calculos.FiltroRecomendacao;
import br.com.git.screenmatch.modelo.Episodio;
import br.com.git.screenmatch.modelo.Filme;
import br.com.git.screenmatch.modelo.Serie;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        Serie serie = new Serie();
        CaculadoraDeTempo calculadora = new CaculadoraDeTempo();
        meuFilme.setNome("Lucky");
        meuFilme.setAnoDeLancamento(2020);
        meuFilme.setDuracaoEmMinutos(789456);
        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliacoes: " + meuFilme.getTotalDeAvaliacoes());

        Filme filmemeu = new Filme();
        filmemeu.setNome("The Macho");
        filmemeu.setAnoDeLancamento(2023);
        filmemeu.setDuracaoEmMinutos(123456);

        System.out.println(meuFilme.pegaMedia());
        calculadora.inclui(meuFilme);
        calculadora.inclui(filmemeu);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}