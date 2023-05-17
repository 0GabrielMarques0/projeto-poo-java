package repositories;

import models.Medico;

public class NoMedico {
    private Medico medico;
    private NoMedico proximo;

    public NoMedico(Medico medico) {
        this.medico = medico;
        this.proximo = null;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public NoMedico getProximo() {
        return proximo;
    }

    public void setProximo(NoMedico proximo) {
        this.proximo = proximo;
    }
}
