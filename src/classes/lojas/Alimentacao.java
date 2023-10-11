package classes.lojas;

import classes.Data;
import classes.Endereco;
import classes.Loja;

public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, Data dataAlvara, int estoqueProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, estoqueProdutos);
        this.dataAlvara = dataAlvara;

    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    public String toString() {
        return super.toString() + "Alimentacao {" +
                "Data Alvara =" + dataAlvara +
                "}";
    }
}
