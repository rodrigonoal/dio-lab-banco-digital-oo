package com.noalgroup;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Banco {

	@Getter
	@Setter
	private String nome;

	@Getter
	private List<Conta> contas;

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
