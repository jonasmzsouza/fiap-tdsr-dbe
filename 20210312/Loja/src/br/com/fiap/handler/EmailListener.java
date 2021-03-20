package br.com.fiap.handler;

import br.com.fiap.bean.Pedido;

public class EmailListener implements PedidoListeners {

	@Override
	public void update(Pedido pedido) {
		System.out.println("Enviando e-mail...");
	}

}
