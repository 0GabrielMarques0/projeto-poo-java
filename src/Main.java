import models.Medico;
import models.Paciente;
import models.Pessoa;
import repositories.MedicoRepository;
import repositories.MedicoRepositoryVetor;
import repositories.MedicoRespositoryLista;
import services.MedicoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("-----Bem vindo ao sistema da clinica-----");

        Pessoa medico = new Medico();
        Pessoa paciente = new Paciente();

        //MedicoRepository medicoRepository = new MedicoRepositoryVetor(10);
        MedicoRepository medicoRepository = new MedicoRespositoryLista();

        MedicoService medicoService = new MedicoService(medicoRepository);

    }
}