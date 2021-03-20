package br.com.fiap.situacao;

import br.com.fiap.bean.Pedido;

public class Cancelado extends Situacao {

	@Override
	public void abrirChamado(Pedido pedido) {
		System.out.println("Chamado para comercial");
	}

	@Override
	public void reabrir(Pedido pedido) {
		pedido.setSituacao(new Aberto());
	}

}
