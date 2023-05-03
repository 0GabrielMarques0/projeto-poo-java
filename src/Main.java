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

        int escolha;
        do{
            System.out.println("----- Bem vindo ao sistema da clinica -----\n" +
                    "Entrar como:\nMédico(1)\nPaciente(2)\nSair(3)");
            escolha = in.nextInt();
            int escolhaMedico;
            if (escolha != 1 && escolha != 2 && escolha != 3) {
                System.out.println("Opção digitada invalida, tente novamente");
            } else if (escolha == 1) {
                do{
                    System.out.println("----- Olá doutor(a), o que deseja fazer? -----\n1 - Cadastrar novo médico\n" +
                            "2 - Buscar médico\n3 - Alterar cadastro\n4 - Deletar um cadastro\n5 - Voltar ao menu inicial");
                    escolhaMedico = in.nextInt();
                    if (escolhaMedico != 1 && escolhaMedico != 2 && escolhaMedico != 3 && escolhaMedico != 4 && escolhaMedico != 5){
                        System.out.println("Opção digitada invalida, tente novamente");
                    }
                }while (escolhaMedico != 5);
            } else if (escolha == 2) {
                System.out.println("----- Seja bem vindo paciente! O que deseja fazer? -----");
            } else {
                System.out.println("----- Obrigado por escolher a clinica, até a próxima! -----");
            }
        }while (escolha != 3);


        Pessoa medico = new Medico();
        Pessoa paciente = new Paciente();

        //MedicoRepository medicoRepository = new MedicoRepositoryVetor(10);
        MedicoRepository medicoRepository = new MedicoRespositoryLista();
        MedicoService medicoService = new MedicoService(medicoRepository);

    }
}