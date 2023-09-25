import java.time.LocalDateTime;

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

    // Etapa 02
    public Boolean estaVencido(Data dataValidade) {
        LocalDateTime dataAtual = LocalDateTime.now();

        boolean anoMaior = dataValidade.getAno() > dataAtual.getYear();
        if (anoMaior) {
            return true;
        }

        boolean mesmoAno = dataValidade.getAno() == dataAtual.getYear();
        boolean mesmoAnoMesMaior = mesmoAno && dataValidade.getMes() > dataAtual.getMonth().getValue();
        if (mesmoAnoMesMaior) {
            return true;
        }

        boolean mesmoMes = dataValidade.getMes() == dataAtual.getMonth().getValue();
        return mesmoMes && dataValidade.getDia() > dataAtual.getDayOfMonth();
    }

    public boolean isVencido() {
        return this.estaVencido(getDataValidade());
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
