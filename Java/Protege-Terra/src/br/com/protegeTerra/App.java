package br.com.protegeTerra;
import br.com.protegeTerra.Model.*;
import java.time.LocalDate;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 5) {

            System.out.println("\n ==================  PROTEGE TERRA  ================== ");
            System.out.println(" Menu de Opções:");
            System.out.println(" 1 - Reportar Desastre");
            System.out.println(" 2 - Antecipar Desastres");
            System.out.println(" 3 - Dicas!");
            System.out.println(" 4 - Numeros de emergencias");
            System.out.println(" 5 - Sair");
            System.out.println("Escolha a opção desejada (1 - 5):");

            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:

                    System.out.println("Digite o endereço do desastre:");
                    String enderecoDesastre = sc.nextLine();

                    System.out.println("Digite uma descrição:");
                    String descricao = sc.nextLine();
                    System.out.println("===== NÍVEL DE GRAVIDADE =====");
                    System.out.println("1 - Leve");
                    System.out.println("2 - Moderado");
                    System.out.println("3 - Grave");
                    System.out.println("4 - Crítico");

                    int opcaoGravidade = 0;
                    String gravidade = "";
                    switch (opcaoGravidade) {

                        case 1:
                            gravidade = "Leve";
                            break;

                        case 2:
                            gravidade = "Moderado";
                            break;

                        case 3:
                            gravidade = "Grave";
                            break;

                        case 4:
                            gravidade = "Crítico";
                            break;

                        default:
                            System.out.println("Opção inválida!");
                            gravidade = "Não informado";
                            break;
                    }
                    System.out.println("Digite a gravidade (1 - 4):");
                    int gravidade_opcao = sc.nextInt();

                    System.out.println("===== TIPOS DE DESASTRE =====");
                    System.out.println("1 - Deslizamento");
                    System.out.println("2 - Enchente");
                    System.out.println("3 - Incêndio");
                    System.out.println("4 - Terremoto");

                    int opcaoDesastre = sc.nextInt();
                    sc.nextLine();

                    String tipo = "";

                    switch (opcaoDesastre) {
                        case 1:
                            tipo = "Deslizamento";
                            break;

                        case 2:
                            tipo = "Enchente";
                            break;

                        case 3:
                            tipo = "Incêndio";
                            break;

                        case 4:
                            tipo = "Terremoto";
                            break;

                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }

                    Desastre desastre = new Desastre(
                            tipo,
                            enderecoDesastre,
                            descricao,
                            gravidade
                    );

                    System.out.println(desastre);

                    break;

                case 2:
                    //Terminar de fazer o sistema de api com satelites
                    System.out.println("TESTE-TESTE-TESTE");
                    break;

                case 3:
                    System.out.println(" 1 - Deslizamento \n 2 - Enchente \n 3 - Incêndio \n 4 - Terremoto");
                    System.out.println("Para qual desses desastres voce quer dicas? (1 - 4)");
                    int opcoes_dicas = sc.nextInt();

                    switch (opcoes_dicas) {
                        case 1:
                            System.out.println("Voce escolheu Deslizamento!");
                            System.out.println("Deseja dicas de um desastre que está acontecendo (1) ou que pode acontecer (2)?");
                            int opcao_dicas_deslizamento = sc.nextInt();
                            switch (opcao_dicas_deslizamento) {
                                case 1:
                                    System.out.println(" - Afaste-se imediatamente da área afetada.\n" +
                                            " - Procure abrigo em locais altos e seguros.\n" +
                                            " - Evite transitar em encostas instáveis.\n" +
                                            " - Siga as orientações da Defesa Civil.");
                                    break;
                                case 2:
                                    System.out.println(" - Não construa em áreas de risco, como encostas íngremes.\n" +
                                            " - Mantenha o solo drenado e livre de entulho.\n" +
                                            " - Fique atento a rachaduras no solo ou paredes.\n" +
                                            " - Participe de treinamentos comunitários de evacuação.");
                                    break;
                            }
                            break;

                        case 2:
                            System.out.println("Voce escolheu Enchente!");
                            System.out.println("Deseja dicas de um desastre que está acontecendo (1) ou que pode acontecer (2)?");
                            int opcao_dicas_enchente = sc.nextInt();
                            switch (opcao_dicas_enchente) {
                                case 1:
                                    System.out.println(" - Evite contato com a água, que pode estar contaminada.\n" +
                                            " - Desligue energia elétrica e gás.\n" +
                                            " - Procure abrigo em locais elevados.\n" +
                                            " - Não tente atravessar áreas alagadas.");
                                    break;
                                case 2:
                                    System.out.println(" - Não jogue lixo em bueiros ou rios.\n" +
                                            " - Tenha um kit de emergência pronto.\n" +
                                            " - Planeje rotas de evacuação seguras.\n" +
                                            " - Mantenha móveis e documentos importantes em locais altos.");
                                    break;
                            }
                            break;

                        case 3:
                            System.out.println("Voce escolheu Incêndio!");
                            System.out.println("Deseja dicas de um desastre que está acontecendo (1) ou que pode acontecer (2)?");
                            int opcao_dicas_incendio = sc.nextInt();
                            switch (opcao_dicas_incendio) {
                                case 1:
                                    System.out.println(" - Saia do local o mais rápido possível.\n" +
                                            " - Se houver fumaça, mantenha-se baixo.\n" +
                                            " - Nunca use elevadores.\n" +
                                            " - Cubra nariz e boca com pano úmido.\n" +
                                            " - Ligue para os bombeiros (193).\n" +
                                            " - Se suas roupas pegarem fogo, pare, deite-se e role.");
                                    break;
                                case 2:
                                    System.out.println(" - Instale detectores de fumaça.\n" +
                                            " - Tenha extintores em casa.\n" +
                                            " - Evite sobrecarregar tomadas.\n" +
                                            " - Guarde materiais inflamáveis em locais seguros.\n" +
                                            " - Planeje rotas de fuga.\n" +
                                            " - Mantenha números de emergência à mão.");
                                    break;
                            }
                            break;

                        case 4:
                            System.out.println("Voce escolheu Terremoto!");
                            System.out.println("Deseja dicas de um desastre que está acontecendo (1) ou que pode acontecer (2)?");
                            int opcao_dicas_terremoto = sc.nextInt();
                            switch (opcao_dicas_terremoto) {
                                case 1:
                                    System.out.println(" - Proteja-se embaixo de mesas resistentes.\n" +
                                            " - Afaste-se de janelas.\n" +
                                            " - Após o tremor, evite prédios danificados.\n" +
                                            " - Tenha cuidado com réplicas.");
                                    break;
                                case 2:
                                    System.out.println(" - Tenha um kit de emergência.\n" +
                                            " - Saiba pontos seguros dentro de casa.\n" +
                                            " - Participe de treinamentos de evacuação.\n" +
                                            " - Fixe móveis pesados nas paredes.");
                                    break;
                            }
                            break;
                    }
                    break;

                case 4:
                    System.out.println("===== NÚMEROS DE EMERGÊNCIA =====");

                    System.out.println("\nENCHENTE:");
                    System.out.println(" - Defesa Civil: 199");
                    System.out.println(" - Bombeiros: 193");

                    System.out.println("\nTERREMOTO:");
                    System.out.println(" - Defesa Civil: 199");
                    System.out.println(" - SAMU: 192");

                    System.out.println("\nDESLIZAMENTO:");
                    System.out.println(" - Defesa Civil: 199");
                    System.out.println(" - Bombeiros: 193");

                    System.out.println("\nINCÊNDIO:");
                    System.out.println(" - Bombeiros: 193");
                    System.out.println(" - Polícia: 190");

                    System.out.println("\nEMERGÊNCIA MÉDICA:");
                    System.out.println(" - SAMU: 192");

                    break;


                case 5:
                    System.out.println("Saindo do sistema. Obrigado por usar o Protege Terra!");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        sc.close();
    }
}
