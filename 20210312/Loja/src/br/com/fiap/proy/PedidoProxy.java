package br.com.fiap.proy;

import java.math.BigDecimal;

import br.com.fiap.bean.Pedido;
import br.com.fiap.interf.PedidoInterface;
import br.com.fiap.situacao.Situacao;

public class PedidoProxy implements PedidoInterface {

	private Pedido pedido;
	private String endereco;

	public PedidoProxy(Pedido pedido) {
		super();
		this.pedido = pedido;
	}

	public String getEndereco() {
		if (endereco == null) {
			endereco = pedido.getEndereco();
		}
		return endereco;
	}

	public void abrirChamado() {
		pedido.abrirChamado();
	}

	public BigDecimal getValor() {
		return pedido.getValor();
	}

	public int getQtdItens() {
		return pedido.getQtdItens();
	}

	public void pagar() {
		pedido.pagar();
	}

	public void entregar() {
		pedido.entregar();
	}

	public void cancelar() {
		pedido.cancelar();
	}

	public void reabrir() {
		pedido.reabrir();
	}

	public void setSituacao(Situacao situacao) {
		pedido.setSituacao(situacao);
	}

	public Situacao getSituacao() {
		return pedido.getSituacao();
	}

}
