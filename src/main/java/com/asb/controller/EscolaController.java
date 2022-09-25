package com.asb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asb.model.CadastroEscolaModel;
import com.asb.serviceImpl.EscolaServiceImpl;

@RestController
@RequestMapping("asb/escola")
public class EscolaController {
	
	@Autowired
	private EscolaServiceImpl service;
	
	@GetMapping
	public ResponseEntity<List<CadastroEscolaModel>> findAll(){
		List<CadastroEscolaModel> cadastroEscolaModels = service.getAllCadastroEscolaModels();
		return  ResponseEntity.ok().body(cadastroEscolaModels);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<CadastroEscolaModel>getCadastroEscolaModelById(@PathVariable("id") long CadastroEscolaModelId) { 
		return new ResponseEntity<CadastroEscolaModel>(service.getCadastroEscolaModelById(CadastroEscolaModelId), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<CadastroEscolaModel> saveCadastroEscolaModel(@RequestBody CadastroEscolaModel cadastroEscolaModel){
		return new ResponseEntity<CadastroEscolaModel>(service.saveCadastroEscolaModel(cadastroEscolaModel), HttpStatus.CREATED);
	}
	
	
	@PutMapping("{id}")
	public ResponseEntity<CadastroEscolaModel> updateCadastroEscolaModel(@PathVariable("id") long id, 
			@RequestBody CadastroEscolaModel cadastroEscolaModel){
		return new ResponseEntity<CadastroEscolaModel>(service.updateCadastroEscolaModel(cadastroEscolaModel, id), HttpStatus.OK);
	}
	

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteCadastroEscolaModel(@PathVariable("id") long id){
		service.deleteCadastroEscolaModel(id);
		
		return new ResponseEntity<String>("Cadastro de Escola deletado com sucesso.", 
				HttpStatus.OK);
	}
	
}
