package br.com.protegeTerra.Service;

import br.com.protegeTerra.Model.Desastre;
import java.util.Scanner;

public class DesastreService {

    public Desastre cadastrarDesastre(Scanner sc){

        System.out.println("Digite o endereço:");
        String endereco = sc.nextLine();

        System.out.println("Digite a descrição:");
        String descricao = sc.nextLine();

        System.out.println("Gravidade:");
        String gravidade = sc.nextLine();

        System.out.println("Tipo:");
        String tipo = sc.nextLine();

        return new Desastre(
                tipo,
                endereco,
                descricao,
                gravidade
        );
    }
}