package models;

public class Paciente extends Pessoa {
    private String numCarteira;

    public Paciente() {

    }

    public Paciente(String nome, String cfp, Endereco endereco, String numCarteira) {
        super(nome, cfp, endereco);
        this.numCarteira = numCarteira;
    }

    public String getNumCarteira() {
        return numCarteira;
    }

    public void setNumCarteira(String numCarteira) {
        this.numCarteira = numCarteira;
    }
}
