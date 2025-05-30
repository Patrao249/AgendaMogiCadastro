package com.agendamogi.controller;

import com.agendamogi.model.Contato;
import com.agendamogi.repository.ContatoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/contatos")
public class ContatoController {

    private final ContatoRepository repository;

    public ContatoController(ContatoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("contato", new Contato());
        return "contatos/form";
    }

    @PostMapping("/salvar")
    public String salvar(Contato contato) {
        repository.save(contato);
        return "redirect:/contatos/listar";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("contatos", repository.findAll());
        return "contatos/listar";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("contato", repository.findById(id).orElseThrow());
        return "contatos/form";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/contatos/listar";
    }
}