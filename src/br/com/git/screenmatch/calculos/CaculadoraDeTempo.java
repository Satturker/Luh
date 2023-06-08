package br.com.git.screenmatch.calculos;

import br.com.git.screenmatch.modelo.Filme;
import br.com.git.screenmatch.modelo.Serie;
import br.com.git.screenmatch.modelo.Titulo;

public class CaculadoraDeTempo {
    private int tempoTotal = 0;
    public int getTempoTotal() {
        return this.tempoTotal;
    }
    /*public void inclui(Filme f){
        this.tempoTotal += f.getDuracaoEmMinutos();
    }
    public void inclui(Serie s){
        this.tempoTotal += s.getDuracaoEmMinutos();
    }*/
    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
