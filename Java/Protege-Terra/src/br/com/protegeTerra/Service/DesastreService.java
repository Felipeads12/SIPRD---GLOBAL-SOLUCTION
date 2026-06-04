package br.com.protegeTerra.Service;

import br.com.protegeTerra.Model.Desastre;
import br.com.protegeTerra.Repository.DesastreRepository;

import java.util.Scanner;

public class DesastreService {

    private DesastreRepository desastreRepository;

    public DesastreService() {
        this.desastreRepository = new DesastreRepository();
    }

    public Desastre cadastrarDesastre(Scanner sc) {

        System.out.println(" ========== Registro Desastre ==========");

        System.out.print("Digite o endereço: ");
        String endereco = sc.nextLine();

        System.out.print("Digite a descrição: ");
        String descricao = sc.nextLine();

        System.out.print("Gravidade: ");
        String gravidade = sc.nextLine();

        System.out.print("Tipo: ");
        String tipo = sc.nextLine();

        Desastre desastre = new Desastre(
                tipo,
                endereco,
                descricao,
                gravidade
        );

        desastreRepository.salvar(desastre);

        return desastre;
    }

    public void listarDesastres() {

        if (desastreRepository.listar().isEmpty()) {

            System.out.println("\nNenhum desastre cadastrado.");
            return;
        }

        System.out.println("\n===== DESASTRES CADASTRADOS =====");

        for (Desastre desastre : desastreRepository.listar()) {

            System.out.println("-----------------------------");
            System.out.println("Tipo: " + desastre.getTipo());
            System.out.println("Endereço: " + desastre.getEndereco());
            System.out.println("Descrição: " + desastre.getDescricao());
            System.out.println("Gravidade: " + desastre.getGravidade());
        }
    }
}