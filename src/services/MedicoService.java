package services;

import models.Medico;
import repositories.MedicoRepository;

public class MedicoService {
    private MedicoRepository medicoRepository;

    public MedicoService(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    public void criar(Medico medico){
        if(medico.getCrm().length()!=6){
            
        } else if (medico.getNome() != null) {
            
        } else if (medico.getEspecialidade() != null) {
            
        } else if (medico.getEndereco() != null) {

        } else if (medico.getCfp() != null) {

        } else {
            medicoRepository.criar(medico);
        }

    }
    public void atualizar(String crm, Medico medico){
        Medico medico1 = medicoRepository.buscar(crm);
        medico1.setNome(medico.getNome());
        medicoRepository.criar(medico1);
    }
    public void deletar(String crm){
        Medico medico1 = medicoRepository.buscar(crm);
        if(medico1!=null){
            
        }else{
            medicoRepository.deletar(medico1);
        }
    }
}
