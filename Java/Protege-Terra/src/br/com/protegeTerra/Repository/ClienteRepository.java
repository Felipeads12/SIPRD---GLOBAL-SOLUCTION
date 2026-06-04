package br.com.protegeTerra.Repository;

import br.com.protegeTerra.Model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {

    private List<Cliente> clientes;

    public ClienteRepository() {
        clientes = new ArrayList<>();
    }

    public void salvar(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }

    public Cliente buscarPorCpf(String cpf) {

        for (Cliente cliente : clientes) {

            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }

        return null;
    }
}