package models;

public class Medico extends Pessoa{
    private String crm;
    private String especialidade;

    public Medico() {
    }

    public Medico(String nome, String cfp, Endereco endereco, String crm, String especialidade) {
        super(nome, cfp, endereco);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
