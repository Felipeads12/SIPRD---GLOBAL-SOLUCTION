
print(" ===== Menu ===== ")
print("Opções : \n 1 - Registrar Desastre \n 2 - Antecipar Desastre \n 3 - Sair")
opcao = int(input("Digite a opção que deseja escolher (1 - 3): "))

def escolha_match (opcao):
    match opcao:
        case 1:
            print("Voce escolheu REGISTRAR DESASTRE!")

            nome = input("Digite seu nome:")
            endereco = input("Digite seu endereco:")

            print("===== Opções de desastres =====")
            print(" 1 - Deslizamento \n 2 - Incendio \n 3 - Terremoto \n 4 - Enchente")
            opcoes_desastres = int(input("Digite a opção de desastre (1 - 4): "))

            def match_desastres (opcoes_desastres):

                match opcoes_desastres:
                    case 1:
                        print("Voce escolheu Deslizamento!")
