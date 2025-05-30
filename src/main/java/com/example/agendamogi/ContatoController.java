package com.example.agendamogi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/contatos")
public class ContatoController {

    @Autowired
    private ContatoRepository contatoRepository;

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("contato", new Contato());
        return "form";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Contato contato) {
        contatoRepository.save(contato);
        return "redirect:/contatos/listar";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("contatos", contatoRepository.findAll());
        return "lista";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Contato contato = contatoRepository.findById(id).orElseThrow();
        model.addAttribute("contato", contato);
        return "form";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        contatoRepository.deleteById(id);
        return "redirect:/contatos/listar";
    }
}
