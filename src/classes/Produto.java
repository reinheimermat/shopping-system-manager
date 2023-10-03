package classes;

public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade; // etapa 02

    // Construtor
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(Data data) {
        if (data.ano > this.dataValidade.ano) {
            return true;
        } else if (data.ano == this.dataValidade.ano && data.mes >= this.dataValidade.mes
                && data.dia >= this.dataValidade.dia) {
            return true;
        } else {
            return false;
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // etapa 02
    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    // toString
    public String toString() {
        return "Produto {" +
                ", nome =" + nome +
                ", preço =" + preco +
                ", data de validade =" + dataValidade + // etapa 02
                "}";
    }

}
