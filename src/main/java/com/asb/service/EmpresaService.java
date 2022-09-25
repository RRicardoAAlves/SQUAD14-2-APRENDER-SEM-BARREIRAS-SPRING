package com.asb.service;

import java.util.List;

import com.asb.model.Empresa;

public interface EmpresaService {
	
	List<Empresa>getAllEmpresas();
	Empresa getEmpresaById(long id);
	Empresa saveEmpresa(Empresa empresa);
	Empresa updateEmpresa(Empresa empresa, long id);
	void deleteEmpresa(long id);

}
