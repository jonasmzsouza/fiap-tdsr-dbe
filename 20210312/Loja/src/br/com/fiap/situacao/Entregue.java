package br.com.fiap.situacao;

import br.com.fiap.bean.Pedido;

public class Entregue extends Situacao {

	@Override
	public void abrirChamado(Pedido pedido) {
		System.out.println("Chamado para pós venda");
	}

}
