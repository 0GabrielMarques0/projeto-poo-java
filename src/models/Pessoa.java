package models;

public class Pessoa{
    private String nome;
    private String cfp;
    private Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, String cfp, Endereco endereco) {
        this.nome = nome;
        this.cfp = cfp;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCfp() {
        return cfp;
    }

    public void setCfp(String cfp) {
        this.cfp = cfp;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
