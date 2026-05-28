package br.com.protegeTerra;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ==================  PROTEGE TERRA  ================== ");
        System.out.println(" Menu de Opções: \n 1 - Reportar Desastre \n 2 - Antecipar Desastres \n 3 - Dicas! \n 4 - Numeros de emergencias \n 5 - Sair ");
        System.out.println("Escolha a opção desejada (1 - 5):");
        int opcao = sc.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Digite seu nome:");
                String nome = sc.nextLine();

                System.out.println("Digite seu cpf:");
                String cpf = sc.nextLine();

                System.out.println("Digite seu endereço:");
                String endereco = sc.nextLine();

                System.out.println(" ===== Opções de Desastres ===== ");
                System.out.println(" 1 - Deslizamento \n 2 - Enchente \n 3 - Incêndio \n 4 - Terremoto");
                System.out.println("Digite a opção desejada (1 - 4)");
                int opcao_desastre = sc.nextInt();
                switch (opcao_desastre){
                    case 1:
                        System.out.println("Voce escolheu Deslizamento!");
                    case 2:
                        System.out.println("Voce escolheu Enchente!");
                    case 3:
                        System.out.println("Voce escolheu Incêndio!");
                    case 4:
                        System.out.println("Voce escolheu terremoto!");
                }

            case 2:
                //Terminar de fazer o sistema de api com satelites
                System.out.println("TESTE-TESTE-TESTE");
            case 3:
                System.out.println(" 1 - Deslizamento \n 2 - Enchente \n 3 - Incêndio \n 4 - Terremoto");
                System.out.println("Para qual desses desastres voce quer dicas? (1 - 4)");
                int opcoes_dicas = sc.nextInt();
                switch (opcoes_dicas) {
                    case 1:
                        System.out.println("Voce escolheu Deslizamento!");
                        System.out.println("Deseja dicas de um desastre que já aconteceu (1) ou que pode acontecer (2)?");
                        int opcao_dicas_deslizamento = sc.nextInt();
                        switch (opcao_dicas_deslizamento){
                            case 1 :
                                System.out.println("Não construa em áreas de risco, como encostas íngremes.\n" +
                                        "\n" +
                                        "Mantenha o solo drenado e livre de entulho.\n" +
                                        "\n" +
                                        "Fique atento a rachaduras no solo ou paredes.\n" +
                                        "\n" +
                                        "Participe de treinamentos comunitários de evacuação.");
                            case 2 :
                                System.out.println(" - Afaste-se imediatamente da área afetada.\n" +
                                        "\n" +
                                        " - Procure abrigo em locais altos e seguros.\n" +
                                        "\n" +
                                        " - Evite transitar em encostas instáveis.\n" +
                                        "\n" +
                                        " - Siga as orientações da Defesa Civil.");
                        }
                        break;
                    case 2:
                        System.out.println("Voce escolheu Enchente!");
                        System.out.println("Deseja dicas de um desastre que já aconteceu (1) ou que pode acontecer (2)?");
                        int opcao_dicas_enchente = sc.nextInt();
                        break;
                    case 3:
                        System.out.println("Voce escolheu Incêndio!");
                        System.out.println("Deseja dicas de um desastre que já aconteceu (1) ou que pode acontecer (2)?");
                        int opcao_dicas_incendio = sc.nextInt();
                        switch (opcao_dicas_incendio){
                            case 1:
                                System.out.println(" - Saia do local o mais rápido possível, seguindo rotas de evacuação seguras.\n" +
                                        "\n" +
                                        " - Se houver fumaça, mantenha-se baixo, próximo ao chão, onde o ar é mais limpo.\n" +
                                        "\n" +
                                        " - Nunca use elevadores, apenas escadas.\n" +
                                        "\n" +
                                        " - Cubra nariz e boca com pano úmido para reduzir a inalação de fumaça.\n" +
                                        "\n" +
                                        " - Ligue imediatamente para os bombeiros (193) e siga as instruções das autoridades.\n" +
                                        "\n" +
                                        " - Se suas roupas pegarem fogo, pare, deite-se no chão e role para apagar as chamas.");
                            case 2:
                                System.out.println(" - Instale detectores de fumaça e verifique regularmente se estão funcionando.\n" +
                                        "\n" +
                                        " - Tenha extintores de incêndio em casa e saiba como usá-los.\n" +
                                        "\n" +
                                        " - Evite sobrecarregar tomadas e extensões elétricas.\n" +
                                        "\n" +
                                        " - Guarde materiais inflamáveis (álcool, gasolina, papel) em locais seguros e longe de fontes de calor.\n" +
                                        "\n" +
                                        " - Planeje rotas de fuga e faça simulações com sua família.\n" +
                                        "\n" +
                                        " - Mantenha números de emergência sempre à mão.");
                        }
                        break;
                    case 4:
                        System.out.println("Voce escolheu terremoto!");
                        System.out.println("Deseja dicas de um desastre que já aconteceu (1) ou que pode acontecer (2)?");
                        int opcao_dicas_terremoto = sc.nextInt();
                        break;
                }
        }

    }
}
