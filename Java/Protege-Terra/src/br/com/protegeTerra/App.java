package br.com.protegeTerra;

import br.com.protegeTerra.Model.Cliente;
import br.com.protegeTerra.Model.Desastre;
import br.com.protegeTerra.Model.Relatorio;
import br.com.protegeTerra.Service.ClienteService;
import br.com.protegeTerra.Service.DesastreService;
import br.com.protegeTerra.Service.DicasService;
import br.com.protegeTerra.Service.EmergenciaService;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ClienteService clienteService = new ClienteService();
        DesastreService desastreService = new DesastreService();

        Cliente clienteLogado = null;

        int opcao = 0;

        while (opcao != 5) {

            System.out.println("\n================== PROTEGE TERRA ==================");
            System.out.println("1 - Reportar Desastre");
            System.out.println("2 - Antecipar Desastres");
            System.out.println("3 - Dicas");
            System.out.println("4 - Números de Emergência");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    if (clienteLogado == null) {

                            System.out.println("\n⚠ Você precisa estar cadastrado para reportar um desastre.");

                            System.out.println("1 - Fazer Cadastro");
                            System.out.println("2 - Fazer Login");
                            System.out.println("3 - Voltar");

                            int opcaoCadastro = sc.nextInt();
                            sc.nextLine();

                            if (opcaoCadastro == 1) {

                                clienteLogado = clienteService.cadastrarCliente(sc);

                                System.out.println("\nCadastro realizado com sucesso!");
                                System.out.println("Bem-vindo, " + clienteLogado.getNome());

                            } else if (opcaoCadastro == 2) {

                                System.out.print("CPF: ");
                                String cpf = sc.nextLine();

                                System.out.print("Senha: ");
                                String senha = sc.nextLine();

                                clienteLogado = clienteService.login(cpf, senha);

                                if (clienteLogado != null) {
                                    System.out.println("Login realizado com sucesso!");
                                } else {
                                    System.out.println("CPF ou senha inválidos.");
                                    break;
                                }

                            } else {
                                break;
                            }
                        }

                    Desastre desastre = desastreService.cadastrarDesastre(sc);

                    Relatorio.gerarRelatorio(clienteLogado, desastre);

                    break;

                case 2:

                    System.out.println("\nSistema de antecipação de desastres em desenvolvimento.");
                    break;

                case 3:

                    DicasService.mostrarDicas();
                    break;

                case 4:

                    EmergenciaService.mostrarNumeros();
                    break;

                case 5:

                    System.out.println("\nObrigado por utilizar o Protege Terra!");
                    break;

                default:

                    System.out.println("\nOpção inválida!");
                    break;
            }
        }

        sc.close();
    }
}