package models;

public class Paciente extends Pessoa {
    private String numCarteira;

    public Paciente() {

    }

    public Paciente(String nome, String cpf, Endereco endereco, String numCarteira) {
        super(nome, cpf, endereco);
        this.numCarteira = numCarteira;
    }

    public String getNumCarteira() {
        return numCarteira;
    }

    public void setNumCarteira(String numCarteira) {
        this.numCarteira = numCarteira;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "numCarteira='" + numCarteira + '\'' +
                "} " + super.toString();
    }
}
