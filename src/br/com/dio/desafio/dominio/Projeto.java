package br.com.dio.desafio.dominio;

import java.util.Objects;

public class Projeto extends Conteudo {
    private int dificuldade;

    @Override
    public double calcularXp() {
        return XP_PADRAO * dificuldade;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", dificuldade=" + dificuldade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Projeto projeto = (Projeto) o;
        return dificuldade == projeto.dificuldade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dificuldade);
    }
}
