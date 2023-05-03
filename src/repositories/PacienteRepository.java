package repositories;

import models.Paciente;

public interface PacienteRepository {
    void criar (Paciente paciente);
    Paciente buscar(String numCarteira);
    void deletar(Paciente paciente);
}
