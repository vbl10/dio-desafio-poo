package br.com.dio.desafio.dominio;

import java.util.Objects;

public class FaseDesafioCodigo {
    private String titulo, desafio, exemplos, codigoInicial;

    public FaseDesafioCodigo() {}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesafio() {
        return desafio;
    }

    public void setDesafio(String desafio) {
        this.desafio = desafio;
    }

    public String getExemplos() {
        return exemplos;
    }

    public void setExemplos(String exemplos) {
        this.exemplos = exemplos;
    }

    public String getCodigoInicial() {
        return codigoInicial;
    }

    public void setCodigoInicial(String codigoInicial) {
        this.codigoInicial = codigoInicial;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }

    @Override
    public String toString() {
        return titulo;
    }
}
