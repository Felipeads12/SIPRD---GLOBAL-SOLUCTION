package br.com.protegeTerra.Service;

import br.com.protegeTerra.Model.Cliente;
import br.com.protegeTerra.Repository.ClienteRepository;

import java.util.Scanner;

public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService() {
        this.clienteRepository = new ClienteRepository();
    }

    public Cliente login(String cpf, String senha) {

        for (Cliente cliente : clienteRepository.listarClientes()) {

            if (cliente.getCpf().equals(cpf)
                    && cliente.getSenha().equals(senha)) {

                return cliente;
            }
        }

        return null;
    }

    public Cliente cadastrarCliente(Scanner sc) {

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Endereço: ");
        String endereco = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        if (clienteRepository.buscarPorCpf(cpf) != null) {

            System.out.println("CPF já cadastrado!");

            return null;
        }

        System.out.print("Telefone: ");
        String telefone = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        Cliente cliente = new Cliente(
                nome,
                endereco,
                cpf,
                telefone,
                senha
        );

        clienteRepository.salvar(cliente);

        return cliente;
    }
    }
