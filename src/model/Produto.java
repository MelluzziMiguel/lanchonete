package model;

public class Produto {

    private String nome;
    private String descricao;
    private double preco;

    public Produto(String nome, String descricao, double preco) {

        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }

        if (preco <= 0) {
            throw new IllegalArgumentException("Preço inválido");
        }

        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
    public String getNome() {
        return nome;
    }
}