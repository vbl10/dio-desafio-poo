package br.com.dio.desafio.dominio;

import java.util.Set;
import java.util.HashSet;

public class DesafioCodigo extends Conteudo {
    
    private int cargaHoraria;
    private int dificuldade;
    private Set<FaseDesafioCodigo> fases = new HashSet<>();

    public DesafioCodigo() {}

    @Override
    public double calcularXp()
    {
        return XP_PADRAO * cargaHoraria * dificuldade * fases.size();
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public Set<FaseDesafioCodigo> getFases() {
        return fases;
    }

    public void setFases(Set<FaseDesafioCodigo> fases) {
        this.fases = fases;
    }

    @Override
    public String toString()
    {
        return String.format(
            "DesafioCodigo{titulo='%s', desrcicao='%s', cargaHoraria:%d, fases:%s}", 
            getTitulo(), 
            getDescricao(),
            getCargaHoraria(),
            fases.toString()
        );
    }
}
