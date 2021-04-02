package br.com.fiap.situacao;

import br.com.fiap.interf.PedidoInterface;

public class Entregue extends Situacao {

	@Override
	public void abrirChamado(PedidoInterface pedido) {
		System.out.println("Chamado para pós venda");
	}

}
