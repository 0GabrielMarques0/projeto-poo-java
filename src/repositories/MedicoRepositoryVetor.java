package repositories;

import models.Medico;

public class MedicoRepositoryVetor implements MedicoRepository{

    private Medico[] medico;

    public MedicoRepositoryVetor(int t) {
        this.medico = new Medico[t];
    }

    public void criar(Medico medico){
        for(int i = 0; i < this.medico.length; i++){
            if(this.medico[i] == null){
                this.medico[i] = medico;
            }
        }
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
        if (existe(medico.getCrm())) {
            for (int i=0;i< this.medico.length; i++){
                if (this.medico[i].getCrm().equals(medico.getCrm())){
                    this.medico[i] = null;
                }
            }
        }
    }

    @Override
    public void atualiza(String crm, Medico medico) {
        if(existe(crm)){
            for (int i=0;i< this.medico.length; i++) {
                if (this.medico[i].getCrm().equals(crm)) {
                    if (medico.getCrm() != null) {
                        this.medico[i].setCrm(medico.getCrm());
                    }
                }
            }
        }
    }

    @Override
    public boolean existe(String crm) {
        for (Medico value : medico) {
            if (value.getCrm().equals(crm)) {
                return true;
            }
        }
        return false;
    }

}
