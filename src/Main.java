import exception.*;
import models.Endereco;
import models.Medico;
import repositories.MedicoRepository;
import repositories.MedicoRepositoryVetor;
import services.MedicoService;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static MedicoRepository medicoRepository = new MedicoRepositoryVetor(5);
    static MedicoService medicoService = new MedicoService(medicoRepository);

    public static void menuPrincipal() throws EnderecoException, EspecialException, NomeException, CRMException, CPFException {
        int escolha;
        do{
            System.out.println("----- Bem vindo ao sistema da clinica -----\n" +
                    "Entrar como:\nMédico(1)\nPaciente(2)\nSair(3)");
            escolha = Integer.parseInt(in.nextLine());
            if (escolha != 1 && escolha != 2 && escolha != 3) {
                System.out.println("Opção digitada invalida, tente novamente");
            } else if (escolha == 1) {
                medico();
            } else if (escolha == 2) {
                paciente();
            } else {
                System.out.println("----- Obrigado por escolher a clinica, até a próxima! -----");
            }
        }while (escolha != 3);
    }
    public static void paciente() {
        System.out.println("----- Seja bem vindo paciente! O que deseja fazer? -----");
    }
    public static void medico() throws EnderecoException, EspecialException, NomeException, CRMException, CPFException {
        int escolhaMedico;
        do {
            System.out.println("----- Olá doutor(a), o que deseja fazer? -----\n1 - Cadastrar novo médico\n" +
                    "2 - Buscar médico\n3 - Alterar cadastro\n4 - Deletar um cadastro\n5 - Voltar ao menu inicial");
            escolhaMedico = Integer.parseInt(in.nextLine());
            if (escolhaMedico != 1 && escolhaMedico != 2 && escolhaMedico != 3 && escolhaMedico != 4 && escolhaMedico != 5) {
                System.out.println("Opção digitada invalida, tente novamente");
            } else if (escolhaMedico == 1) {
                System.out.println("Digite o seu nome:");
                String nome = in.nextLine();
                System.out.println("Digite o seu CPF:");
                String cpf = in.nextLine();
                System.out.println("Digite sua rua:");
                String rua = in.nextLine();
                System.out.println("Digite seu bairro:");
                String bairro = in.nextLine();
                System.out.println("Digite sua cidade:");
                String cidade = in.nextLine();
                System.out.println("Digite seu estado:");
                String estado = in.nextLine();
                System.out.println("Digite seu CEP:");
                String cep = in.nextLine();
                System.out.println("Digite seu número:");
                String numero = in.nextLine();
                System.out.println("Digite seu complemento:");
                String complemento = in.nextLine();
                System.out.println("Digite o CRM:");
                String crm = in.nextLine();
                System.out.println("Digite sua especialidade:");
                String especialidade = in.nextLine();
                medicoService.criar(new Medico(nome, cpf, new Endereco(rua, bairro, cidade, estado, cep, numero, complemento), crm, especialidade));
            } else if (escolhaMedico == 2) {
                System.out.println("Digite o CRM do médico que deseja procurar:");
                String crm = in.nextLine();
                var medico = medicoService.buscar(crm);
                if (medico == null) {
                    System.out.println("CRM não encontrado, digite um CRM que esteja cadastrado");
                    continue;
                } else {
                    System.out.println(medico);
                }
            } else if (escolhaMedico == 3) {
                System.out.println("Digite o CRM do médico que deseja procurar:");
                String crm2 = in.nextLine();
                var medico = medicoService.buscar(crm2);
                if (medico == null) {
                    System.out.println("CRM não encontrado, digite um CRM que esteja cadastrado");
                    continue;
                } else {
                    System.out.println("Deseja alterar o cadastro desse médico?\nSIM(1)\nNÃO(2)\n");
                    int yes_or_no = Integer.parseInt(in.nextLine());
                    if (yes_or_no == 1) {
                        System.out.println("Digite o seu nome:");
                        String nome = in.nextLine();
                        System.out.println("Digite o seu CPF:");
                        String cpf = in.nextLine();
                        System.out.println("Digite sua rua:");
                        String rua = in.nextLine();
                        System.out.println("Digite seu bairro:");
                        String bairro = in.nextLine();
                        System.out.println("Digite sua cidade:");
                        String cidade = in.nextLine();
                        System.out.println("Digite seu estado:");
                        String estado = in.nextLine();
                        System.out.println("Digite seu CEP:");
                        String cep = in.nextLine();
                        System.out.println("Digite seu número:");
                        String numero = in.nextLine();
                        System.out.println("Digite seu complemento:");
                        String complemento = in.nextLine();
                        System.out.println("Digite o CRM:");
                        String crm = in.nextLine();
                        System.out.println("Digite sua especialidade:");
                        String especialidade = in.nextLine();
                        medicoService.atualizar(crm2, new Medico(nome, cpf, new Endereco(rua, bairro, cidade, estado, cep, numero, complemento), crm, especialidade));
                    } else if (yes_or_no == 2) {
                        continue;
                    } else {
                        System.out.println("Escolha invalida");
                    }
                }
            } else if (escolhaMedico == 4) {
                System.out.println("Digite o CRM do médico que será deletado:");
                String crm = in.nextLine();
                medicoService.deletar(crm);
            }
        } while (escolhaMedico != 5);
    }
    public static void main(String[] args) throws EnderecoException, EspecialException, NomeException, CRMException, CPFException {
        menuPrincipal();
    }
}