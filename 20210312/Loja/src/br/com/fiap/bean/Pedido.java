package br.com.fiap.bean;

import java.math.BigDecimal;

public class Pedido {

	private BigDecimal valor;
	private int qtdItens;

	public Pedido(BigDecimal valor) {
		super();
		this.valor = valor;
		this.qtdItens = 1;
	}

	public Pedido(BigDecimal valor, int qtdItens) {
		super();
		this.qtdItens = qtdItens;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQtdItens() {
		return qtdItens;
	}

}
