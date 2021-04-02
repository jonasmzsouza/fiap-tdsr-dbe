package br.com.fiap.handler;

import br.com.fiap.interf.PedidoInterface;

public class EmailListener implements PedidoListeners {

	@Override
	public void update(PedidoInterface pedido) {
		System.out.println("Enviando e-mail...");
	}

}
