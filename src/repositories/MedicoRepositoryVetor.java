package repositories;

import models.Medico;

public class MedicoRepositoryVetor implements MedicoRepository{

    private Medico[] medico;

    public MedicoRepositoryVetor(int t) {
        this.medico = new Medico[t];
    }

    public void criar(Medico medico){

    }

    @Override
    public Medico buscar(String crm) {
        return null;
    }

    @Override
    public void deletar(Medico medico) {

    }
}
