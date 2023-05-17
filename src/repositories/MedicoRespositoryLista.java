package repositories;

import models.Medico;

public class MedicoRespositoryLista implements MedicoRepository{

    private NoMedico inicio;
    private NoMedico fim;

    public MedicoRespositoryLista(){
        this.inicio = null;
        this.fim = null;
    }
    @Override
    public void criar(Medico medico) {
        if(this.inicio == null){
            this.inicio = new NoMedico(medico);
            this.fim = new NoMedico(medico);
        } else {

            this.fim.setProximo(new NoMedico(medico));
            this.fim = this.fim.getProximo();
        }
    }
    @Override
    public Medico buscar(String crm) {
        NoMedico aux = this.inicio;
        Medico aux1 = null;
        while (aux.getProximo() != null){
            if(aux.getMedico().getCrm().equals(crm)){
                aux1 =  aux.getMedico();
                break;
            }
            aux = aux.getProximo();
        }
        return aux1;
    }

    @Override
    public void deletar(Medico crm) {

    }
}
