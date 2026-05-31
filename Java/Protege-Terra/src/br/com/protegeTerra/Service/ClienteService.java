package br.com.protegeTerra.Service;

import br.com.protegeTerra.Model.Cliente;
import java.util.Scanner;

public class ClienteService {

    public Cliente cadastrarCliente(Scanner sc){

        System.out.println("Nome:");
        String nome = sc.nextLine();

        System.out.println("CPF:");
        String cpf = sc.nextLine();

        System.out.println("Endereço:");
        String endereco = sc.nextLine();

        System.out.println("Telefone:");
        String telefone = sc.nextLine();

        return new Cliente(nome, endereco, cpf, telefone);
    }
}