package classes;

import static java.util.Objects.isNull;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;

    // Etapa 02
    private Endereco endereco;
    private Data dataFundacao;

    // Etapa 04
    private Produto[] estoqueProdutos;

    // Métodos Construtores
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, int quantidadeMaximaProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    // Etapa 02
    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    // Método toString
    public String toString() {
        return "Loja {" +
                "nome =" + nome + '\'' +
                ", quantidadeFuncionarios =" + quantidadeFuncionarios +
                ", salarioBaseFuncionario =" + salarioBaseFuncionario +
                ", Data de Fundação =" + dataFundacao + // etapa 02
                ", Endereço =" + endereco + // etapa 02
                ", Estoque de Produtos =" + this.estoqueProdutos +
                '}';
    }

    public double gastosComSalario() {
        if (this.salarioBaseFuncionario == -1) {
            return -1;
        } else {
            return this.quantidadeFuncionarios * this.salarioBaseFuncionario;
        }
    }

    public char tamanhoDaLoja() {
        if (this.quantidadeFuncionarios < 10) {
            return 'P';
        } else if (this.quantidadeFuncionarios >= 10 && this.quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }

    // Etapa 04
    public void imprimeProduto() {
        for(int i = 0; i < this.estoqueProdutos.length; i++) {
            System.out.println("\nProduto =" + i + "\n" + this.estoqueProdutos[i]);
        }
    }

    public boolean insereProduto(Produto produto) {

        for (int i = 0; i < this.estoqueProdutos.length; i++) {
            if (isNull(this.estoqueProdutos[i])) {
                this.estoqueProdutos[i] = produto;
                return true;
            }
        }

        return false;
    }
    
    public boolean removeProduto(String nomeParaRemover) {
        for (int i = 0; i < this.estoqueProdutos.length; i++) {
            if (estoqueProdutos[i].getNome().equals(nomeParaRemover)) {
                estoqueProdutos[i].removeProduto();
                return true;
            }
        }
        return false;
    }
}
