package com.asb.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asb.exception.ResourceNotFoundException;
import com.asb.model.Empresa;
import com.asb.repositories.EmpresaRepository;
import com.asb.service.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService {

	@Autowired
	private EmpresaRepository empresaRepository;

	
	@Override
	public List<Empresa>getAllEmpresas() { 
		return empresaRepository.findAll();
}

	@Override
	public Empresa getEmpresaById(long id) { 
		return empresaRepository.findById(id).orElseThrow(() -> 
			new ResourceNotFoundException("empresas", "id", id));
}

	@Override
	public Empresa saveEmpresa(Empresa empresa) { 
		return empresaRepository.save(empresa);
}
	@Override
	public Empresa updateEmpresa(Empresa empresa, long id) { 
		
		Empresa empresaExistente = empresaRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Empresa", "id", id));
		
		empresaExistente.setRazaoSocial(empresa.getRazaoSocial());
		empresaExistente.setCnpj(empresa.getCnpj());
		empresaExistente.setEnderecoRua(empresa.getEnderecoRua());
		empresaExistente.setEnderecoNumero(empresa.getEnderecoNumero());
		empresaExistente.setEnderecoBairro(empresa.getEnderecoBairro());
		empresaExistente.setEnderecoComplemento(empresa.getEnderecoComplemento());
		empresaExistente.setCep(empresa.getCep());
		empresaExistente.setCidade(empresa.getCidade());
		empresaExistente.setEstado(empresa.getEstado());
		empresaExistente.setNomeRepresentante(empresa.getNomeRepresentante());
		empresaExistente.setEmail(empresa.getEmail());
		empresaExistente.setTelefoneContato(empresa.getTelefoneContato());
		
		empresaRepository.save(empresaExistente);
		return empresaExistente;
	}
	
	@Override
	public void deleteEmpresa(long id) { 
		empresaRepository.findById(id).orElseThrow(() -> 
				new ResourceNotFoundException("Empresa", "id", id));
		
		empresaRepository.deleteById(id);
	}
	
}
