package br.com.fiap.bean;

import java.math.BigDecimal;

import br.com.fiap.situacao.Aberto;
import br.com.fiap.situacao.Situacao;

public class Pedido {

	private BigDecimal valor;
	private int qtdItens;
	private Situacao situacao;

	public void abrirChamado() {
		this.situacao.abrirChamado(this);
	}

	public Pedido(BigDecimal valor) {
		super();
		this.valor = valor;
		this.qtdItens = 1;
		this.situacao = new Aberto();
	}

	public Pedido(BigDecimal valor, int qtdItens) {
		super();
		this.valor = valor;
		this.qtdItens = qtdItens;
		this.situacao = new Aberto();
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQtdItens() {
		return qtdItens;
	}

	public void pagar() {
		this.situacao.pagar(this);
	}

	public void entregar() {
		this.situacao.entregar(this);
	}

	public void cancelar() {
		this.situacao.cancelar(this);
	}

	public void reabrir() {
		this.situacao.reabrir(this);
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public Situacao getSituacao() {
		return situacao;
	}

}
