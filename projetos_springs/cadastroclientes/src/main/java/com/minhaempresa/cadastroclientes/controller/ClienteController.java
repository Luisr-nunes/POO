package com.minhaempresa.cadastroclientes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.minhaempresa.cadastroclientes.model.Cliente; 
import com.minhaempresa.cadastroclientes.service.ClienteService;

import jakarta.validation.Valid;

@Controller
public class ClienteController {

    private final ClienteService service;

    // instância de ClienteService é injetada pelo Spring no controller
    public ClienteController(ClienteService service) {
        this.service = service;
    }

    // ponto de partida da aplicação (URL: /)
    //  Model: objeto usado para transportar dados do Controller para a View (HTML).
    @GetMapping("/")
    public String listar(Model model) {
       
	// empacota a lista de clientes em um model, para que a view 
        // (arquivo HTML) possa acessar os dados.
        model.addAttribute("clientes", service.listarTodos());
       

        // manda renderizar resources/templates/clientes.html
        // passando para esse html o model criado.
        return "clientes";
    }


    @PostMapping("/salvar")
    public String salvar(@Valid Cliente cliente, BindingResult result) {
        if (result.hasErrors()) {
            return "cliente-editar";
        }
        service.salvar(cliente);
        return "redirect:/";
    }
    
    // @PathVariable Long id --> Extrai o valor do ID da URL
    @GetMapping("/remover/{id}")
    public String remover(@PathVariable Long id) {
        service.remover(id);
        return "redirect:/";
    }
    

@GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("cliente", service.buscarPorId(id));
        return "cliente-editar";
    }   

 @GetMapping("/novo/")
    public String novo(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "cliente-editar";
    }

}