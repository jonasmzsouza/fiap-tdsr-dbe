package br.com.fiap.situacao;

import br.com.fiap.bean.Pedido;

public class Pago extends Situacao {

	@Override
	public void abrirChamado(Pedido pedido) {
		System.out.println("Chamado para logistica");
	}

	@Override
	public void entregar(Pedido pedido) {
		pedido.setSituacao(new Entregue());
	}

	@Override
	public void cancelar(Pedido pedido) {
		pedido.setSituacao(new Cancelado());
	}

}
