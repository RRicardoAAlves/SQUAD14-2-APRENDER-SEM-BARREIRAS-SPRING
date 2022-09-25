package com.asb.service;

import java.util.List;

import com.asb.model.CadastroEscolaModel;

public interface EscolaService {

	List<CadastroEscolaModel> getAllCadastroEscolaModels();
	CadastroEscolaModel getCadastroEscolaModelById(long id);
	CadastroEscolaModel saveCadastroEscolaModel(CadastroEscolaModel cadastroEscolaModel);
	CadastroEscolaModel updateCadastroEscolaModel(CadastroEscolaModel cadastroEscolaModel, long id);
	void deleteCadastroEscolaModel(long id);
}
