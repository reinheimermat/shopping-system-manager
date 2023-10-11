package classes;

import java.util.Arrays;

import classes.lojas.Alimentacao;
import classes.lojas.Bijuteria;
import classes.lojas.Cosmetico;
import classes.lojas.Informatica;
import classes.lojas.Vestuario;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;
    private int quantidadeMaximaLojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.quantidadeMaximaLojas = quantidadeMaximaLojas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public int getQuantidadeMaximaLojas() {
        return quantidadeMaximaLojas;
    }

    public void setQuantidadeMaximaLojas(int quantidadeMaximaLojas) {
        this.quantidadeMaximaLojas = quantidadeMaximaLojas;
    }

    public boolean insereLoja(Loja loja) {
        try {
            Arrays.asList(this.lojas).add(0, loja);
            {
                return true;
            }
        } catch (Exception e) {
            System.out.print(e);
            return false;
        }
    }

    public boolean removeLoja(String removeLoja) {
        for (int i = 0; i < this.lojas.length; i++) {
            if (lojas[i].getNome().equals(removeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipo) {
        String[] tiposDeLoja = {"Cosmetico", "Vestuario", "Bijuteria", "Alimentacao", "Informatica"};
        int[] tiposDeLojaContador = {0,0,0,0,0};
        int posicaoDoTipoLoja = 0;

        // pega qual a posição no array tiposDeLojaContador o parametro tipo está 
        for(int i = 0; i < tiposDeLoja.length; i++) {
            if(tiposDeLoja[i].equalsIgnoreCase(tipo)){
                posicaoDoTipoLoja = i;
                // contador de instancias de cada tipo de loja nas lojas
                for(int x = 0; x < this.lojas.length; x++) {
                    if(this.lojas[x] instanceof Cosmetico) tiposDeLojaContador[0]++;
                    if(this.lojas[x] instanceof Vestuario) tiposDeLojaContador[1]++;
                    if(this.lojas[x] instanceof Bijuteria) tiposDeLojaContador[2]++;
                    if(this.lojas[x] instanceof Alimentacao) tiposDeLojaContador[3]++;
                    if(this.lojas[x] instanceof Informatica) tiposDeLojaContador[4]++;
                }
                return tiposDeLojaContador[posicaoDoTipoLoja];
            }
        }
        return -1;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaComSeguroMaisCaro = null;

        for (int i = 0; i < this.lojas.length; i++) {
            if (this.lojas[i] instanceof Informatica) {
                if (lojaComSeguroMaisCaro.getSeguroEletronicos() < ((Informatica) this.lojas[i])
                        .getSeguroEletronicos()) {
                    lojaComSeguroMaisCaro = ((Informatica) this.lojas[i]);
                }
            }
        }
        return lojaComSeguroMaisCaro;
    }

    public String toString() {
        return "Shopping {" +
                "Nome =" + nome + '\'' +
                ", Endereço =" + endereco +
                ", Lojas =" + Arrays.toString(lojas) +
                ", Quantidade Máxima de Lojas =" + this.quantidadeMaximaLojas +
                '}';

    }

}