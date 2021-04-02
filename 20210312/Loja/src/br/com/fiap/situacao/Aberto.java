package br.com.fiap.situacao;

import br.com.fiap.interf.PedidoInterface;

public class Aberto extends Situacao {

	@Override
	public void abrirChamado(PedidoInterface pedido) {
		System.out.println("Chamado para financeiro");
	}

	@Override
	public void pagar(PedidoInterface pedido) {
		pedido.setSituacao(new Pago());
	}

	@Override
	public void cancelar(PedidoInterface pedido) {
		pedido.setSituacao(new Cancelado());
	}

}
