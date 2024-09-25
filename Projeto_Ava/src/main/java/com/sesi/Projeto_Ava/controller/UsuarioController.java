package com.sesi.Projeto_Ava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sesi.Projeto_Ava.model.Usuario;
import com.sesi.Projeto_Ava.repository.UsuarioRepository;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	@GetMapping("/tarefas")
	public String mostrarFormulario(Model modelo) {
		modelo.addAttribute("usuario", new Usuario());
		return "formulario";
	}
}
