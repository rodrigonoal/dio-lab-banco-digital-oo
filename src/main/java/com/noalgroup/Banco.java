package com.noalgroup;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Banco {

	@Getter
	@Setter
	private String nome;

	private List<Conta> contas;

	@Getter
	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
