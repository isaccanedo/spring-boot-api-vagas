package com.isac.canedo.apivagas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isac.canedo.apivagas.dominio.VagasDominio;
import com.isac.canedo.apivagas.repository.VagasRepository;

@RestController
@RequestMapping("/vagas")
@CrossOrigin(origins = "*")
public class VagasController {

	@Autowired
	VagasRepository vagasRepository;

	@GetMapping("/listar")
	public Iterable<VagasDominio> listarVagas() {
		return vagasRepository.findAll();
	}

}
