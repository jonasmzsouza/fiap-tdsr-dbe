package br.com.fiap.bean;

import java.math.BigDecimal;

import br.com.fiap.handler.PedidoHandler;
import br.com.fiap.interf.PedidoInterface;
import br.com.fiap.situacao.Aberto;
import br.com.fiap.situacao.Situacao;

public class Pedido implements PedidoInterface {

	private BigDecimal valor;
	private int qtdItens;
	private Situacao situacao;
	public PedidoHandler handler;

	@Override
	public String getEndereco() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		};
		return "Rua 123, São Paulo - SP";
	}

	@Override
	public void abrirChamado() {
		this.situacao.abrirChamado(this);
	}

	public Pedido(BigDecimal valor) {
		super();
		this.valor = valor;
		this.qtdItens = 1;
		this.situacao = new Aberto();
		this.handler = new PedidoHandler();
	}

	public Pedido(BigDecimal valor, int qtdItens) {
		super();
		this.valor = valor;
		this.qtdItens = qtdItens;
		this.situacao = new Aberto();
		this.handler = new PedidoHandler();
	}

	@Override
	public BigDecimal getValor() {
		return valor;
	}

	@Override
	public int getQtdItens() {
		return qtdItens;
	}

	@Override
	public void pagar() {
		this.situacao.pagar(this);
	}

	@Override
	public void entregar() {
		this.situacao.entregar(this);
	}

	@Override
	public void cancelar() {
		this.situacao.cancelar(this);
	}

	@Override
	public void reabrir() {
		this.situacao.reabrir(this);
	}

	@Override
	public void setSituacao(Situacao situacao) {
		handler.notifyAll(this);
		this.situacao = situacao;
	}

	@Override
	public Situacao getSituacao() {
		return situacao;
	}

}
