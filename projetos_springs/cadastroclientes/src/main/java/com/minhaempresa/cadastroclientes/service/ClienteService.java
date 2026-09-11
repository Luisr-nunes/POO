package com.minhaempresa.cadastroclientes.service;

import com.minhaempresa.cadastroclientes.model.Cliente;
import com.minhaempresa.cadastroclientes.repository.ClienteRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }

    public Cliente buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    public void remover(Long id) {
        repository.deleteById(id);
    }
}
