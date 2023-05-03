package repositories;

import models.Paciente;

public class PacienteRepositoryVetor implements PacienteRepository {

    private Paciente[] paciente;

    public PacienteRepositoryVetor(int t) {this.paciente = new Paciente[t]; }

    public  void  criar (Paciente paciente){

    }

    @Override
    public Paciente buscar(String numCarteira) {
        return null;
    }

    @Override
    public void deletar(Paciente paciente) {

    }

}
