package com.asb.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "razao_social", nullable = false)
	private String razaoSocial;
	
	@Column(name = "cnpj", nullable = false)
	private String cnpj;
	
	@Column(name = "endereco_rua", nullable = false)
	private String enderecoRua;
	
	@Column(name = "endereco_numero", nullable = false)
	private int enderecoNumero;
	
	@Column(name = "endereco_bairro", nullable = false)
	private String enderecoBairro;
	
	@Column(name = "endereco_complemento", nullable = true)
	private String enderecoComplemento;
	
	@Column(name = "cep", nullable = false)
	private String cep;
	
	@Column(name = "cidade", nullable = false)
	private String cidade;
	
	@Column(name = "estado", nullable = false)
	private String estado;
	
	@Column(name = "nome_representante", nullable = false)
	private String nomeRepresentante;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "telefone_contato", nullable = false)
	private String telefoneContato;
	

	public Empresa() {
		super();
	}


	public Empresa(long id, String razaoSocial, String cnpj, String enderecoRua, int enderecoNumero,
			String enderecoBairro, String enderecoComplemento, String cep, String cidade, String estado,
			String nomeRepresentante, String email, String telefoneContato) {
		super();
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.enderecoRua = enderecoRua;
		this.enderecoNumero = enderecoNumero;
		this.enderecoBairro = enderecoBairro;
		this.enderecoComplemento = enderecoComplemento;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.nomeRepresentante = nomeRepresentante;
		this.email = email;
		this.telefoneContato = telefoneContato;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}


	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getEnderecoRua() {
		return enderecoRua;
	}


	public void setEnderecoRua(String enderecoRua) {
		this.enderecoRua = enderecoRua;
	}


	public int getEnderecoNumero() {
		return enderecoNumero;
	}


	public void setEnderecoNumero(int enderecoNumero) {
		this.enderecoNumero = enderecoNumero;
	}


	public String getEnderecoBairro() {
		return enderecoBairro;
	}


	public void setEnderecoBairro(String enderecoBairro) {
		this.enderecoBairro = enderecoBairro;
	}


	public String getEnderecoComplemento() {
		return enderecoComplemento;
	}


	public void setEnderecoComplemento(String enderecoComplemento) {
		this.enderecoComplemento = enderecoComplemento;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getNomeRepresentante() {
		return nomeRepresentante;
	}


	public void setNomeRepresentante(String nomeRepresentante) {
		this.nomeRepresentante = nomeRepresentante;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefoneContato() {
		return telefoneContato;
	}


	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		return id == other.id;
	}


	@Override
	public String toString() {
		return "Empresa [id=" + id + ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", enderecoRua=" + enderecoRua
				+ ", enderecoNumero=" + enderecoNumero + ", enderecoBairro=" + enderecoBairro + ", enderecoComplemento="
				+ enderecoComplemento + ", cep=" + cep + ", cidade=" + cidade + ", estado=" + estado
				+ ", nomeRepresentante=" + nomeRepresentante + ", email=" + email + ", telefoneContato="
				+ telefoneContato + "]";
	}
	
	
	
	

}
