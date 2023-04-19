package models;

public class Paciente extends Pessoa {
    private double numCarteira;

    public Paciente() {

    }

    public Paciente(String nome, String cfp, Endereco endereco, double numCarteira) {
        super(nome, cfp, endereco);
        this.numCarteira = numCarteira;
    }

    public double getNumCarteira() {
        return numCarteira;
    }

    public void setNumCarteira(double numCarteira) {
        this.numCarteira = numCarteira;
    }
}
