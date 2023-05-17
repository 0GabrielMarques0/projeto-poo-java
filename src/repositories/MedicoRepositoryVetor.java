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
        Medico medico1 =  null;
        for (int i=0;i< medico.length; i++){
            if (medico[i].getCrm().equals(crm)){
                medico1 = medico[i];
            }
        }
        return medico1;
    }

    @Override
    public void deletar(Medico medico) {

    }
}
