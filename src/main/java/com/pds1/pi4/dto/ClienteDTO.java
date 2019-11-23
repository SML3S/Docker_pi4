package com.pds1.pi4.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import com.pds1.pi4.entidades.Cliente;

public class ClienteDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@NotEmpty(message= "O campo não pode esta vazio")
	private String nome;
	
	@NotEmpty(message= "O campo não pode esta vazio")
	private String cpf;
	
	@NotEmpty(message= "O campo não pode esta vazio")
	private String end;
	
	@NotEmpty(message= "O campo não pode esta vazio")
	@Email(message= "Email invalido")
	private String email;
	private String tel;
	
	public ClienteDTO() {
		
	}

	
	
	public ClienteDTO(Long id, String nome, String cpf, String end, String email, String tel) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.end = end;
		this.email = email;
		this.tel = tel;
	}



	public ClienteDTO(Cliente objCli) {
		
		this.id = objCli.getId();
		this.nome = objCli.getNome();
		this.cpf = objCli.getCpf();
		this.end = objCli.getEnd();
		this.email = objCli.getEmail();
		this.tel = objCli.getTel();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getEnd() {
		return end;
	}



	public void setEnd(String end) {
		this.end = end;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}



	public void setTel(String tel) {
		this.tel = tel;
	}
		
	public Cliente toEntity() {
		return new Cliente(id, nome, cpf, end, email, tel)
				;
	}
}
