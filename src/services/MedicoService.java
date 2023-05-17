package services;

import exception.*;
import models.Medico;
import repositories.MedicoRepository;

public class MedicoService {
    private MedicoRepository medicoRepository;

    public MedicoService(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    public void criar(Medico medico) throws CPFException, NomeException, EspecialException, EnderecoException, CRMException {
        if(medico.getCrm().length() == 6){
            throw new CRMException();
        } else if (medico.getNome() != null) {
            throw new NomeException();
        } else if (medico.getEspecialidade() != null) {
            throw new EspecialException();
        } else if (medico.getEndereco() != null || medico.getEndereco().getRua() != null ||
                medico.getEndereco().getBairro() != null || medico.getEndereco().getCidade() != null
                || medico.getEndereco().getCep() != null || medico.getEndereco().getComplemento() != null
                || medico.getEndereco().getEstado() != null || medico.getEndereco().getNumero() != null)
        {
            throw new EnderecoException();
        } else if (medico.getCfp().length() == 11) {
            throw new CPFException();
        } else {
            medicoRepository.criar(medico);
        }

    }
    public void atualizar(String crm, Medico medico){
        Medico medico1 = medicoRepository.buscar(crm);
        medico1.setNome(medico.getNome());
        medicoRepository.criar(medico1);
    }
    public void deletar(String crm) throws CRMException{
        Medico medico1 = medicoRepository.buscar(crm);
        if(medico1!=null){
            throw new CRMException();
        }else{
            medicoRepository.deletar(medico1);
        }
    }
    public Medico buscar(String crm){
        return medicoRepository.buscar(crm);
    }
}
