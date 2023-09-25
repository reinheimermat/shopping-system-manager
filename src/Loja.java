public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Data dataFundacao;
    private Endereco endereco;

    // Métodos Construtores
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Data dataFundacao, Endereco endereco) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.dataFundacao = dataFundacao;
        this.endereco = endereco;
    }

    public Loja(String nome, int quantidadeFuncionarios, Data dataFundacao, Endereco endereco) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.dataFundacao = dataFundacao;
        this.endereco = endereco;
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

    // Método toString
    public String toString() {
        return "Loja {" +
                "nome =" + nome + '\'' +
                ", quantidadeFuncionarios =" + quantidadeFuncionarios +
                ", salarioBaseFuncionario =" + salarioBaseFuncionario +
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
}
