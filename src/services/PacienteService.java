package services;

import exception.CPFException;
import exception.CarteiraException;
import exception.EnderecoException;
import exception.NomeException;
import models.Paciente;
import repositories.PacienteRepository;

public class PacienteService {
    private PacienteRepository pacienteRepository;

    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public void cria(Paciente paciente) throws CPFException, NomeException, EnderecoException, CarteiraException {
        if(paciente.getNumCarteira().length() == 15){
            throw new CarteiraException();
        } else if (paciente.getNome() != null) {
            throw new NomeException();
        } else if (paciente.getCfp() != null) {
            throw new CPFException();
        } else if (paciente.getEndereco() != null || paciente.getEndereco().getRua() != null ||
                paciente.getEndereco().getBairro() != null || paciente.getEndereco().getCidade() != null
                || paciente.getEndereco().getCep() != null || paciente.getEndereco().getComplemento() != null
                || paciente.getEndereco().getEstado() != null || paciente.getEndereco().getNumero() != null)
        {
            throw new EnderecoException();
        } else {
            pacienteRepository.criar(paciente);
        }
    }
    public void atualizar(String numCarteira, Paciente paciente) {
        Paciente paciente1 = pacienteRepository.buscar(numCarteira);
        paciente1.setNome(paciente.getNome());
        pacienteRepository.criar(paciente1);
    }
    public void deletar(String numCarteira) throws CarteiraException{
        Paciente paciente1 = pacienteRepository.buscar(numCarteira);
        if (paciente1 != null){
            throw new CarteiraException();
        }else {
            pacienteRepository.deletar(paciente1);
        }
    }
}
