package repositories;

import models.Medico;

public interface MedicoRepository {
    void criar(Medico medico);
    Medico buscar(String crm);
    void deletar(Medico medico);
    void atualiza(String crm, Medico medico);
    boolean existe(String crm);
}
