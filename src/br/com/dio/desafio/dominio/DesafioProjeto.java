package br.com.dio.desafio.dominio;

public class DesafioProjeto extends Conteudo {
    
    private int cargaHoraria;
    private int dificuldade;

    public DesafioProjeto() {}

    @Override
    public double calcularXp()
    {
        return XP_PADRAO * cargaHoraria * dificuldade;
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

    @Override
    public String toString() {
        return "DesafioProjeto{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", dificuldade= " + dificuldade +
                '}';
    }    
}
