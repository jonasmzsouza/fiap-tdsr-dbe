package br.com.fiap.situacao;

import br.com.fiap.interf.PedidoInterface;

public class Cancelado extends Situacao {

	@Override
	public void abrirChamado(PedidoInterface pedido) {
		System.out.println("Chamado para comercial");
	}

	@Override
	public void reabrir(PedidoInterface pedido) {
		pedido.setSituacao(new Aberto());
	}

}
