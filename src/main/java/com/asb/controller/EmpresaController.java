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

import com.asb.model.Empresa;
import com.asb.serviceImpl.EmpresaServiceImpl;

@RestController
@RequestMapping("asb/empresa")
public class EmpresaController {

	@Autowired
	private EmpresaServiceImpl service;
	
	@GetMapping
	public ResponseEntity<List<Empresa>> findAll() { 
		List<Empresa> empresas = service.getAllEmpresas();
		return ResponseEntity.ok().body(empresas);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Empresa> getEmpresaById(@PathVariable("id") long EmpresaId) { 
		return new ResponseEntity<Empresa>(service.getEmpresaById(EmpresaId), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Empresa> saveEmpresa(@RequestBody Empresa empresa) {
		return new ResponseEntity<Empresa>(service.saveEmpresa(empresa), HttpStatus.CREATED);
	}
	@PutMapping("{id}")
	public ResponseEntity<Empresa> updateEmpresa(@PathVariable("id") long id, 
			@RequestBody Empresa empresa){
		return new ResponseEntity<Empresa>(service.updateEmpresa(empresa, id), HttpStatus.OK);
	}
	
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmpresa(@PathVariable("id") long id){
		service.deleteEmpresa(id);
		
		return new ResponseEntity<String>("Empresa deletada com sucesso.", 
				HttpStatus.OK);
	}
	
}

